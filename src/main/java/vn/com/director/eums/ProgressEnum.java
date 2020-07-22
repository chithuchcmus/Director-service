package vn.com.director.eums;

import java.util.HashMap;


public enum ProgressEnum {
    UN_KNOW(0),
    TESSERACT(1),
    AI2(2),
    AI3(3);

    private final int value;
    private static final HashMap<Integer, ProgressEnum> returnMap = new HashMap();

    static {
        for (ProgressEnum returnCodeEnum : ProgressEnum.values()) {
            returnMap.put(returnCodeEnum.value, returnCodeEnum);
        }
    }

    private ProgressEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static ProgressEnum fromInt(int strValue) throws Exception {
        ProgressEnum value = returnMap.get(strValue);
        if (value != null) {
            return value;
        }
        throw new Exception("Not found " + ProgressEnum.class.getSimpleName() + " for " + strValue);
    }
}
