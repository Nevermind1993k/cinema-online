package com.kovr.cinemaonlineapi.service.user.impl;

import com.kovr.cinemaonlineapi.dto.user.UserDto;
import com.kovr.cinemaonlineapi.service.user.IUserService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService implements IUserService {

    @Override
    @Transactional
    public UserDto createUser(UserDto userDtoToSave) {
        //TODO
        return UserDto.builder().build();
    }

    @Override
    public UserDto getUser(String id) {
        //TODO
        return UserDto.builder().build();
    }

    @Override
    @Transactional
    public UserDto updateUser(String id, UserDto dtoToUpdate) {
        return UserDto.builder().build();
    }

    @Override
    @Transactional
    public UserDto deleteUser(String id) {
        return UserDto.builder().build();
    }
}
