package vn.com.director.queue.internal;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import vn.com.director.dto.Trans;
import vn.com.director.service.DirectorProcessor;
import vn.com.director.util.JsonUtils;

@Component
@Slf4j
public class GetStatusReceiver implements QueueReceiver {

    @Autowired
    private DirectorProcessor directorProcessor;

    @Override
    @JmsListener(destination = "${app.activemq.getStatus.destination}")
    public void ReceiveMessage(Trans trans) {
        try {
            log.info("GetStatusReceiver.ReceiveMessage trans :{}", JsonUtils.printGson(trans));
            directorProcessor.getStatusAIProcess(trans);
        } catch (Exception e) {
            log.error("GetStatusReceiver.ReceiveMessage exception", e);
        }
    }
}
