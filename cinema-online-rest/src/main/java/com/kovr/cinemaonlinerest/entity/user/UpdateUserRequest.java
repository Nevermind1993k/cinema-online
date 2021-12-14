package com.kovr.cinemaonlinerest.entity.user;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdateUserRequest {

    String id;
    String name;
    String lastName;
    String email;
    String password;
    int age;
    String country;

}
