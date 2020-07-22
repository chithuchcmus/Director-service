package vn.com.director.queue.internal;

import vn.com.director.dto.Trans;

public interface QueueSender {
    void sendMessage(Trans request);
}
