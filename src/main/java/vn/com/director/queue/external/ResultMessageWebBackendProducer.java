package vn.com.director.queue.external;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import vn.com.director.config.KafkaConfig;
import vn.com.director.dto.StatusCallbackMessage;
import vn.com.director.util.JsonUtils;

@Slf4j
@Service
public class ResultMessageWebBackendProducer implements KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private KafkaConfig kafkaConfig;

    @Override
    public void sendMessage(StatusCallbackMessage statusCallbackMessage) {
        log.info("Producing message -> {}", JsonUtils.printGson(statusCallbackMessage));
        kafkaTemplate.send(kafkaConfig.getWebBackendResultTopic(), JsonUtils.printGson(statusCallbackMessage));
    }
}
