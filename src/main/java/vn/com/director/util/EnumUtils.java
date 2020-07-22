package vn.com.director.util;

import vn.com.director.api.ServiceType;
import vn.com.director.eums.ProgressEnum;

public class EnumUtils {

    public static ProgressEnum getProgressEnum(ServiceType serviceType) {
        switch (serviceType) {
            case UNKNOWN:
                return ProgressEnum.UN_KNOW;
            case TESSERACT:
                return ProgressEnum.TESSERACT;
            case AI2:
                return ProgressEnum.AI2;
            case AI3:
                return ProgressEnum.AI3;
        }
        throw new IllegalArgumentException("invalid serviceType");
    }
}
