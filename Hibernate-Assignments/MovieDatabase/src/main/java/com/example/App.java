package com.example;

import com.example.dao.MovieDAO;
import com.example.dao.GenreDAO;
import com.example.models.Movie;
import com.example.models.Genre;

public class App {
    public static void main(String[] args) {
        MovieDAO movieDAO = new MovieDAO();
        GenreDAO genreDAO = new GenreDAO();

        Genre action = new Genre("Action");
        Genre comedy = new Genre("Comedy");

        genreDAO.saveGenre(action);
        genreDAO.saveGenre(comedy);

        Movie movie1 = new Movie("Final Destination");
        movie1.addGenre(action);
        movie1.addGenre(comedy);

        Movie movie2 = new Movie("Fast & Furious");
        movie2.addGenre(action);

        movieDAO.saveMovie(movie1);
        movieDAO.saveMovie(movie2);

        System.out.println("Movies and genres saved successfully!");
    }
}
