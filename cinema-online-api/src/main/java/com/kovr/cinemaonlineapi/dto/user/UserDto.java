package com.kovr.cinemaonlineapi.dto.user;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto {

    String id;
    String name;
    String lastName;
    String email;
    String password;
    int age;
    String country;
}
