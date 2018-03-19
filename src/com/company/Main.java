package com.company;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Film filmToBeGuessed = new Film ();
        System.out.println("Is this: " + filmToBeGuessed.getTitle() + "?");
        System.out.println(filmToBeGuessed.getTitleUndercover());
    }
}
