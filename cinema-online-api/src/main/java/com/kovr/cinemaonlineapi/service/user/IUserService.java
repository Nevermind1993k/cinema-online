package com.kovr.cinemaonlineapi.service.user;

import com.kovr.cinemaonlineapi.dto.user.UserDto;

public interface IUserService {

    UserDto createUser(UserDto userDtoToSave);

    UserDto getUser(String id);

    UserDto updateUser(String id, UserDto dtoToUpdate);

    UserDto deleteUser(String id);
}
