package com.company;

import java.io.FileNotFoundException;

public class Film {

    TitlesListManager myTitlesListManager = new TitlesListManager ();

    private String title;
    private String titleUndercover;
    private int random = (int ) Math.random()*(myTitlesListManager.TitlesList.size()+1);

    public Film() throws FileNotFoundException {
        this.title = myTitlesListManager.TitlesList.get(random);
        this.titleUndercover = coverTitle(title);
    }

    public String getTitle() {
        return title;
    }

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


}





