package vn.com.director.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import vn.com.director.api.DirectRequest;
import vn.com.director.dto.Trans;

@Mapper
public interface RequestMapper {
    RequestMapper INSTANCE = Mappers.getMapper(RequestMapper.class);

    Trans transferRequestToDTO(DirectRequest request);
}
