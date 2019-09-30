package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {
    public static StringTranspose stringTranspose;

    @BeforeClass
    public static void setUp(){
        stringTranspose=new StringTranspose();
    }

    @AfterClass
    public static void tearDown(){
        stringTranspose=null;
    }

    @Test
    public void givenStringShouldReturnReverseOfEachWordMessage(){

        assertEquals("i ma aminroop ",stringTranspose.transposeEachWordInAString("i am poornima"));

        assertEquals("siht si kcats etuor 321 ",stringTranspose.transposeEachWordInAString("this is stack route 123"));


    }

    @Test
    public void givenStringShouldReturnReverseOfEachWordErrorMessage(){

        assertNotEquals("i am aminroop ",stringTranspose.transposeEachWordInAString("i am poornima"));

        assertNotEquals("siht si kcats etuor 123 ",stringTranspose.transposeEachWordInAString("this is stack route 123"));

        assertNull(stringTranspose.transposeEachWordInAString(null));

        assertNotEquals("i am aminroop ",stringTranspose.transposeEachWordInAString(" "));
    }

}