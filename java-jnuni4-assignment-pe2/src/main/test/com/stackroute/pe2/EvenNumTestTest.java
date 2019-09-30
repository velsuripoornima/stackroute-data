package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    public static EvenNumTest evenNumTest;
    @BeforeClass
    public static void setUp(){
        evenNumTest=new EvenNumTest();
    }
    @AfterClass
    public static void tearDown(){
        evenNumTest=null;
    }
    @Test
    public void givenNumberShouldReturnTestForIsEvenSuccessMessage()
    {
        assertEquals(true, EvenNumTest.isEven(24));

        assertEquals(true, EvenNumTest.isEven(0));

        assertEquals(true, EvenNumTest.isEven(-6524));

        assertNotEquals(true,EvenNumTest.isEven(-23));
    }

    @Test
    public void givenNumberShouldReturnTestForIsEvenFailureMessage()
    {
        assertEquals(false, EvenNumTest.isEven(245));

        assertEquals(false, EvenNumTest.isEven(987654287));

        assertEquals(false, EvenNumTest.isEven(-65249));
    }

}