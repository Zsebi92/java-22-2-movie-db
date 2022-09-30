import {Movie} from "../model/Movie";
import MovieCard from "./MovieCard";
import "./MovieGallery.css"

type MovieGalleryProps = {
    movies: Movie[]
}

export default function MovieGallery(props: MovieGalleryProps){
    return<div className={"movie-list"}>
        {props.movies.map(
            (movie) => <MovieCard key={movie.title} movie={movie}/>
        )}
    </div>
}