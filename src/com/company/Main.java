package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Game myGame = new Game();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey let's guess the film title");

        System.out.println(myGame.getTitleUndercover());

        System.out.println("How many attempts you want to have?");

        myGame.setAttempts(scanner.nextInt());
        String aguess = scanner.nextLine();

        while (myGame.getAttempts() > 0) {

            System.out.println("You have " + myGame.getAttempts() + " attempts left");

            String guess = scanner.nextLine();

            switch (guess.length()){
                case 0:
                    System.out.println("C'mon type in smthg");
                    break;
                case 1:
                    myGame.setTitleUndercover(myGame.uncoverLetter(guess, myGame.getTitleUndercover()));
                    break;
                default:
                    if (guess.equals(myGame.getTitleUncovered())) {
                        System.out.println("Congratulations, you have won");
                        break;
                    }
                    else System.out.println("It's not a hidden title. If your not certain guess single letters");
            }


//                System.out.println(myGame.getTitleUncovered());
            System.out.println(myGame.getTitleUndercover());

         myGame.setAttempts(myGame.getAttempts()-1);
        }

        if (myGame.getAttempts() == 0)

            System.out.println("All attempts have been used. Try once more");
        System.out.println("It was " + myGame.getTitleUncovered());
    }
}
