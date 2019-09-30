package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class CountWordsInAString {

    public Map<String, Integer> wordCount(String str){

        if(str==null){
            return null;
        }

        String str1=str.replaceAll("[!@#$%&*?,_ ]"," ");


        String[] str2=str1.split(" ");

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String s:str2) {

            if (!map.containsKey(s))  //if it a empty string it returns value as 1
            {
                                        // first time we've seen this string
                map.put(s, 1);
            }
            else
                {
                int count = map.get(s); //get is a method for getiing keys

                map.put(s, count + 1);  //counting
            }
        }
        return map;

    }

}
