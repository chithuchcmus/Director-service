package vn.com.director.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class GatewayDataDTO implements Serializable {
    private int eventType;

    private String id;

    @JsonProperty("event_type")
    public int getEventType() {
        return eventType;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }
}
