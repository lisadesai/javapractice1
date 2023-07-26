package com.qa;

public class Rectangle extends Shape {
    private double height, width;

    public Rectangle(String name, String color, double x, double y, double width, double height){
        super(name, color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public Point getCenterPoint() {
        double centreX = getX() + width/2;
        double centreY = getY() + height/2;
        return new Point(centreX, centreY);
    }

    @Override
    public String toString(){
        return "rectangle width: " + width + " height: " + height ;

    }

    public boolean isSquare(){
        return (width==height);
    }



}
