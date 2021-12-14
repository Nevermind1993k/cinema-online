package com.kovr.cinemaonlinerest.builder.user;

import com.kovr.cinemaonlineapi.dto.user.UserDto;
import com.kovr.cinemaonlinerest.entity.user.CreateUserRequest;
import com.kovr.cinemaonlinerest.entity.user.UpdateUserRequest;
import com.kovr.cinemaonlinerest.entity.user.UserDetailsResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IUserMapper {

    UserDto buildUserDto(CreateUserRequest createUserRequest);

    UserDto buildUserDto(UpdateUserRequest updateUserRequest);

    UserDetailsResponse buildUserDetailsResponse(UserDto userDtoById);
}
