package vn.com.director.util;

import org.apache.commons.codec.digest.DigestUtils;

public class SecurityUtils {
    public static String buildSig(int clientID, long requestDate, String clientKey) {
        String inputString = new StringBuilder()
                .append(clientID).append("|")
                .append(requestDate).append("|")
                .append(clientKey)
                .toString();
        return DigestUtils.sha256Hex(inputString);
    }
}
