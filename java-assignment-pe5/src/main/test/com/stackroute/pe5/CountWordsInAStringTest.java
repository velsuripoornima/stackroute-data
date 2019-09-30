package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountWordsInAStringTest {

    public static CountWordsInAString countWordsInAString;

    @BeforeClass
    public static void setUP(){
        countWordsInAString=new CountWordsInAString();
    }

    @AfterClass
    public static void tearDown(){
        countWordsInAString=null;
    }

    @Test
    public void givenStringShouldReturnMapResultMessage(){

        Map<String,Integer> result=new HashMap<>();

        result.put("one",2);

        result.put("two",2);

        result.put("three",2);

        assertEquals(result,countWordsInAString.wordCount("one two_three,one,two@three"));
    }

    @Test
    public void givenEmptyStringShouldReturnMapResultMessage(){

        Map<String,Integer> result=new HashMap<>();

        result.put("",1);

        assertEquals(result,countWordsInAString.wordCount(""));
    }

    @Test
    public void givenNullStringShouldReturnMapResultMessage(){

        assertNull(countWordsInAString.wordCount(null));
    }

    @Test
    public void givenNumberStringShouldReturnMapResultMessage(){

        Map<String,Integer> result=new HashMap<>();

        result.put("123",2);

        result.put("one",2);

        result.put("two",2);

        result.put("three",2);

        assertEquals(result,countWordsInAString.wordCount("one 123 two_three,one,123 two@three"));
    }

}