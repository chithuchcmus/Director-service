package vn.com.director.client.gateway;


import vn.com.director.api.GetStatusRequest;
import vn.com.director.api.GetStatusResponse;
import vn.com.director.api.ProcessRequest;
import vn.com.director.api.ProcessResponse;


public interface GatewayClient {
    ProcessResponse process(ProcessRequest request);

    GetStatusResponse getStatus(GetStatusRequest request);
}
