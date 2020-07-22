package vn.com.director.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetStatusResponseDataDTO implements Serializable {
    @JsonProperty("id")
    private String id;
}
