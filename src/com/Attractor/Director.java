package com.Attractor;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Director {

    @SerializedName("fullName")
    @Expose
    private String fullName;

    public Director(String fullName) {
        super();
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Director.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
