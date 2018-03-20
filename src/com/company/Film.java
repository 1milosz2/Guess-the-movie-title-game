package com.company;

import java.io.FileNotFoundException;
import java.util.concurrent.ThreadLocalRandom;

public class Film {

    TitlesListManager myTitlesListManager = new TitlesListManager ();

    private String title;
    int random = ThreadLocalRandom.current().nextInt(0, myTitlesListManager.TitlesList.size() + 1);

    public Film() throws FileNotFoundException {
        this.title = setTitle();
    }

    public String getTitle() {
        return title;
    }


    public String setTitle() {
        return myTitlesListManager.getTitle(random);
    }


}





