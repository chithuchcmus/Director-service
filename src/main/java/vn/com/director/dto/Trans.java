package vn.com.director.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import vn.com.director.api.ServiceType;
import vn.com.director.eums.ProgressEnum;
import vn.com.director.eums.StatusEnum;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class Trans implements Serializable {
    private String requestID;
    private String transID;
    private String gateWayTransID;
    private String idMedia;
    private String gatewayResult;
    private String clientID;
    private StatusEnum status;
    private ProgressEnum progressEnum;
    private StatusEnum progressStatusEnum;
    private Map<ProgressEnum, Integer> mappingNumberRetryService;
    private Map<ProgressEnum, Integer> mappingResultWithMedia;
    private List<ServiceType> listService;

    public Trans() {
        mappingNumberRetryService = new HashMap<>();
        mappingResultWithMedia = new HashMap<>();
        listService = new ArrayList<>();
    }

    public ServiceType popFirstServiceType() {
        return listService.remove(0);
    }

    public ServiceType getFirstService() {
        return listService.get(0);
    }

    public boolean isProcessing() {
        return status == StatusEnum.PROCESSING;
    }

    public void increaseNumberRetry(ProgressEnum progressEnum) {
        Integer numberRetry = mappingNumberRetryService.get(progressEnum);
        numberRetry = numberRetry + 1;
        mappingNumberRetryService.put(progressEnum, numberRetry);
    }

    public int getNumberRetry(ProgressEnum progressEnum) {
        Integer numberRetry = mappingNumberRetryService.get(progressEnum);
        return numberRetry.intValue();
    }
}