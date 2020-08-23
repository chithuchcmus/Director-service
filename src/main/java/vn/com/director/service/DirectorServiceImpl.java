package vn.com.director.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.director.api.DirectRequest;
import vn.com.director.api.DirectResponse;
import vn.com.director.api.ServiceType;
import vn.com.director.api.StatusDirectRequest;
import vn.com.director.cache.CacheClient;
import vn.com.director.config.AppConfig;
import vn.com.director.dto.DirectorRequestDTO;
import vn.com.director.dto.Trans;
import vn.com.director.eums.StatusEnum;
import vn.com.director.mapper.RequestMapper;
import vn.com.director.queue.internal.ProcessorSender;
import vn.com.director.util.JsonUtils;
import vn.com.director.util.SecurityUtils;

import java.util.UUID;

@Slf4j
@Service
public class DirectorServiceImpl implements DirectorService {


    @Autowired
    private ProcessorSender processorSender;

    @Autowired
    private CacheClient cacheClient;

    @Autowired
    private AppConfig appConfig;

    @Override
    public DirectResponse process(DirectRequest request) {
        DirectResponse.Builder response = DirectResponse.newBuilder();
        try {
            StatusEnum statusEnum = validateProcessRequest(request);
            if (!statusEnum.isSuccess()) {
                response.setReturnCode(statusEnum.getCode());
                response.setMessage(statusEnum.getDescription());
                return response.build();
            }
            Trans trans = initInfoRequestDto(request);
            response.setTransID(trans.getTransID());
            processorSender.sendMessage(trans);
            cacheClient.saveTrans(trans);
            response.setMessage(StatusEnum.PROCESSING.getDescription());
            response.setReturnCode(StatusEnum.PROCESSING.getCode());
        } catch (Exception e) {
            log.error("Exception process, info: ", e);
            response.setReturnCode(StatusEnum.EXCEPTION.getCode());
            response.setMessage(StatusEnum.EXCEPTION.getDescription());
        }
        return response.build();
    }

    @Override
    public DirectResponse getStatus(StatusDirectRequest request) {
        DirectResponse.Builder response = DirectResponse.newBuilder();
        try {
            StatusEnum getStatusResult = validateGetStatusRequest(request);
            if (!getStatusResult.isSuccess()) {
                response.setReturnCode(getStatusResult.getCode());
                response.setMessage(getStatusResult.getDescription());
                return response.build();
            }
            Trans trans = cacheClient.getTrans(request.getTransID());
            response.setReturnCode(trans.getStatus().getCode());
            response.setMessage(trans.getStatus().getDescription());
        } catch (Exception e) {
            log.error("Exception getStatus, info: ", e);
            response.setReturnCode(StatusEnum.EXCEPTION.getCode());
            response.setMessage(StatusEnum.EXCEPTION.getDescription());
        }
        return response.build();
    }

    StatusEnum validateGetStatusRequest(StatusDirectRequest request) {
        if (request == null) {
            return StatusEnum.INVALID_REQUEST;
        }
        if (request.getClientID() <= 0) {
            return StatusEnum.INVALID_CLIENT_ID;
        }
        if (request.getTransID().isEmpty()) {
            return StatusEnum.INVALID_TRANS_ID;
        }
        if (request.getRequestDate() <= 0) {
            return StatusEnum.INVALID_REQUEST_DATE;
        }
        String sig = SecurityUtils.buildSig(request.getClientID(), request.getRequestDate(), appConfig.getClientInfo().get(request.getClientID()));
        if (!sig.equals(request.getSig())) {
            return StatusEnum.INVALID_SIG;
        }
        return StatusEnum.SUCCESS;
    }

    StatusEnum validateProcessRequest(DirectRequest request) {
        if (request.getClientID() <= 0) {
            return StatusEnum.INVALID_CLIENT_ID;
        }
        if (request.getRequestID().isEmpty()) {
            return StatusEnum.INVALID_REQUEST_ID;
        }
        if (request.getData().isEmpty()) {
            return StatusEnum.INVALID_DATA_STRING;
        }
        DirectorRequestDTO directorRequestDTO = JsonUtils.parseGson(request.getData(), DirectorRequestDTO.class);

        if (directorRequestDTO.getIdMedia().equals("")) {
            return StatusEnum.INVALID_ID_MEDIA;
        }
        if (directorRequestDTO.getServiceTypeList().isEmpty()) {
            return StatusEnum.INVALID_LIST_SERVICE;
        }
        String sig = SecurityUtils.
                buildSig(request.getClientID(), request.getRequestDate(), appConfig.getClientInfo().get(request.getClientID()));
        if (!sig.equals(request.getSig())) {
            return StatusEnum.INVALID_SIG;
        }
        return StatusEnum.SUCCESS;
    }

    Trans initInfoRequestDto(DirectRequest request) {
        Trans trans = RequestMapper.INSTANCE.transferRequestToDTO(request);
        if (trans == null) {
            throw new IllegalArgumentException("Request invalid");
        }
        trans.setTransID(UUID.randomUUID().toString());
        trans.setStatus(StatusEnum.PROCESSING);
        int defaultValue = 0;
        DirectorRequestDTO directorRequestDTO = JsonUtils.parseGson(request.getData(), DirectorRequestDTO.class);
        trans.setRequestType(directorRequestDTO.getRequestType());
        trans.getMappingResultWithMedia().put(ServiceType.UNKNOWN, directorRequestDTO.getIdMedia());
        trans.setBeforeProcessEnum(ServiceType.UNKNOWN);
        for (ServiceType service : directorRequestDTO.getServiceTypeList()) {
            trans.getMappingNumberRetryService().put(service, defaultValue);
            trans.getListService().add(service);
        }
        trans.setProgressEnum(trans.getFirstService());
        trans.getMappingResultWithMedia().put(trans.getProgressEnum(), directorRequestDTO.getIdMedia());
        return trans;
    }
}
