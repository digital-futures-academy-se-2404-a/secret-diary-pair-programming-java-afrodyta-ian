package com.dfcore.secretdiary;

import java.util.ArrayList;

public class SecretDiary {

    ArrayList<String> entries = new ArrayList<>();
    boolean isLocked = false;

    public ArrayList<String> readDiary(){
        if(isLocked){ return new ArrayList<String>();}

        return entries;

    }

    public void writeDiary(String newEntry){
        if(!isLocked){entries.add(newEntry);}

    }

    public boolean lockStatus(){
        return isLocked;
    }

    public void lock(){
        isLocked = true;
    }

    public void unlock(String pin){
        if (pin.equals("1234")){isLocked = false;}
    }


}
