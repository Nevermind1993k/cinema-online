package com.kovr.cinemaonlinerest.rest;

import com.kovr.cinemaonlineapi.dto.user.UserDto;
import com.kovr.cinemaonlineapi.service.user.IUserService;
import com.kovr.cinemaonlinerest.builder.user.IUserMapper;
import com.kovr.cinemaonlinerest.entity.user.CreateUserRequest;
import com.kovr.cinemaonlinerest.entity.user.IdUserResponse;
import com.kovr.cinemaonlinerest.entity.user.UpdateUserRequest;
import com.kovr.cinemaonlinerest.entity.user.UserDetailsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;


@RestController(UserRestService.USER_MANAGEMENT_URL)
@RequiredArgsConstructor
public class UserRestService {

    public static final String USER_MANAGEMENT_URL = "/user";

    private final IUserService userService;
    private final IUserMapper userMapper;

    @PostMapping
    public ResponseEntity<IdUserResponse> createUser(@RequestBody CreateUserRequest createUserRequest) {
        //TODO validation

        UserDto userDtoToSave = userMapper.buildUserDto(createUserRequest);
        UserDto createdUser = userService.createUser(userDtoToSave);

        return ResponseEntity.created(URI.create(USER_MANAGEMENT_URL)).body(IdUserResponse.of(createdUser.getId()));
    }

    @GetMapping
    public ResponseEntity<UserDetailsResponse> getUserDetails(@RequestParam("id") String id) {
        //TODO validation

        UserDto userDtoById = userService.getUser(id);
        UserDetailsResponse detailsResponse = userMapper.buildUserDetailsResponse(userDtoById);

        return ResponseEntity.ok(detailsResponse);
    }

    @PutMapping
    public ResponseEntity<UserDetailsResponse> updateUser(@RequestBody UpdateUserRequest updateUserRequest) {
        String id = updateUserRequest.getId();
        //TODO check for null and pattern

        UserDto dtoToUpdate = userMapper.buildUserDto(updateUserRequest);
        UserDto updatedUser = userService.updateUser(id, dtoToUpdate);
        UserDetailsResponse detailsResponse = userMapper.buildUserDetailsResponse(updatedUser);

        return ResponseEntity.ok(detailsResponse);
    }

    @DeleteMapping
    public ResponseEntity<IdUserResponse> deleteUser(@RequestParam("id") String id) {
        //TODO validation

        UserDto deletedUser = userService.deleteUser(id);

        return ResponseEntity.ok(IdUserResponse.of(deletedUser.getId()));
    }
}
