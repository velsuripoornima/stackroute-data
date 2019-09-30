package com.stackroute.pe4;

//this programe demongstrates reverse of each word in a string and return string value

public class StringTranspose
{
    public StringTranspose(){

    }

    public String transposeEachWordInAString(String str)

    {
        if(str==null)
        {
        return null;
        }

        String[] words = str.split(" "); //here split string by spaces

        String reversedString = "";  //here takes empty string to store reverse string

        for (int i = 0; i < words.length; i++)  //this for loop words array and increament the value
        {
            String word = words[i];  //each word we are converting again as a string

            String reverseWord = "";

            for (int j = word.length() - 1; j >= 0; j--)  //taking each word and reversing the words
            {

                reverseWord = reverseWord+word.charAt(j); //here merge all characters as a string
            }

            reversedString = reversedString .concat(reverseWord + " "); //here concate all words
        }

        return reversedString;  //return string
    }
}
