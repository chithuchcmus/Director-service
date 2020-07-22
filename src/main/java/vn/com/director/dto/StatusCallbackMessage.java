package vn.com.director.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StatusCallbackMessage implements Serializable {
    private String requestID;
    private String message;
    private int status;
    private int serviceType;
    private String result;
}
