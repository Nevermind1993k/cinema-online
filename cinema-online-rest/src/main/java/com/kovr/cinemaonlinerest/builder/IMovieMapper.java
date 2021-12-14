package com.kovr.cinemaonlinerest.builder;

import com.kovr.cinemaonlineapi.dto.MovieDto;
import com.kovr.cinemaonlinerest.entity.CreateMovieRequest;
import com.kovr.cinemaonlinerest.entity.MovieDetailsResponse;
import com.kovr.cinemaonlinerest.entity.UpdateMovieRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IMovieMapper {
    MovieDto buildMovieDto(CreateMovieRequest createMovieRequest);

    MovieDto buildMovieDto(UpdateMovieRequest createMovieRequest);

    MovieDetailsResponse buildMovieRestResponse(MovieDto dtoById);
}
