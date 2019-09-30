package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAndLastDayOfWeekTest {
    public static FirstAndLastDayOfWeek findFirstAndLastDayOfWeek;

    @BeforeClass
    public static void setUp()
    {
        findFirstAndLastDayOfWeek = new FirstAndLastDayOfWeek();
    }

    @AfterClass
    public static void tearDown()
    {
        findFirstAndLastDayOfWeek = null;
    }

    @Test
    public void testForFindingFirstAndLastDayOfWeek()
    {
        assertEquals("Mon 01/07/2019 Sun 07/07/2019",findFirstAndLastDayOfWeek.getFirstAndLastdayOfWeek());

    }

}