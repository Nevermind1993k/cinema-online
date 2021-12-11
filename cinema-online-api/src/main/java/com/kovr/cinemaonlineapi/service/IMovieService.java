package com.kovr.cinemaonlineapi.service;

import com.kovr.cinemaonlineapi.dto.MovieDto;

public interface IMovieService {

    MovieDto createMovie(MovieDto movieDto);

    MovieDto getMovie(String id);

    MovieDto updateMovie(String id, MovieDto updateMovieDto);

    MovieDto deleteMovie(String id);
}
