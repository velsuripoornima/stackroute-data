package com.stackroute.pe2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class WordFrequency {
    public WordFrequency()
    {

    }

    public class WordCount
    {
        String word;
        int count;
    }

    public List<WordCount> findWordfrequency(String filePath)
    {
        try {

            int i;

            FileReader fileReader = new FileReader(filePath);

            List<WordCount> wordCountList = new ArrayList<>();

            String fileContent = "";

            while((i = fileReader.read()) != -1)
            {
                fileContent += (char)i;
            }

            String words[] = fileContent.split(" ");

            int wordCount = 0;

            Stream<String> distinctWords = Arrays.stream(words).distinct();

            String[] distinctWordsArray = distinctWords.toArray(String[]::new);

            for (int k =0; k<distinctWordsArray.length; k++) {

                for(int j=0; j < words.length ; j++)
                {
                    if(distinctWordsArray[k].trim().contentEquals(words[j].trim()))
                    {
                        wordCount++;
                    }
                }
                WordCount eachWordCount = new WordCount();

                eachWordCount.word = distinctWordsArray[k];

                eachWordCount.count = wordCount;

                wordCountList.add(eachWordCount);

                wordCount = 0;
            }

            return wordCountList;
        }
        catch (Exception exception)
        {
            return null;
        }
    }
}
