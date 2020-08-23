package vn.com.director.controller;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import vn.com.director.api.DirectRequest;
import vn.com.director.api.DirectResponse;
import vn.com.director.api.DirectorServiceGrpc;
import vn.com.director.api.StatusDirectRequest;
import vn.com.director.service.DirectorService;

@GRpcService
public class DirectController extends DirectorServiceGrpc.DirectorServiceImplBase {

    @Autowired
    private DirectorService directService;

    @Override
    public void processDirect(DirectRequest request, StreamObserver<DirectResponse> responseObserver) {
        responseObserver.onNext(directService.process(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getStatusDirect(StatusDirectRequest request, StreamObserver<DirectResponse> responseObserver) {
        responseObserver.onNext(directService.getStatus(request));
        responseObserver.onCompleted();
    }
}
