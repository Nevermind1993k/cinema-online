package com.kovr.cinemaonlineapi.service.impl;

import com.kovr.cinemaonlineapi.dto.MovieDto;
import org.springframework.stereotype.Service;
import com.kovr.cinemaonlineapi.service.IMovieService;

import javax.transaction.Transactional;

@Service
public class MovieService implements IMovieService {

    @Override
    @Transactional
    public MovieDto createMovie(MovieDto movieDtoToSave) {
        //TODO
        return MovieDto.builder().build();
    }

    @Override
    public MovieDto getMovie(String id) {
        //TODO
        return MovieDto.builder().build();
    }

    @Override
    @Transactional
    public MovieDto updateMovie(String id, MovieDto updateMovieDto) {
        //TODO get by id from DAO
        //TODO update
        return MovieDto.builder().build();
    }

    @Override
    @Transactional
    public MovieDto deleteMovie(String id) {
        //TODO
        return MovieDto.builder().build();
    }
}
