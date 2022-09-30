import {useEffect, useState} from "react";
import {Movie} from "../model/Movie";
import axios from "axios";


export default function useMovies(){

    const [movies, setMovies] = useState<Movie[]>([]);

    useEffect(() => {
        getAllMovies()
    }, [])

    const getAllMovies = () => {
        axios.get("/api/movies")
            .then(response => response.data)
            .then(data => setMovies(data))
    }

    const addMovie = (newMovie: Movie) => {
        return axios.post("/api/movies", newMovie)
            .then(response => response.data)
            .then(getAllMovies)
    }

    return {movies, addMovie}

}