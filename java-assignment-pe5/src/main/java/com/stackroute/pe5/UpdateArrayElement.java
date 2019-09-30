package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a Java program to update specific array element by given element and empty the ​ array list​

public class UpdateArrayElement
{
    public UpdateArrayElement()
    {

    }

    public List<String> replaceElement(String[] words,int index,String element)
    {
        if (words == null) {
            return null;
        }
        List<String> list_Strings = Arrays.asList(words); //converting string to arraylist

        list_Strings.set(index,element); //taking position with position element has been changed

        return list_Strings;
    }

    public List<String> clearElement(String[] words)
    {
        if(words==null)
        {
            return null;
        }
        try {
            List<String> list_Strings1 = Arrays.asList(words);

            list_Strings1.clear(); //clearing whole list

            return list_Strings1;
        }
        catch (Exception e)  //handaling exception
        {
            List<String> list=new ArrayList<>();
            return list;
        }
    }
}
