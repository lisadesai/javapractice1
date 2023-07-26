package com.qa;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("r1", "red", 5,3,2,3);
        Rectangle r2 = new Rectangle("r2", "teal", 3,4,5,6);
        System.out.println(r1);
        System.out.println(r2);

        double AreaR1 = r1.getArea();
        System.out.println("Area for r1 is " + AreaR1);

        Circle c1 = new Circle("c1","red",2,4,5 );
        System.out.println(c1);
        double c1area = c1.getArea();
        System.out.println(c1area);
    }
}
