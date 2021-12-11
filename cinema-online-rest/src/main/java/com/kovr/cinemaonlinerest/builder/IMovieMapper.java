package com.kovr.cinemaonlinerest.builder;

import com.kovr.cinemaonlineapi.dto.MovieDto;
import com.kovr.cinemaonlinerest.entity.AModifyMovieRequest;
import com.kovr.cinemaonlinerest.entity.MovieDetailsResponse;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface IMovieMapper {
    MovieDto buildMovieDto(AModifyMovieRequest modifyMovieRequest);

    MovieDetailsResponse buildMovieRestResponse(MovieDto dtoById);
}
