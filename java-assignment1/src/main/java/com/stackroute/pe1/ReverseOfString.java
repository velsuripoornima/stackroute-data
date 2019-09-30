package com.stackroute.pe1;
import java.util.Scanner;

public class ReverseOfString {
    public String reverse(String str){ //reverse is a method name
        if (str == null) {

            return null;
        }
        String reverse="";


        for (int  i=str.length()- 1;i >= 0;i--){

            reverse=reverse + str.charAt(i); //it check character by character and it will add to reverse string
        }
        return "reverse string is:"+reverse;
    }
}
