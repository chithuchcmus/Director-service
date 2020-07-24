package vn.com.director.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.director.api.GetStatusRequest;
import vn.com.director.api.GetStatusResponse;
import vn.com.director.api.ProcessRequest;
import vn.com.director.api.ProcessResponse;
import vn.com.director.cache.CacheClient;
import vn.com.director.client.gateway.GatewayClient;
import vn.com.director.config.GateWayConfig;
import vn.com.director.dto.GatewayDataDTO;
import vn.com.director.dto.GetStatusResponseDataDTO;
import vn.com.director.dto.StatusCallbackMessage;
import vn.com.director.dto.Trans;
import vn.com.director.eums.StatusEnum;
import vn.com.director.queue.external.ResultMessageWebBackendProducer;
import vn.com.director.queue.internal.GetStatusSender;
import vn.com.director.queue.internal.ProcessorSender;
import vn.com.director.util.EnumUtils;
import vn.com.director.util.JsonUtils;
import vn.com.director.util.SecurityUtils;

@Slf4j
@Service
public class DirectorProcessorImpl implements DirectorProcessor {

    @Autowired
    private GatewayClient aiClient;

    @Autowired
    private GateWayConfig gateWayConfig;

    @Autowired
    private CacheClient cacheClient;

    @Autowired
    private GetStatusSender getStatusSender;

    @Autowired
    private ProcessorSender processorSender;

    @Autowired
    private ResultMessageWebBackendProducer webBackendProducer;

    @Override
    public void callAIService(Trans trans) {
        try {
            trans.setProgressEnum(EnumUtils.getProgressEnum(trans.popFirstServiceType()));
            trans.setProgressStatusEnum(StatusEnum.PROCESSING);
            ProcessRequest request = buildRequest(trans);
            log.info("DirectorProcessorImpl.callAIService request: ", JsonUtils.printProtoLenient(request));
            ProcessResponse response = aiClient.process(request);
            log.info("DirectorProcessorImpl.callAIService response: ", JsonUtils.printProtoLenient(response));
            if (response.getReturnCode() != StatusEnum.PROCESSING.getCode()) {
                log.info("DirectorProcessorImpl.callAIService error, transID:{}, processEnum: {}, response {}", trans.getTransID(), trans.getProgressEnum(), response.getReturnCode());
                trans.setStatus(StatusEnum.CALL_GATE_WAY_RESPONSE_ERROR);
                trans.setProgressStatusEnum(StatusEnum.CALL_GATE_WAY_RESPONSE_ERROR);
                return;
            }
            log.info("DirectorProcessorImpl.callAIService get status AI, processEnum: {}, transID {}", trans.getProgressEnum(), trans.getTransID());
            trans.setGateWayTransID(response.getTransId());
            getStatusSender.sendMessage(trans);
        } catch (Exception e) {
            log.error("DirectorProcessorImpl.callAIService exception, at processEnum :{}, exception", trans.getProgressEnum(), e);
            trans.setStatus(StatusEnum.EXCEPTION);
        } finally {
            if (!trans.isProcessing()) {
                cacheClient.saveTrans(trans);
            }
            if (trans.getProgressStatusEnum() != StatusEnum.PROCESSING) {
                sendCallbackStatus(trans);
            }
        }

    }

