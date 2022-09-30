package com.example.backend.repo;

import com.example.backend.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MovieDB {

    Map<String, Movie> movies = new HashMap<>();

    public List<Movie> getAllMovies(){
        return new ArrayList<>(movies.values());
    }

    public Movie getMovieByTitle(String title){
        return movies.get(title);
    }

    public Movie addNewMovie(Movie movie){
        return movies.put(movie.getId(), movie);
    }


}
