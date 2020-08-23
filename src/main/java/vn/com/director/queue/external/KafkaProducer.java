package vn.com.director.queue.external;

import vn.com.director.dto.StatusCallbackMessage;

public interface KafkaProducer {
    void sendMessage(StatusCallbackMessage trans);
}
