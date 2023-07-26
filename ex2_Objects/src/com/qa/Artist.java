package com.qa;

import java.util.Arrays;

public class Artist {
    private String name;
    private String nationality;
    private int age;

    private String[] releases;

    //constructor
    public Artist(String name, String nationality, int age, String[] releases){
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.releases = releases;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getNationality(){
        return nationality;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String[] getReleases(){
        return releases;
    }

    public void setReleases(String[] releases){
        this.releases = releases;
    }

    public String toString(){
        return "Artist name: " + name + ", Age: " + age + ", Nationality: " + nationality + ", Releases: " + Arrays.toString(releases);
    }



}
