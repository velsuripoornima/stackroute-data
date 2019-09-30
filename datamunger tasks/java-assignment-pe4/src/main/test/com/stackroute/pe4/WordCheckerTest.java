package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordCheckerTest {
    public static WordChecker wordChecker;

    @BeforeClass
    public static void setUp(){
        wordChecker=new WordChecker();
    }

    @AfterClass
    public static void tearDown(){
        wordChecker=null;
    }

    @Test
    public void givenStringShouldReturnBooleanMessage()
    {
        assertEquals(true,wordChecker.wordPresentOrNot("This is Harry"));

        assertEquals(true,wordChecker.wordPresentOrNot("This @ Harry"));

        assertEquals(true,wordChecker.wordPresentOrNot("123 Harry"));
    }

    @Test
    public void givenStringShouldReturnBooleanFalseMessage()
    {
        assertFalse(wordChecker.wordPresentOrNot(""));

        assertFalse(wordChecker.wordPresentOrNot(null));

    }

}