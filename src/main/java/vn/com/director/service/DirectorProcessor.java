package vn.com.director.service;

import vn.com.director.dto.Trans;

public interface DirectorProcessor {
    void callAIService(Trans request);

    void getStatusAIProcess(Trans request);
}
