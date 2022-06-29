package com.Attractor;

public class Main {

    public static void main(String[] args) {
	run();
    }

    private static void run() {
//        Movie movie = new Movie();
        Movie[] movies = FileService.readFile();
        for(Movie m : movies) {
            System.out.println(m);
        }

    }
}
