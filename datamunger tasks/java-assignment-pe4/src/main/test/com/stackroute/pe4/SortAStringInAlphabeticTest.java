package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortAStringInAlphabeticTest {
    public static SortAStringInAlphabetic sortAStringInAlphabetic;

    @BeforeClass
    public static void setUp(){
        sortAStringInAlphabetic=new SortAStringInAlphabetic();
    }

    @AfterClass
    public  static void tearDown(){
        sortAStringInAlphabetic=null;
    }

    @Test
    public void givenStringShouldReturnSortedStringMessage(){

        assertEquals("is my name poornima ",sortAStringInAlphabetic.sortString("my name is poornima"));

        assertEquals("is my name poornima ",sortAStringInAlphabetic.sortString("my name is Poornima"));

        assertEquals("123 my name poornima ",sortAStringInAlphabetic.sortString("my name 123 poornima"));
    }

    @Test
    public void givenStringShouldReturnErrorSortedStringMessage(){

        assertNotEquals("my name is poornima ",sortAStringInAlphabetic.sortString("my name is poornima"));

        assertNotEquals("is my name Poornima ",sortAStringInAlphabetic.sortString("my name is Poornima"));

        assertEquals("",sortAStringInAlphabetic.sortString(" "));

        assertNull(sortAStringInAlphabetic.sortString(null));
    }

}