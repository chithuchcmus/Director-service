package vn.com.director.cache;

import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.com.director.dto.Trans;
import vn.com.director.util.RedisKeyUtils;

@Component
@Slf4j
public class CacheClientImpl implements CacheClient {

    @Autowired
    private RedissonClient redissonClient;


    @Override
    public void saveTrans(Trans trans) {
        try {
            String key = RedisKeyUtils.getTransKey(trans.getTransID());
            RBucket<Trans> transBucket = redissonClient.getBucket(key);
            transBucket.set(trans);
        } catch (Exception e) {
            log.error("Save trans exception, info: ", e);
        }
    }

    @Override
    public Trans getTrans(String tranID) {
        String key = RedisKeyUtils.getTransKey(tranID);
        RBucket<Trans> transBucket = redissonClient.getBucket(key);
        Trans trans = transBucket.get();
        return trans;
    }
}
