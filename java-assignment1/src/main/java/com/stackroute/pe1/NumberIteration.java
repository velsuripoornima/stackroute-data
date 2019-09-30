package com.stackroute.pe1;


public class NumberIteration {
    public String iteratNumber(int number){
        String result=" ";
        for (int i=1;i<=number;i++) // it takes input and increament that number while checking with same input
        {
            for (int j=1;j<= i;j++) //it takes i as input and increamenting
            {
                 result += " "+i;  //it display the result and store into result variable
            }
        }return result.trim();
    }
}
