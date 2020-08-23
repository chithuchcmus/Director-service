package vn.com.director.eums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusEnum {
    PROCESSING(5, "Processing"),
    SUCCESS(1, "successful"),
    EXCEPTION(0, "Exception, please contact dev"),
    INVALID_REQUEST(-1, "invalid request"),
    INVALID_CLIENT_ID(-2, "invalid client id"),
    INVALID_LIST_SERVICE(-3, "invalid list service"),
    INVALID_REQUEST_ID(-4, "invalid request id"),
    INVALID_ID_MEDIA(-5, "invalid url"),
    INVALID_TRANS_ID(-6, "invalid trans id"),
    CALL_GATE_WAY_RESPONSE_ERROR(-7, "gateway response error"),
    GET_STATUS_GATE_WAY_RESPONSE_ERROR(-8, "get status gateway response error"),
    MAX_RETRY_GET_STATUS_GATE_WAY(-9, "max retry call get status"),
    INVALID_DATA_STRING(-10, "invalid data string"),
    INVALID_SIG(-11, "invalid sig"),
    INVALID_REQUEST_DATE(-12, "invalid request date");


    private int code;
    private String description;

    public boolean isSuccess() {
        return code > 0 && code != 5;
    }
}