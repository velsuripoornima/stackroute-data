package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatCharTest {
    RepeatChar repeatchar;
    @Before
    public void setUp(){
        repeatchar = new RepeatChar();
    }
    @After
    public void teamDown(){
        repeatchar=null;
    }
    @Test
    public void givenOneStringOneNumberShouldReturnResultMessage(){
        //Arrange
        //Act
        String result=repeatchar.repeat("poornima",2);
        //Assert
        assertEquals("poornimamama",result);
    }
    @Test
    public void givenOneStringContainOneCharOneNumberShouldReturnResultMessage(){
        //Arrange
        //Act
        String result=repeatchar.repeat("pa",2);
        //Assert
        assertEquals("papapa",result);
    }
    @Test
    public void givenOneStringOneNegativeNumberShouldReturnResultMessage(){
        //Arrange
        //Act
        String result=repeatchar.repeat("poornima",-2);
        //Arrange
        assertEquals("",result);
    }
    @Test
    public void givenNullStringOneNegativeNumberShouldReturnResultMessage(){
        //Arrange
        //Act
        String result=repeatchar.repeat(null,-2);
        //Arrange
        assertNull(null,result);
    }
}