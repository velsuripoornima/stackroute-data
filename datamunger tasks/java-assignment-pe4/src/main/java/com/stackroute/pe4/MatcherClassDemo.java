package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//this program demongstrates that using matcher class find multiple matches in a given string
public class MatcherClassDemo {

    public MatcherClassDemo(){

    }
    public String matcherClass(String string,String word){
        String range=" ";

        String patternString = word;

        Pattern pattern = Pattern.compile(patternString,Pattern.CASE_INSENSITIVE); //compiling the given word

        Matcher matcher = pattern.matcher(string);

        while(matcher.find()) //through find method we are finding the word in a string
        {
            range=range.concat(+ matcher.start() + " - " + matcher.end()+" ");

        }
        return range;
    }

}
