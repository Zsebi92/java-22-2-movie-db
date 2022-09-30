package com.example.backend.service;

import com.example.backend.model.Movie;
import com.example.backend.repo.MovieDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private MovieDB movieRepo;

    @Autowired
    public MovieService(MovieDB movieRepo) {
        this.movieRepo = movieRepo;
    }

    public List<Movie> getAllMovies() {
        List<Movie> foundMovies = movieRepo.getAllMovies();
        return foundMovies;
    }

    public Movie getMovieByTitle(String title) {
        Movie foundMovie = movieRepo.getMovieByTitle(title);

        return foundMovie;
    }

    public Movie addNewMovie(Movie movie){
        return movieRepo.addNewMovie(movie);
    }

    public Movie deleteMovieById(String id){
        return movieRepo.deleteMovieById(id);
    }
}
