package com.company;


public class GameManager {

    private int attemptCounter;
    private GameStatus status;

    private MovieTitleLoader loader = new MovieTitleLoader();
    private MaskedString title;

    public GameManager(int attempts) {
        this.title = new MaskedString(loader.getRandomMovieTitle());
        this.status = (GameStatus.PENDING);
        this.attemptCounter = attempts;
    }

    public void guess (char c) {
        title.setMaskedString(title.tryToRevealLetter(c));
        attemptCounter -- ;
        if (title.tryToRevealLetter(c) == title.getUnmaskedString()) setStatus(GameStatus.SUCCESS);
        }
    public void guess (String s) {
        title.setMaskedString(title.tryToRevealString(s));
        attemptCounter -- ;
        if (title.tryToRevealString(s) == title.getUnmaskedString()) setStatus(GameStatus.SUCCESS);
    }

    public void checkAttemptsCounter () {
        if (!(attemptCounter > 0)) {
            status = (GameStatus.GAMEOVER);
        }
    }

    public int getAttemptCounter() {
        return attemptCounter;
    }

    public void setAttemptCounter(int attemptCounter) {
        this.attemptCounter = attemptCounter;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public MaskedString getTitle() {
        return title;
    }

}

