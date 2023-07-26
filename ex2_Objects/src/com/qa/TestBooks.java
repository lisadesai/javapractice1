package com.qa;

public class TestBooks {
    public static void main(String[] args) {
        String[] arr = {"Mike", "Martina", "Peter"};
        Book b1 = new Book("Title", arr, 10.22);
        Book b2 = new Book("A history", arr, 5.99);
        Book b3 = new Book("Game of thrones", arr, 6);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        Book[] bookArray = new Book[3];

        bookArray[0] = b1;
        bookArray[1] = b2;
        bookArray[2] = b3;

        for (int x=0; x<bookArray.length;x++){
            System.out.println(bookArray[x]);
        }

    }
}
