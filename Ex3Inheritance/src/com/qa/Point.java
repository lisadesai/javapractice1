package com.qa;

public class Point {
    private double x , y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    //getters
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    //setters
    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public String toString(){
        return "this point has an X-value of " + x + " and a y-value of " + y ;
    }


}
