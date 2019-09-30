package com.stackroute.pe3;

import java.util.Arrays;

public class ConsecutiveNumbers  //this program checks the numbers are consecutive numbers or not
{
    public ConsecutiveNumbers()  //creating constructor for class
    {

    }

    public String isConsecutiveNumbers(String numbers)
    {
        try {

            String result="";

            String[] numberStrings = numbers.trim().split(",");

            int[] numArray = new int[numberStrings.length];

            for (int i = 0; i < numArray.length; i++)
            {
                numArray[i] = Integer.parseInt(numberStrings[i]);
            }

            Arrays.sort(numArray);

            for (int i=0; i < numArray.length-1; i++)
            {
                if(numArray[i] + 1 != numArray[i+1])
                {
                    result=result.concat( "Non Consecutive numbers");
                }
            }

            result=result.concat( "Consecutive numbers");

            return result;

        }
        catch (Exception exception)
        {
            return "Please enter all integers";
        }
    }
}
