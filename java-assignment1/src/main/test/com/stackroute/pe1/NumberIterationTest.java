package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberIterationTest {
    NumberIteration numberiteration;
    @Before
    public void setUp(){
        numberiteration=new NumberIteration();
    }
    @After
    public void teamDown(){
        numberiteration=null;
    }
    @Test
    public void givenNumberShouldReturnNumberRepeatMessage(){
        //Arrange
        //Act
        String result=numberiteration.iteratNumber(2);
        //Assert
        assertEquals("1 2 2",result);
    }
    @Test
    public void givenNumberShouldReturnNoMessageReturn(){
        //Arrange
        //Act
        String result=numberiteration.iteratNumber(0);
        //Assert
        assertEquals("",result);
    }
    @Test
    public void givenNumberShouldReturnMessageReturn(){
        //Arrange
        //Act
        String result=numberiteration.iteratNumber(-1);
        //Assert
        assertEquals("",result);
    }

}