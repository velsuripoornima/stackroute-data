package com.stackroute.pe1;
import java.util.Scanner;

public class RepeatChar {

    public String repeat(String str,int number) //method declaration
    {
        if(str==null){  //if string is null it will return null
            return  null;
        }
        String result="",result1=""; // here i am declaring to empty string for storing result

        for(int i=0;i<=number - 1;i++)  //loop is used for repeat statement untill the condition fails
        {
            result1 += str.substring(str.length() - number);//repeat string considering the given input number

            result=str+result1;
        }
        return result.trim();
    }
}
