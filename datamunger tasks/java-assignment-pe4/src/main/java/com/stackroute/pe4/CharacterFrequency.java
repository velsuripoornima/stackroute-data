package com.stackroute.pe4;

//Write a java program to count the total number of occurrences of a given character in a ​ string
//without using any loop?

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

    public class CharacterFrequency {

        public CharacterFrequency()
        {

        }

        public String getCharacterFrequency(String line, char letter)
        {
            String result;

            if(line != null && !line.isEmpty()) {

                String[] lineArray = line.split("");

                //Get count of each character
                Map<String, Long> map = Arrays.stream(lineArray).collect(Collectors.groupingBy(s -> s, Collectors.counting()));

                //obtain the value of specified key
                if (map.containsKey(Character.toString(letter))) {
                    result = map.get(Character.toString(letter)).intValue() + "";
                }
                else
                {
                    result = "Character does not exist in the string";
                }
            }
            else
            {
                result = "String must not be null or empty";
            }

            return result;
        }

    }

