package com.qa;

public abstract class Shape {
    private String name;
    private String color;
    private double x, y;

    public Shape(String name, String color, double x, double y){
        this.name = name;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setColor(){
        this.color = color;
    }

    public void setX(){
        this.x =x;
    }
    public void setY(){
        this.y = y;
    }

    public abstract double getArea();
    public abstract Point getCenterPoint();


}












