package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.Collections;


public class SortAStringInAlphabetic
{
    public SortAStringInAlphabetic()
    {

    }

    public String sortString(String str)
    {
        if(str==null){
        return null;
    }
        str=str.toLowerCase(); //type converting
        String wods="";
        String words[]=str.split(" "); //split the given string by spaces

        ArrayList<String> al = new ArrayList<String>();  //each word stores into array list

        for(String word:words)
        {
            al.add(word); //add() to store values
        }

        Collections.sort(al); //sorting those words

        for(String word:al)
        {
            wods=wods.concat(word+" ");  //concate all words in a string
        }

        return wods;
    }
}
