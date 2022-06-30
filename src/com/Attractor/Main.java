package com.Attractor;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	run();



    }

    private static void run() {
        Example data = FileService.readFile();

        System.out.println("Year  |   Name");
        System.out.println("----------------------------------------------");

        for (Movie m : data.getMovies()) {

            Comparator comp = Comparator.comparing(Movie::getName);

            System.out.println(String.format("%s  |\t %s ", m.getYear(), m.getName()));

//            System.out.println(m.getName().contains("Good omens"));

        }
        
    }


}
