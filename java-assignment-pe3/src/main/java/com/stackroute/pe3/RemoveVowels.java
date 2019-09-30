package com.stackroute.pe3;

public class RemoveVowels {
    public RemoveVowels(){

    }
    public String[] isVowelRemove(String[] words){
        if(words == null)
        {
            return  null;
        }

        String word1[]=new String[words.length];
        int i=0;

        for(String word: words)
        {
            if(word==null)
            {
                word1[i++]=null;
            }
            else
                {
            word1[i++] = word.replaceAll("[aeiou]","");
            System.out.println(word);
            }

        }
        return word1;
    }
}
