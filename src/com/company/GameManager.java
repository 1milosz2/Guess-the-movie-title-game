package com.company;

import static com.company.GameStatus.SUCCESS;

public class GameManager {

    private int attemptCounter;
    private GameStatus status;


    private MovieTitleLoader loader = new MovieTitleLoader();
    MaskedString title = new MaskedString(loader.getRandomMovieTitle());


    public GameManager() {
        this.title = getTitle();
        setStatus(GameStatus.PENDING);
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

    public void checkAttemptsCounter () {
        if (!(attemptCounter > 0)) {
            status = GameStatus.GAMEOVER;
        }
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

    public void setStatus(GameStatus status) {
        this.status = status;
    }
}

