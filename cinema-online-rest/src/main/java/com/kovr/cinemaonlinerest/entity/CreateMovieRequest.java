package com.kovr.cinemaonlinerest.entity;

import com.kovr.cinemaonlineapi.dto.Type;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateMovieRequest extends AModifyMovieRequest {

    String name;
    int year;
    Type type;
}
