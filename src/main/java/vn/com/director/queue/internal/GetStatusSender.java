package vn.com.director.queue.internal;

import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.ScheduledMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import vn.com.director.config.GateWayConfig;
import vn.com.director.dto.Trans;
import vn.com.director.util.JsonUtils;

@Component
@Slf4j
public class GetStatusSender implements QueueSender {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${app.activemq.getStatus.destination}")
    private String destination;

    @Autowired
    private GateWayConfig gateWayConfig;

    @Override
    public void sendMessage(Trans request) {
        try {
            log.info("send request to getStatus service: {}", JsonUtils.printGson(request));
            jmsTemplate.convertAndSend(destination, request, message -> {
                message.setLongProperty(ScheduledMessage.AMQ_SCHEDULED_DELAY, gateWayConfig.getTimeSleep());
                return message;
            });
        } catch (Exception e) {
            log.error("processorSender error, ex info: ", e);
        }
    }
}
