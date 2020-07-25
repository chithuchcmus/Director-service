package vn.com.director.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.com.director.api.RequestType;
import vn.com.director.api.ServiceType;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DirectorRequestDTO implements Serializable {
    private String idMedia;
    private RequestType requestType;
    private List<ServiceType> serviceTypeList;
}
