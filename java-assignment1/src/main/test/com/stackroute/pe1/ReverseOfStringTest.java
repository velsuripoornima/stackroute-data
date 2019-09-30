package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseOfStringTest {
    ReverseOfString reverseofstring;
    @Before
    public void setUp(){
//        System.out.println("Before");
        reverseofstring=new ReverseOfString();
    }
    @After
    public void tearDown(){
        reverseofstring=null;
    }
    @Test
    public void givenStringShouldReturnReverseStringMessage(){
        //Arrange
        //Act
        String result=reverseofstring.reverse("london");
        //Assert
        assertEquals("reverse string is:nodnol",result);
    }
    @Test
    public void givenStringShouldReturnSringMessage(){
        //Arrange
        //Act
        String result=reverseofstring.reverse("lon3don");
        //Assert
        assertEquals("reverse string is:nod3nol",result);
    }
    @Test
    public void givenNumericStringShouldReturnReverseStringMessage(){
        //Arrange
        //Act
        String result=reverseofstring.reverse("12345");
        //Assert
        assertEquals("reverse string is:54321",result);
    }
    @Test
    public void givenEmptyStringShouldReturnReverseStringMessage(){
        //Arrange
        //Act
        String result=reverseofstring.reverse("");
        //Assert
        assertEquals("reverse string is:",result);
    }
    @Test
    public void givenNullStringShouldReturnNullMessage(){
        //Arrange
        //Act
        String result=reverseofstring.reverse(null);
        //Assert
        assertNull(null,result);
    }

}