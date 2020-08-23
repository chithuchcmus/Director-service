package vn.com.director.dto;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetStatusResponseDataDTO implements Serializable {
    @SerializedName("id")
    private String id;
}
