package com.Attractor;

import java.util.Collections;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Movie implements Comparable<Movie>{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("director")
    @Expose
    private Director director;
    @SerializedName("cast")
    @Expose
    private List<Cast> cast = null;

    public Movie(String name, Integer year, String description, Director director, List<Cast> cast) {
        super();
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.cast = cast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Movie.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("year");
        sb.append('=');
        sb.append(((this.year == null)?"<null>":this.year));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("director");
        sb.append('=');
        sb.append(((this.director == null)?"<null>":this.director));
        sb.append(',');
        sb.append("cast");
        sb.append('=');
        sb.append(((this.cast == null)?"<null>":this.cast));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int compareTo(Movie o) {
        if(this.getName().equals(o.getName())) {
            return this.getYear().compareTo(o.getYear());
        }
        return 0;
    }
}