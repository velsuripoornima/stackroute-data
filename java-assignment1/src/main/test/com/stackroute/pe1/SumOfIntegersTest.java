package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfIntegersTest {
    SumOfIntegers sumofintegers;
    @Before
    public void setUp(){
        sumofintegers=new SumOfIntegers();
    }
    @After
    public void tearDown(){
        sumofintegers=null;
    }
    @Test
    public void givenNumericStringSholudReturnSumValueMessage(){
        //Arrange
        //Act
        String result=sumofintegers.getSumOfArguments("12 34 1");
        //Assert
        assertEquals("47",result);
    }
    @Test
    public void givenNumericStringSholudReturnErrorMessage(){
        //Arrange
        //Act
        String result=sumofintegers.getSumOfArguments("12 a 1");
        //Assert
        assertEquals("Please enter all integers",result);
    }
    @Test
    public void givenNegativeNumericStringSholudReturnSumValueMessage(){
        //Arrange
        //Act
        String result=sumofintegers.getSumOfArguments("-12 -2 1");
        //Assert
        assertEquals("-13",result);
    }
    @Test
    public void givenEmptyStringSholudReturnErrorMessage(){
        //Arrange
        //Act
        String result=sumofintegers.getSumOfArguments("");
        //Assert
        assertEquals("Please enter all integers",result);
    }
    @Test
    public void givenNullSholudReturnErrorMessage(){
        //Arrange
        //Act
        String result=sumofintegers.getSumOfArguments(null);
        //Assert
        assertEquals("Please enter all integers",result);
    }

}