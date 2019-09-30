package com.stackroute.pe2;

public class PowerOfFour {
    public PowerOfFour() //creating constructor for class
    {

    }
    public boolean isPower(long input) //this method return a boolean value
    {

        if(input == 0)
        {
            return false;
        }

        while (input != 1)  //if the given input is notequal to 1 it enter into loop
        {
            if( input % 4 != 0 ) //it checks condition gor power of 4

                return false;

            input = input/4;

        }return true;
    }
}

