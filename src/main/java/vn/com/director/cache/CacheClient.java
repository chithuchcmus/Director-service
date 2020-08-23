package vn.com.director.cache;

import vn.com.director.dto.Trans;

public interface CacheClient {
    void saveTrans(Trans trans);

    Trans getTrans(String tranID);
}
