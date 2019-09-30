package com.stackroute.pe2;

public class CheckPalindromOrNot
{
    public CheckPalindromOrNot() //creating constructor for the class
    {

    }

    public String palindrom(String input) {
            try{
                if(input==null)   //this stmt contains if given input is null it will return null
                {
                    return null;
                }

                    StringBuilder reverse=new StringBuilder(); //stringbuilder class is used for string inbuilt methods
                    for(int i=input.length()-1;i>=0;i--){
                        reverse.append(input.charAt(i));  //append is the string builder method
                    }

                    return input.contentEquals(reverse) ? "palindrom" : "Not a palindrom";  //ternary operator used to check palindrom or not
                }
            catch (Exception e) //handling exception
            {
                return null;
            }
    }
}
