package com.dfcore.secretdiary;

import java.util.ArrayList;

public class SecretDiary {

    ArrayList<String> entries = new ArrayList<>();

    public ArrayList<String> readDiary(){


        return entries;

    }

    public void writeDiary(String newEntry){
        entries.add(newEntry);
    }
}
