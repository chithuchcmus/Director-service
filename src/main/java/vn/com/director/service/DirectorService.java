package vn.com.director.service;

import vn.com.director.api.DirectRequest;
import vn.com.director.api.DirectResponse;
import vn.com.director.api.StatusDirectRequest;

public interface DirectorService {
    DirectResponse process(DirectRequest request);

    DirectResponse getStatus(StatusDirectRequest request);
}
