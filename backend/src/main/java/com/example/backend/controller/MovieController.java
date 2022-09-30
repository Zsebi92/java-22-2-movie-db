package com.example.backend.controller;

import com.example.backend.model.Movie;
import com.example.backend.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> getAllMovies(){
        List<Movie> foundMovie = movieService.getAllMovies();

        return foundMovie;
    }

    @GetMapping({"/title"})
    public Movie getMovieByTitle(@PathVariable String title){
        Movie foundMovie = movieService.getMovieByTitle(title);

        return foundMovie;

    }

    @PostMapping
    public Movie addNewMovie(@RequestBody Movie q){
        return movieService.addNewMovie(q);
    }
}
