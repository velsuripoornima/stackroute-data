package com.stackroute.pe1;


public class CheckConsonantsOrVowel {

    public String isVowel(String word) { //isVowel is method name
            String result="";  //it stores a result value
        if(word==null){
            return null;
        }
        for(int i = 0; i < word.length(); i++) // loop for checking each char in given string
        {
            char letter = word.charAt(i);
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter =='o' || letter == 'u' || letter=='A' || letter=='E'|| letter=='I' ||letter=='O' || letter=='U'){
                result += " Vowel";
            }
            else if((letter > 'a' && letter < 'z' ) || (letter>'A' && letter<'Z')) {
                result += " Consonant";
            }

        }return result.trim(); //trim() is used for removing white spaces from front and end

    }
}
