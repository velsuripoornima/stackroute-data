package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterFrequencyTest {

    public static CharacterFrequency characterFrequency;

    @BeforeClass
    public static void setUp()
    {
        characterFrequency = new CharacterFrequency();
    }

    @AfterClass
    public static void tearDown()
    {
        characterFrequency = null;
    }

    @Test
    public void givenStringShouldReturnCountOfGivenLetter()
    {
        assertEquals("2", characterFrequency.getCharacterFrequency("I am poornima",'o'));
    }

    @Test
    public void givenStringShouldReturnDoesnotExistmessage()
    {
        assertEquals("Character does not exist in the string", characterFrequency.getCharacterFrequency("I am poornima",'b'));
    }

    @Test
    public void givenNullShouldReturnErrorMessage()
    {
        assertEquals("String must not be null or empty", characterFrequency.getCharacterFrequency(null,'a'));
    }

}