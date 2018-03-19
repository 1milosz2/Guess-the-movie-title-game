package com.company;

import java.io.FileNotFoundException;

public class Film {

    TitlesListManager myTitlesListManager = new TitlesListManager ();

    private String title;
    private int random = (int ) Math.random()*(myTitlesListManager.TitlesList.size()+1);

    public Film() throws FileNotFoundException {
        this.title = myTitlesListManager.TitlesList.get(random);
    }

    public String getTitle() {
        return title;
    }






}





