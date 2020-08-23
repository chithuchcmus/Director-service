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
public class ProcessorReceiver implements QueueReceiver {

    @Autowired
    private DirectorProcessor directorProcessor;

    @Override
    @JmsListener(destination = "${app.activemq.process.destination}")
    public void ReceiveMessage(Trans request) {
        try {
            log.info("Received RequestDTO: {}", JsonUtils.printGson(request));
            directorProcessor.callAIService(request);
        } catch (Exception e) {
            log.error("Save NotificationTransLog error, ex info: ", e);
        }
    }
}
