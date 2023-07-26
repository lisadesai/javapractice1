package com.qa;

public class TestArtist {
    public static void main(String[] args) {
        String[] arr = {"Album 1", "Album 2", "album 3"};
        Artist a1 = new Artist("Hyunjin", "Korean", 23, arr);
        Artist a2 = new Artist("Jungkook", "Korean", 24, arr);
        System.out.println(a1);
        System.out.println(a2);

        Artist[] artistList = new Artist[3];

        artistList[0] = a1;
        artistList[1] = a2;

        for (int i=0; i < artistList.length; i++){
            System.out.println(artistList[i]);
        }


    }

}
