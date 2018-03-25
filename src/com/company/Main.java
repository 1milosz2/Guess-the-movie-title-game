package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String input;

        GameManager myGameManager = new GameManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey let's guess the movie title");

        System.out.println(myGameManager.title.getMaskedString());

        System.out.println("How many attempts you want to have?");

//        myGameManager.setAttemptCounter(scanner.nextInt());
//        scanner.reset();

        while (true) {
            myGameManager.checkAttemptsCounter();
            switch (myGameManager.getStatus()) {
                case PENDING:
                    System.out.println("You have " + myGameManager.getAttemptCounter() + " attempts left.");
                    System.out.println(myGameManager.title.getMaskedString());
                    input = scanner.nextLine();
                    if (input.length() > 1) {
                        myGameManager.guess(input);
                    } else myGameManager.guess(input.charAt(0));
                    break;
                case SUCCESS:
                    System.out.println("Congratulations you have won");
                    System.exit(0);
                case GAMEOVER:
                    System.out.println("Unfortunately you lost");
                    System.out.println("It was " + myGameManager.title.getUnmaskedString());
                    System.exit(0);
            }
        }
    }
}

