package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String input;
        boolean repeat = true;

        GameManager myGameManager = new GameManager(15);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey let's guess the movie title");

        System.out.println(myGameManager.getTitle().getMaskedString());

        System.out.println("How many attempts you want to have?");

        myGameManager.setAttemptCounter(Integer.parseInt(scanner.nextLine()));

        while (repeat) {
            myGameManager.checkAttemptsCounter();
            switch (myGameManager.getStatus()) {
                case PENDING:
                    System.out.println("You have " + myGameManager.getAttemptCounter() + " attempts left.");
                    System.out.println(myGameManager.getTitle().getMaskedString());
                    input = scanner.nextLine();
                    if (input.length() > 1) {
                        myGameManager.guess(input);
                    } else myGameManager.guess(input.charAt(0));
                    break;
                case SUCCESS:
                    System.out.println("Congratulations you have won");
                    repeat = false;
                case GAMEOVER:
                    System.out.println("Unfortunately you lost");
                    System.out.println("It was " + myGameManager.getTitle().getUnmaskedString());
                    repeat = false;
            }
        }

        System.exit(0);
    }
}

