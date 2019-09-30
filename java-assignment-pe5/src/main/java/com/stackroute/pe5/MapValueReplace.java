package com.stackroute.pe5;

import java.util.*;

//replacing map values

public class MapValueReplace {

    public Map<String,String> replaceValue(Map<String,String> input){


        Iterator<Map.Entry<String, String>> itr = input.entrySet().iterator();   //takes iterator interface to iterate map

        String tempvalue=" ",tempvalue1=" ";


        while(itr.hasNext())  //it cecks map having next value or not
        {
            Map.Entry<String, String> entry = itr.next();  //it takes next value

            tempvalue1=entry.getValue();  //stores that value into temp

            input.replace(entry.getKey() , tempvalue);  //replace that value in to next key

            tempvalue=tempvalue1;

        }

        return input;
    }
}
