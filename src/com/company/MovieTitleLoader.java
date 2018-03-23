package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MovieTitleLoader {

    private int random;

    private File file = new File("Movie titles list.txt");
    private Scanner scanner;

    {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public MovieTitleLoader() {
        readListFromFile();
    }

    ArrayList<String> TitlesList = new ArrayList<>();

    private ArrayList<String> readListFromFile() {
        while (scanner.hasNextLine()) {
        TitlesList.add(scanner.nextLine());
    }
        return TitlesList;
    }

    public String getRandomMovieTitle(){
        random = new Random().nextInt(TitlesList.size()) + 1;
        return TitlesList.get(random);
    }

}
