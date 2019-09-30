package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    public static ConsecutiveNumbers consecutiveNumbers;

    @BeforeClass
    public static void setUp()
    {
        consecutiveNumbers = new ConsecutiveNumbers();
    }

    @AfterClass
    public static void tearDown()
    {
        consecutiveNumbers = null;
    }

    @Test
    public void testForConsecutiveArraysSuccess()
    {
        assertEquals("Consecutive numbers", consecutiveNumbers.isConsecutiveNumbers("1,2,3,4,5"));

        assertEquals("Consecutive numbers", consecutiveNumbers.isConsecutiveNumbers("54,56,55,57,58"));

        assertEquals("Consecutive numbers", consecutiveNumbers.isConsecutiveNumbers("-1,-2,-3,-4,-5"));
    }


    @Test
    public void testForConsecutiveArraysFailure()
    {
        assertEquals("Non Consecutive numbers", consecutiveNumbers.isConsecutiveNumbers("1,2,3,4,5,5"));

        assertEquals("Non Consecutive numbers", consecutiveNumbers.isConsecutiveNumbers("54,55,57,58"));

        assertEquals("Non Consecutive numbers", consecutiveNumbers.isConsecutiveNumbers("-10,-2,-3,-4,-5"));

        assertEquals("Please enter all integers", consecutiveNumbers.isConsecutiveNumbers("-10,-2,-3,-4,h,9"));

        assertEquals("Please enter all integers", consecutiveNumbers.isConsecutiveNumbers(null));

        assertEquals("Please enter all integers", consecutiveNumbers.isConsecutiveNumbers(""));
    }

}