package vn.com.director.queue.internal;

import vn.com.director.dto.Trans;

public interface QueueReceiver {
    void ReceiveMessage(Trans request);
}
