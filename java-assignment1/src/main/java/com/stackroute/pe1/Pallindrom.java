package com.stackroute.pe1;

public class Pallindrom {
    public String CheckingPalindrom(long number){
        long temp=number;
        long sum=0,remainder,rev=0;

        while (number > 0){ //condition
            remainder=number % 10;
            rev= rev * 10 + remainder;
            if(remainder % 2 ==0) //checks the given number is even or odd
            sum=remainder + sum;
            number=number/10;
        }

        if(rev==temp)  //it checks reverse of a string is same as original string (if it sstisfies)
        {
            if(sum >25)  //it will check the sum of even numbers should be greater then 25 or not
            {
                return temp + " is palindrome and the sum of even numbers is greater than 25";
            }
            else {
                return temp+ " is palindrome and sum of even numbers is less than 25";
            }

        }
        else {
            return temp+" is not palindrome";
        }
    }
}
