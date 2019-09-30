package com.stackroute.pe4;

//this program demongstrates replacing one character to abnother charactor in a string

public class StringReplace {
    public StringReplace()  //create private constrctor
    {

    }

    public String replaceChar(String words)  //this method return replace string
    {
        if(words==null || words==" ")   //if the string null or empty return null
        {
            return null;
        }
    else
        {

        String word = words.replace("d", "f").replace("l","t");

        return word;
        }
    }
}