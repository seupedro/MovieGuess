package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Movie {

   private List<String> movies;
   private File file;
   private Scanner scanner;
   private boolean hasSetted;

    public Movie() {
    }

    public void setMovieFile(String movieFile) throws FileNotFoundException {
        file = new File(movieFile);
        scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            movies.add(scanner.nextLine());
        }

        hasSetted = true;
    }

    public String getMovie(int position){
        return movies.get(position);
    }

    public int getMovieListSize(){
        return movies.size();
    }

}
