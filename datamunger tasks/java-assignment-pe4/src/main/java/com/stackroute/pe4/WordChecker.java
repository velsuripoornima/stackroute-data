package com.stackroute.pe4;

public class WordChecker {
    public WordChecker(){

    }

    public boolean wordPresentOrNot(String word){
        if(word==null){
            return false;
        }
        if(word!=null || word !=" ") //this return statement return if Harry is present in astring return true otherwise false
        {
            return word.matches("[a-zA-z_0-9@!#$%^&* ]*Harry[a-zA-z_0-9@!#$%^&*  ]*") ? true : false;
        }

        return false;
    }
}
