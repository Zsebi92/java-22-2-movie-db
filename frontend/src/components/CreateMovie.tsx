import {Movie} from "../model/Movie";
import {useState} from "react";


type CreateMovieProps = {
    addMovie: (newMovie: Movie) => void
}

export default function CreateMovie(props: CreateMovieProps) {

    const [title, setTitle] = useState<string>("");
    const [posterUrl, setPosterUrl] = useState<string>("");

    const onCreate = () => {

        const newMovie: Movie = {
            title: title,
            posterUrl: posterUrl
        }

        props.addMovie(newMovie)
    }

    return <div>
        Add new Movie
        <div>
            <p>Title</p>
            <input type={"text"}
                   value={title}
                   className={"create-movie__input"}
                   onChange={(e) => setTitle(e.target.value)}
            />
        </div>
        <div>
            <p>Poster</p>
            <input type={"test"}
            value={posterUrl}
            className={"create-movie__input"}
            onChange={(e) => setPosterUrl(e.target.value)}/>
        </div>
        <div>
            <button onClick={onCreate}>Add</button>
        </div>
    </div>
}