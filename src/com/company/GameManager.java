package com.company;

import static com.company.GameStatus.SUCCESS;

public class GameManager {

    private int attemptCounter;
    private GameStatus status;


    private MovieTitleLoader loader = new MovieTitleLoader();
    MaskedString title = new MaskedString(loader.getRandomMovieTitle());


    public GameManager() {
        this.title = getTitle();
    }

    public void guess (char c) {
        String outcome = title.tryToRevealLetter(c);
        attemptCounter -- ;
        if (outcome == title.getUnmaskedString()) status = SUCCESS;
        }
    public void guess (String s) {
        String outcome = title.tryToRevealString(s);
        attemptCounter -- ;
        if (outcome == title.getUnmaskedString()) status = SUCCESS;
    }

    public MaskedString getTitle() {
        return title;
    }

    public void setAttemptCounter(int attemptCounter) {
        this.attemptCounter = attemptCounter;
    }

    public int getAttemptCounter() {
        return attemptCounter;
    }

    public GameStatus getStatus() {
        return status;
    }
}

