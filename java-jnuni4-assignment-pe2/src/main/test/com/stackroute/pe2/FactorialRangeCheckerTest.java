package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialRangeCheckerTest {

    public static FactorialRangeChecker factorialRangeChecker;

    @BeforeClass
    public static void setUp(){

        factorialRangeChecker=new FactorialRangeChecker();
    }

    @AfterClass
    public static void tearDown(){

        factorialRangeChecker=null;
    }

    @Test
    public void givenNumberShouldReturnTestForintFactorialSuccessMessage()
    {
        assertEquals("6",factorialRangeChecker.intFactorial(3));
        assertEquals("1932053504",factorialRangeChecker.intFactorial(13));
        assertEquals("factorial out of range",factorialRangeChecker.intFactorial(20));
    }

    @Test
    public void givenNumberShouldReturnTestForintFactorialFailureMessage()
    {
        assertEquals("factorial out of range",factorialRangeChecker.intFactorial(20));
        assertNotEquals("factorial out of range",factorialRangeChecker.intFactorial(-12));
    }

    @Test
    public void givenNumberShouldRetunTestForLongFactorialSuccessMessage()
    {
        assertEquals("6",factorialRangeChecker.intFactorial(3));
        assertEquals("1932053504",factorialRangeChecker.intFactorial(13));
        assertEquals("2432902008176640000",factorialRangeChecker.longfactorial(20));
        assertEquals("7034535277573963776",factorialRangeChecker.longfactorial(25));
        assertEquals("factorial out of range",factorialRangeChecker.longfactorial(30));
    }

    @Test
    public void givenNumberShouldReturnTestForLongFactorialFailureMessage()
    {
        assertEquals("factorial out of range",factorialRangeChecker.longfactorial(30));
        assertNotEquals("factorial out of range",factorialRangeChecker.intFactorial(-12));
    }

}