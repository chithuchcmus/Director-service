package vn.com.director.queue.internal;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import vn.com.director.dto.Trans;
import vn.com.director.util.JsonUtils;

@Component
@Slf4j
public class ProcessorSender implements QueueSender {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${app.activemq.process.destination}")
    private String destination;


    @Override
    public void sendMessage(Trans trans) {
        try {
            log.info("send request to process list service: {}", JsonUtils.printGson(trans));
            jmsTemplate.convertAndSend(destination, trans);
        } catch (Exception e) {
            log.error("processorSender error, ex info: ", e);
        }
    }
}
