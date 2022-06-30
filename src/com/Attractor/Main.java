package com.Attractor;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	run();
    }

    private static void run() {
        Map<String, List<Movie>> movieList = FileService.readFile();
        List<Movie> movies = movieList.get("movies");

        start1(movies);
        start(movies);

    }
    public static void start1 (List<Movie> movies) {
        Comparator<Movie> comp = Comparator.comparingInt(Movie::getYear);
        movies.sort(comp);
        for (Movie m : movies) {
            System.out.println(m.getName());
        }
    }

    public static void start(List<Movie> movies) {
        Comparator<Movie> comp = Comparator.comparingInt(Movie::getYear);
        movies.sort(comp);
        System.out.println();
        for (Movie m : movies) {
            System.out.println(m.getYear() + " " +m.getName());
        }
        System.out.println();
        movies.sort(comp.reversed());
        for (Movie m : movies) {
            System.out.println(m.getYear() + " " +m.getName());
        }

        Comparator<Movie> comp1 = Comparator.comparing(Movie::getName);
        movies.sort(comp1);
        System.out.println();
        for (Movie m : movies) {
            System.out.println(m.getName());
        }

        Comparator<Movie> comp2 = Comparator.comparing(Movie::getDirector);
        movies.sort(comp2);
        System.out.println();
        for (Movie m : movies) {
            System.out.println(m.getDirector());
        }

    }







}
