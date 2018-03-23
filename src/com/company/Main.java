package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        GameManager myGameManager = new GameManager();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Hey let's guess the movie title");

        System.out.println(myGameManager.title.getMaskedString());

        System.out.println("How many attempts you want to have?");

        myGameManager.setAttemptCounter(scanner.nextInt());
        String aguess = scanner.nextLine();

        while (myGameManager.getAttemptCounter()>0) {

            System.out.println("You have " + myGameManager.getAttemptCounter() + " attempts left");

            String guess = scanner.nextLine();

//            switch (guess.length()) {
//                case 0:
//                    System.out.println("Try");
//                    break;
//                case 1:
//                    myGameManager.setTitleUndercover(myGameManager.uncoverLetter(guess, myGameManager.getTitleUndercover()));
//                    break;
//                default:
//                    if (guess.equals(myGameManager.getTitleUncovered())) {
//                        System.out.println("Congratulations, you have won");
//                        System.out.println("It was " + myGameManager.getTitleUncovered());
//                        System.exit(0);
//                    } else System.out.println("It's not a hidden title. If your not certain guess single letters");
//            }
//
//
////                System.out.println(myGameManager.getTitleUncovered());
//            System.out.println(myGameManager.getTitleUndercover());
//
//            myGameManager.setAttemptCounter(myGameManager.getAttemptCounter() - 1);
//        }
//
//
//        System.out.println("All attempts have been used. Try once more");
//        System.out.println("It was " + myGameManager.getTitleUncovered());

        }

    }

}
