package com.stackroute.pe1;

public class SumOfIntegers {
    public String getSumOfArguments(String numbers)
        {try {
            int sum = 0;
            String[] arr = numbers.split(" "); //the string elements are splited with space
            int[] intarr = new int[arr.length];

            for (int i = 0; i < arr.length; i++)  //for counting numbers using for loop
            {
                {
                    intarr[i] = Integer.parseInt(arr[i]); //type casting
                }

                sum = sum + intarr[i];
            }return sum + "";
        }
        catch (Exception e)         //handaling exception
        {
            return "Please enter all integers";

        }

        }

}
