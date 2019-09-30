package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPalindromOrNotTest {
    public  static  CheckPalindromOrNot checkPalindromOrNot;
    @BeforeClass
    public static void setUp(){
        checkPalindromOrNot=new CheckPalindromOrNot();
    }
    @AfterClass
    public static void tearDown(){
        checkPalindromOrNot=null;
    }
    @Test
    public void givenStringShouldReturnTestForCheckPalindronOrNotMessage(){
        //Arrange
        //Act,assert

        assertEquals("palindrom",checkPalindromOrNot.palindrom("abcba"));

        assertEquals("palindrom",checkPalindromOrNot.palindrom("1234321"));

        assertEquals("palindrom",checkPalindromOrNot.palindrom("@#@"));

        assertEquals("palindrom",checkPalindromOrNot.palindrom(" "));


    }
    @Test
    public void givenStringShouldReturnTestForCheckPalindronOrNotFailureMessage(){
        //Arrange
        //Act,assert

        assertEquals("Not a palindrom",checkPalindromOrNot.palindrom("poornima"));

        assertEquals("Not a palindrom",checkPalindromOrNot.palindrom("1231"));

        assertEquals("Not a palindrom",checkPalindromOrNot.palindrom("@#@$%"));

        assertEquals("Not a palindrom",checkPalindromOrNot.palindrom(" 0"));

        assertNotEquals("palindrom",checkPalindromOrNot.palindrom("-1"));

        assertNull(null,checkPalindromOrNot.palindrom(null));
    }
}