    @Override
    public void getStatusAIProcess(Trans trans) {
        try {
            GetStatusRequest request = buildStatusRequest(trans);
            log.info("DirectorProcessorImpl.getStatusAIProcess request: {}", JsonUtils.printProtoLenient(request));
            GetStatusResponse statusResponse = aiClient.getStatus(request);
            if (statusResponse.getReturnCode() != StatusEnum.SUCCESS.getCode()) {
                if (statusResponse.getReturnCode() != StatusEnum.PROCESSING.getCode()) {
                    log.info("DirectorProcessorImpl.getStatusAIProcess call Gate status error, transID:{}, processEnum: {}", trans.getTransID(), trans.getProgressEnum());
                    trans.setTwoStatus(StatusEnum.GET_STATUS_GATE_WAY_RESPONSE_ERROR);
                    return;
                }
                int numberRetry = trans.getNumberRetry(trans.getProgressEnum());
                if (numberRetry >= gateWayConfig.getNumberRetry()) {
                    log.info("DirectorProcessorImpl.getStatusAIProcess max retry, transID:{}, processEnum: {}", trans.getTransID(), trans.getProgressEnum());
                    trans.setTwoStatus(StatusEnum.MAX_RETRY_GET_STATUS_GATE_WAY);
                    return;
                }
                trans.increaseNumberRetry(trans.getProgressEnum());
                log.info("DirectorProcessorImpl.getStatusAIProcessretry, transID:{}, processEnum: {}, numberRetry {}",
                        trans.getTransID(), trans.getProgressEnum(), trans.getNumberRetry(trans.getProgressEnum()));
                getStatusSender.sendMessage(trans);
                return;
            }
            GetStatusResponseDataDTO gatewayDataDTO = JsonUtils.parseGson(statusResponse.getData(), GetStatusResponseDataDTO.class);
            trans.setProgressStatusEnum(StatusEnum.SUCCESS);
            trans.getMappingResultWithMedia().put(trans.getProgressEnum(), gatewayDataDTO.getId());
            if (trans.getListService().isEmpty()) {
                log.info("DirectorProcessorImpl.getStatusAIProcess successful: trans{} ", JsonUtils.printGson(trans));
                trans.setStatus(StatusEnum.SUCCESS);
                trans.setGatewayResult(gatewayDataDTO.getId());
                return;
            }
            processorSender.sendMessage(trans);
        } catch (Exception e) {
            log.error("DirectorProcessorImpl.getStatusAIProcess exception, at processEnum :{}, exception", trans.getProgressEnum(), e);
            trans.setTwoStatus(StatusEnum.EXCEPTION);
        } finally {
            if (!trans.isProcessing()) {
                cacheClient.saveTrans(trans);
            }
            if (trans.getProgressStatusEnum() != StatusEnum.PROCESSING) {
                sendCallbackStatus(trans);
            }
        }
    }

    protected ProcessRequest buildRequest(Trans trans) {
        ProcessRequest.Builder request = ProcessRequest.newBuilder();
        GatewayDataDTO dataDTO = GatewayDataDTO.builder()
                .eventType(trans.getProgressEnum().getValue())
                .id(trans.getIdMedia())
                .build();
        request.setClientId(gateWayConfig.getClientID());
        String stringDataDto = JsonUtils.printGson(dataDTO);
        request.setData(stringDataDto);
        log.info("string data dto :{}", stringDataDto);
        long currentTime = System.currentTimeMillis();
        request.setRequestDate(currentTime);
        request.setSig(SecurityUtils.buildSig(gateWayConfig.getClientID(), currentTime, gateWayConfig.getClientKey()));
        return request.build();
    }

    protected GetStatusRequest buildStatusRequest(Trans trans) {
        return GetStatusRequest.newBuilder()
                .setTransId(trans.getGateWayTransID()).build();
    }

    protected void sendCallbackStatus(Trans trans) {
        try {
            StatusCallbackMessage statusCallbackMessage = StatusCallbackMessage.builder().build();
            statusCallbackMessage.setTaskID(trans.getRequestID());
            statusCallbackMessage.setStatus(trans.getProgressStatusEnum().getCode());
            statusCallbackMessage.setMessage(trans.getProgressStatusEnum().getDescription());
            statusCallbackMessage.setServiceType(trans.getProgressEnum().name());
            if (trans.getGatewayResult() != null) {
                statusCallbackMessage.setResult(trans.getGatewayResult());
            }
            webBackendProducer.sendMessage(statusCallbackMessage);
        } catch (Exception e) {
            log.error("DirectorProcessorImpl.sendCallbackStatus exception", e);
        }

    }

}
