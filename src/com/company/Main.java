package com.company;


import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here

        Movie movie = new Movie();
        movie.setMovieFile("movies.txt");

        System.out.println(movie.getMovieListSize());
    }
}
