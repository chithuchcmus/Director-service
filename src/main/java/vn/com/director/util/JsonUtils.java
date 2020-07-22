package vn.com.director.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.util.JsonFormat;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author huyvha
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Slf4j
public class JsonUtils {
    private static final Gson GSON = new GsonBuilder().disableHtmlEscaping().create();
    private static JsonFormat.Printer jsonFormat = JsonFormat.printer();
    private static String ERROR_PARSE = "ERROR";

    public static String printGson(Object object) {
        return GSON.toJson(object);
    }

    public static <T> T parseGson(String json, Class<T> clazz) {
        return GSON.fromJson(json, clazz);
    }

    public static String printProtoLenient(MessageOrBuilder messageOrBuilder) {
        try {
            return GSON.toJson(jsonFormat.print(messageOrBuilder));
        } catch (Exception e) {
            log.error("printProtoLenient error", e);
            return ERROR_PARSE;
        }
    }

}