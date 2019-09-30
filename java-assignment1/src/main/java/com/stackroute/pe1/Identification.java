package com.stackroute.pe1;
import java.util.Scanner;

public class Identification{
    public String classifyCharactor(String letter){

        char input=letter.charAt(0); //by using charAt() method ,it takes only first char from the given string
        if(input >= 'a' && input <='z') //it checks the given char is small letter or not
        {
            return input+" is Small letter";
        }
        else if(input >= 'A' && input <= 'Z')  // it checks given char is capital letter or not
        {
            return input+" is Capital letter";
        }
        else if(input >= '0' && input <='9' )  // it checks it is a digit or not
        {
            return input+" is number";
        }
        //it checks it is a special symboll or not
        else if(input =='!' || input == '@' || input == '#' || input == '$' || input == '%' || input == '^' || input =='&'||input=='*')
        {
            return input+" is Symbol";
        }
        return "null".trim();  //trim() is used for removeing spaces
    }

}