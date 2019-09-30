package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class WordFrequencyTest {
    public static WordFrequency wordFrequency;

    @BeforeClass
    public static void setUp()
    {

        wordFrequency = new WordFrequency();
    }

    @AfterClass
    public static void tearDown()
    {

        wordFrequency = null;
    }

    @Test
    public void givenFileShouldReturnTestForWordFrequencyMessage()
    {
        List<WordFrequency.WordCount> result = wordFrequency.findWordfrequency("/home/poornima/Desktop/file.txt");
        assertEquals(43, result.size());
        assertEquals("5.", result.get(0).word);
        assertEquals(1, result.get(0).count);
        assertEquals("Write", result.get(1).word);
        assertEquals(1, result.get(1).count);
    }

    @Test
    public void givenFileShouldReturnTestForWordFrequencyFailureMessage()
    {
        List<WordFrequency.WordCount> result = wordFrequency.findWordfrequency("/home/poornima/Desktop/FileDemo1.txt");
        assertNull(null,result);
    }
//
//    @Test
//    public void testForWordFrequencySuccess()
//    {
//        List<WordFrequency.WordCount> result = wordFrequency.findWordfrequency("/home/poornima/Desktop/sample.txt");
//        assertEquals("Write", result.get(1).word);
//        assertEquals(3, result.get(1).count);
//    }



}


