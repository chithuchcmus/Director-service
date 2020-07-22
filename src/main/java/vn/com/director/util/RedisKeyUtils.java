package vn.com.director.util;

public class RedisKeyUtils {

    public static String getTransKey(String transID) {
        return new StringBuilder("Trans|").append(transID).toString();
    }
}
