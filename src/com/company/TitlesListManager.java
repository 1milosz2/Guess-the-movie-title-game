package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TitlesListManager {

    File file = new File("Movie titles list.txt");
    Scanner scanner = new Scanner(file);
    ArrayList<String> TitlesList = new ArrayList<String>();

    public TitlesListManager() throws FileNotFoundException {
        this.TitlesList = readListFromFile();
    }

    public ArrayList<String> readListFromFile () {
        while (scanner.hasNextLine()) {
        TitlesList.add(scanner.nextLine());
    }
        return TitlesList;
    }

    public String getTitle (int i){
        return TitlesList.get(i);
    }

}
