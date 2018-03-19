package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Game myGame = new Game();
        Scanner scanner = new Scanner(System.in);
        StringBuilder myName = new StringBuilder(myGame.getTitleUndercover());


        System.out.println(myName);


        System.out.println("Hey let's guess the film title");

        System.out.println(myGame.getTitleUndercover());

        while (myGame.getAttempts() > 0) {

            System.out.println("Guess a letter");
            System.out.println("You have " + myGame.getAttempts() + " attempts left");

            String guess = scanner.next();


            if (guess.length() > 1) {
                if (guess.equals(myGame.getTitleUncovered())) {
                    System.out.println("Congratulation you won");
                }
                else System.out.println("It's not a hidden title. If your not certain guess single letters");
            }

            myGame.uncoverLetter(guess, myGame.getTitleUndercover());
            System.out.println(myGame.filmToBeGuessed.getTitle());
            System.out.println(myGame.uncoverLetter(guess, myGame.getTitleUndercover()));

         myGame.setAttempts(myGame.getAttempts()-1);
        }






    }
}
