package com.Attractor;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Director {

    @SerializedName("fullName")
    @Expose
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
