package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {

    public static RemoveVowels removeVowels;

    @BeforeClass
    public static void setUp(){

        removeVowels=new RemoveVowels();
    }

    @AfterClass
    public static void tearDown(){
        removeVowels=null;
    }

    @Test
    public void givenStringArrayShouldReturnRemovalOfVowelsMessage()
    {
        assertArrayEquals(new String[]{"prnm","bcd"},removeVowels.isVowelRemove(new String[]{"poornima","abcd"}));

        assertArrayEquals(new String[]{"prnm",null  },removeVowels.isVowelRemove(new String[]{"poornima",null}));

        assertArrayEquals(new String[]{"prnm",""},removeVowels.isVowelRemove(new String[]{"poornima",""}));

        assertArrayEquals(new String[]{"1234","bcd"},removeVowels.isVowelRemove(new String[]{"1234","abcd"}));

        assertArrayEquals(null,removeVowels.isVowelRemove(null));
    }

}