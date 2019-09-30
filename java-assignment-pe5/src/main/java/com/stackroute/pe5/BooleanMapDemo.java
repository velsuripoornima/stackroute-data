package com.stackroute.pe5;


import java.util.HashMap;
import java.util.Map;

public class BooleanMapDemo {

    public Map<String,Boolean> mapboolean(String[] str)

    {
        if(str==null){
            return null;
        }

        Map<String,Boolean> boolmap=new HashMap<>();

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String s:str) {

            if (!map.containsKey(s))  //if it a empty string it returns value as 1
            {
                                        // first time we've seen this string
                map.put(s, 1);
                boolmap.put(s,false);
            }
            else
            {
                int count = map.get(s); //get is a method for getiing keys

                map.put(s, count + 1); //counting
                boolmap.put(s,true);
            }
        }

        return boolmap;
    }
}
