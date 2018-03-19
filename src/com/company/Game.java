package com.company;

import java.io.FileNotFoundException;

public class Game {

    private int attempts;
    private String titleUndercover;
    private String titleUncovered;


    public Game() throws FileNotFoundException {
        this.titleUncovered = (filmToBeGuessed.getTitle());
        this.titleUndercover = coverTitle(filmToBeGuessed.getTitle());
        setAttempts(6);
    }

    Film filmToBeGuessed = new Film ();

//    StringBuilder titleUncoveredBulider = new StringBuilder(titleUncovered);



    public String getTitleUndercover() {
        return titleUndercover;
    }

    public String coverTitle (String title) {

        char [] titleUndercoverA = title.toCharArray();

        for (int i = 0; i < titleUndercoverA.length ; i++) {
            if (!Character.isWhitespace(titleUndercoverA[i])) {
                titleUndercoverA[i] = '*';
            }
        }
        return titleUndercover = new String (titleUndercoverA);
    }

    public String uncoverLetter (String guess, String titleUndercover) {

        StringBuilder titleUndercoverBulider = new StringBuilder(titleUndercover);
    if (titleUncovered.contains(guess)){

        titleUndercoverBulider.setCharAt(titleUncovered.indexOf(guess), guess.charAt(0));
//        titleUncoveredBulider.setCharAt(titleUncovered.indexOf(guess, guess.charAt(0)));


    }

        return titleUndercoverBulider.toString();
    }



    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public void setTitleUncovered(String titleUncovered) {
        this.titleUncovered = titleUncovered;
    }

    public String getTitleUncovered() {
        return titleUncovered;
    }
}
