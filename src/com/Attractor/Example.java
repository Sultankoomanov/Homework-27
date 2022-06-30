package com.Attractor;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Example {

    @SerializedName("movies")
    @Expose
    private List<Movie> movies = null;

    public Example(List<Movie> movies)  {
        super();
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Example.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("movies");
        sb.append('=');
        sb.append(((this.movies == null)?"<null>":this.movies));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }



//    @Override
//    public int compareTo(Example o) {
//        if(this.getMovies().equals(o.getMovies())) {
//            return this.getMovies().compareTo(o.getMovies());
//        }
//        return 0;
//    }


}