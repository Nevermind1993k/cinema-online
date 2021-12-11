package com.kovr.cinemaonlineapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor(staticName = "of")
public class MovieDto {

    String id;
    String name;
    int year;
    Type type;
}
