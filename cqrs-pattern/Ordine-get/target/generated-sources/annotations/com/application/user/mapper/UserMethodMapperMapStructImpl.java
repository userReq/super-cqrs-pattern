package com.application.user.mapper;

import com.application.user.controller.dto.request.UserRequest;
import com.application.user.controller.dto.response.UserDTO;
import com.application.user.controller.dto.response.UserDTO.UserDTOBuilder;
import com.application.user.documents.User;
import com.application.user.documents.User.UserBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-15T17:38:54+0100",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class UserMethodMapperMapStructImpl implements UserMethodMapperMapStruct {

    @Override
    public OrderDTO toUserDto(User person) {
        if ( person == null ) {
            return null;
        }

        UserDTOBuilder userDTO = OrderDTO.builder();

        userDTO.email( person.getEmail() );
        userDTO.name( person.getName() );
        userDTO.userId( person.getUserId() );

        return userDTO.build();
    }

    @Override
    public User toUser(OrderDTO dto) {
        if ( dto == null ) {
            return null;
        }

        UserBuilder user = User.builder();

        user.email( dto.getEmail() );
        user.name( dto.getName() );
        user.userId( dto.getUserId() );

        return user.build();
    }

    @Override
    public User fromUserReq(UserRequest userRequest) {
        if ( userRequest == null ) {
            return null;
        }

        UserBuilder user = User.builder();

        user.email( userRequest.getEmail() );
        user.name( userRequest.getName() );
        user.userId( userRequest.getUserId() );

        return user.build();
    }
}
