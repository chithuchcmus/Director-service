package vn.com.director.dto;

import com.google.gson.annotations.SerializedName;
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
    @SerializedName("event_type")
    private int eventType;

    @SerializedName("id")
    private String id;
}