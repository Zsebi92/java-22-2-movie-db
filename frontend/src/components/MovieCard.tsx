import {Movie} from "../model/Movie";
import "./MovieCard.css"


type MovieCardProps = {
    movie: Movie
}

export default function MovieCard(props: MovieCardProps) {

    return(
    <div className={"movie-card"}>
        <div>
            <img className={"movie-card__poster"} src={props.movie.posterUrl}/>
            <div className={"movie-card__title"}>{props.movie.title}</div>

        </div>
    </div>);

}