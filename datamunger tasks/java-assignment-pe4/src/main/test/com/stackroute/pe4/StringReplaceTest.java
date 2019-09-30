package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReplaceTest {

    public static StringReplace stringReplace;

    @BeforeClass
    public static void setUp(){
        stringReplace=new StringReplace();
    }

    @AfterClass
    public static void tearDown(){
        stringReplace=null;
    }

    @Test
    public void givenStringShouldReturnRepalceStringMessage(){

        assertEquals("faity mitk",stringReplace.replaceChar("daily milk"));

        assertEquals("poornima",stringReplace.replaceChar("poornima"));

        assertEquals("fay to fay",stringReplace.replaceChar("day to day"));
    }

    @Test
    public void givenStringShouldReturnRepalceStringErrorMessage(){

        assertNotNull(null,stringReplace.replaceChar("poornima"));

        assertNotEquals("fairy torm",stringReplace.replaceChar("Dairy form"));

        assertNull(null,stringReplace.replaceChar(" "));

        assertNull(null,stringReplace.replaceChar(null));

    }

}