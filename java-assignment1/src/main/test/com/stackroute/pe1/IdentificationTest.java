package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IdentificationTest {
    Identification identification;
    @Before
    public void setUp(){
        identification=new Identification();
    }
    @After
    public void teamDown(){
        identification=null;
    }
    @Test
    public void givenStringShouldReturnSmallLetterMessage(){
        //Arrange
        //Act
        String result=identification.classifyCharactor("a");
        //Assert
        assertEquals("a is Small letter",result);
    }
    @Test
    public void givenStringShouldReturnCapitallLetterMessage(){
        //Arrange
        //Act
        String result=identification.classifyCharactor("A");
        //Assert
        assertEquals("A is Capital letter",result);
    }
    @Test
    public void givenStringShouldReturnSymbolMessage(){
        //Arrange
        //Act
        String result=identification.classifyCharactor("@");
        //Assert
        assertEquals("@ is Symbol",result);
    }
    @Test
    public void givenStringShouldReturnErrorMessage(){
        //Arrange
        //Act
        String result=identification.classifyCharactor("5");
        //Assert
        assertEquals("5 is number",result);
    }
    @Test
    public void givenNegativeStringShouldReturnErrorMessage(){
        //Arrange
        //Act
        String result=identification.classifyCharactor("-5");
        //Assert
        assertNotEquals("5 is number",result);
    }
}