package com.kovr.cinemaonlinerest.rest;

import com.kovr.cinemaonlineapi.dto.MovieDto;
import com.kovr.cinemaonlineapi.service.IMovieService;
import com.kovr.cinemaonlinerest.builder.IMovieMapper;
import com.kovr.cinemaonlinerest.entity.CreateMovieRequest;
import com.kovr.cinemaonlinerest.entity.IdMovieResponse;
import com.kovr.cinemaonlinerest.entity.MovieDetailsResponse;
import com.kovr.cinemaonlinerest.entity.UpdateMovieRequest;
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

import static com.kovr.cinemaonlinerest.rest.MovieRestService.MOVIE_THEATER_URL;

@RestController(MOVIE_THEATER_URL)
@RequiredArgsConstructor
public class MovieRestService {

    public static final String MOVIE_THEATER_URL = "/theater";

    private final IMovieService movieService;
    private final IMovieMapper movieRestBuilder;

    @PostMapping
    public ResponseEntity<IdMovieResponse> createMovie(@RequestBody CreateMovieRequest createMovieRequest) {
        //TODO validation
        MovieDto movieDtoToSave = movieRestBuilder.buildMovieDto(createMovieRequest);
        MovieDto createdMovie = movieService.createMovie(movieDtoToSave);

        return ResponseEntity.created(URI.create(MOVIE_THEATER_URL)).body(IdMovieResponse.of(createdMovie.getId()));
    }

    @GetMapping
    public ResponseEntity<MovieDetailsResponse> getMovie(@RequestParam String id) {
        //TODO validation
        MovieDto dtoById = movieService.getMovie(id);

        MovieDetailsResponse detailsResponse = movieRestBuilder.buildMovieRestResponse(dtoById);
        return ResponseEntity.ok(detailsResponse);
    }

    @PutMapping
    public ResponseEntity<MovieDetailsResponse> updateMovie(@RequestBody UpdateMovieRequest updateMovieRequest) {
        String id = updateMovieRequest.getId();
        //TODO check for null and pattern

        MovieDto dtoToUpdate = movieRestBuilder.buildMovieDto(updateMovieRequest);

        MovieDto updateMovie = movieService.updateMovie(id, dtoToUpdate);

        MovieDetailsResponse detailsResponse = movieRestBuilder.buildMovieRestResponse(updateMovie);
        return ResponseEntity.ok(detailsResponse);
    }

    @DeleteMapping
    public ResponseEntity<IdMovieResponse> deleteMovie(@RequestParam String id) {
        //TODO validation
        MovieDto deletedMovie = movieService.deleteMovie(id);

        return ResponseEntity.created(URI.create(MOVIE_THEATER_URL)).body(IdMovieResponse.of(deletedMovie.getId()));
    }

}
