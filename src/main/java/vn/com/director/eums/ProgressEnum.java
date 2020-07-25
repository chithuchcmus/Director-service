package vn.com.director.eums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import vn.com.director.api.ServiceType;

@Getter
@AllArgsConstructor
public enum ProgressEnum {
    UN_KNOW(0),
    TESSERACT(1),
    LANGUAGE_TOOL(3);

    private int value;

    public static ProgressEnum getProgressEnum(ServiceType serviceType) {
        switch (serviceType) {
            case UNKNOWN:
                return ProgressEnum.UN_KNOW;
            case TESSERACT:
                return ProgressEnum.TESSERACT;
            case LANGUAGE_TOOL:
                return ProgressEnum.LANGUAGE_TOOL;
        }
        throw new IllegalArgumentException("invalid serviceType");
    }
}
