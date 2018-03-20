package com.company;

import java.io.FileNotFoundException;

public class Game {

    private int attempts;
    private String titleUndercover;
    private String titleUncovered;


    public Game() throws FileNotFoundException {
        this.titleUncovered = (filmToBeGuessed.getTitle());
        this.titleUndercover = coverTitle(filmToBeGuessed.getTitle());
        setAttempts(15);
    }

    Film filmToBeGuessed = new Film ();

    public String getTitleUndercover() {
        return titleUndercover;
    }

    public String getTitleUncovered() {
        return titleUncovered;
    }

    public void setTitleUndercover(String titleUndercover) {
        this.titleUndercover = titleUndercover;
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

        StringBuilder titleUndercoverBuilder = new StringBuilder(titleUndercover);
    if (titleUncovered.contains(guess)){
        int j=0;
        for (int i = 0; i < titleUncovered.length(); i++) {
            if (titleUncovered.indexOf(guess, j) < 0) break;
            else
            titleUndercoverBuilder.setCharAt(titleUncovered.indexOf(guess, j), guess.charAt(0));
            j++;

        }

//        titleUndercoverBuilder.setCharAt(titleUncovered.indexOf(guess, guess.charAt(0)));


    }

        return titleUndercoverBuilder.toString();
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

}
