import React from 'react';
import './App.css';
import MovieGallery from "./components/MovieGallery";
import useMovies from './hooks/useMovies';
import CreateMovie from "./components/CreateMovie";

function App() {

    const {movies, addMovie} = useMovies()
    return (
        <div className="App">
            <header className="App-header">

                <MovieGallery movies={movies}/>
                <CreateMovie addMovie={addMovie}/>

            </header>
        </div>
    );
}

export default App;
