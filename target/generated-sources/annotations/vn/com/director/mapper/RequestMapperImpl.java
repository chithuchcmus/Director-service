package vn.com.director.mapper;

import javax.annotation.Generated;
import vn.com.director.api.DirectRequest;
import vn.com.director.dto.Trans;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-07-23T00:57:56+0700",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_252 (Private Build)"
)
public class RequestMapperImpl implements RequestMapper {

    @Override
    public Trans transferRequestToDTO(DirectRequest request) {
        if ( request == null ) {
            return null;
        }

        Trans trans = new Trans();

        trans.setRequestID( request.getRequestID() );
        trans.setClientID( String.valueOf( request.getClientID() ) );

        return trans;
    }
}
