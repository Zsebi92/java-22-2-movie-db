package com.example.backend.repo;

import com.example.backend.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MovieDB {

    Map<String, Movie> movies = new HashMap<>(
            Map.of(
                    "1", new Movie("1", "Kung Fury", "https://www.google.de/url?sa=i&url=https%3A%2F%2Fwww.redbubble.com%2Fde%2Fi%2Fposter%2FKung-Fury-Poster-von-carmenjimnez%2F87477193.LVTDI&psig=AOvVaw29p44igcE40zuWHqADjA9o&ust=1664616221649000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCICxueaYvPoCFQAAAAAdAAAAABAF"),
                    "2", new Movie("2", "Hot Shots 2", "https://www.google.de/url?sa=i&url=https%3A%2F%2Fwww.amazon.de%2FShots-Plakat-Movie-Poster-Inches%2Fdp%2FB004BJHDKQ&psig=AOvVaw2r8-V29R7GltiiSYvR2dRZ&ust=1664616329016000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCJCfpaGZvPoCFQAAAAAdAAAAABAD"),
                    "3", new Movie ("3","Leslie Nielsen ziemlich verdächtigt","https://www.google.de/url?sa=i&url=https%3A%2F%2Fwww.filmstarts.de%2Fkritiken%2F20141%2Fbilder%2F%3Fcmediafile%3D1000003012&psig=AOvVaw0lVJqfPTIoM4GwmizFgZN2&ust=1664616423535000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCLi1tMuZvPoCFQAAAAAdAAAAABAD")

            )
    );

    // Get al movies
    public List<Movie> getAllMovies(){
        return new ArrayList<Movie>(movies.values());
    }

    // Get Movies by title
    public Movie getMovieByTitle(String title){
        return movies.get(title);
    }

    // Add new movie
    public Movie addNewMovie(Movie movie){
        return movies.put(movie.getId(), movie);
    }

    // Delete movie
    public Movie deleteMovieById(String id){
        return movies.remove(id);
    }


}
