package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<String> movies = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here

       File file = new File("movies.txt");
       Scanner scanner = new Scanner(file);


       while (scanner.hasNextLine()){
           movies.add(scanner.nextLine());
       }

       System.out.println(getMovie(0));
       System.out.println(getRandomMovie());
    }

    private static String getMovie(int position){
        return movies.get(position);
    }

    private static String getRandomMovie(){
        return movies.get((int) (Math.random() * movies.size()));
    }
}
