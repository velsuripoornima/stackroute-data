package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RandomNumberTest {
    RandomNumber randomnumber;
    @Before
    public void setUp(){
        randomnumber=new RandomNumber();
    }
    @After
    public void tearDown(){
        randomnumber=null;
    }
    @Test
    public void givenTwoNumbersOneIsGuessedOneUserNumberShouldReturnGreaterMessage(){
        //Arrange
        //Act
        String result=randomnumber.random(10,15);
        //Assert
        assertEquals("your guessing number is greater than original number",result);
    }
    @Test
    public void givenTwoNumbersOneIsGuessedOneUserNumberShouldReturnLessMessage(){
        //Arrange
        //Act
        String result=randomnumber.random(10,5);
        //Assert
        assertEquals("your guessing number is less than original number",result);
    }
    @Test
    public void givenTwoNumbersOneIsGuessedOneUserNumberShouldReturnEqualMessage(){
        //Arrange
        //Act
        String result=randomnumber.random(10,5);
        //Assert
        assertEquals("your guessing number is less than original number",result);
    }
    @Test
    public void givenNullsOneIsGuessedOneUserNumberShouldReturnEqualMessage(){
        //Arrange
        //Act
        String result=randomnumber.random(10,10);
        //Assert
        assertEquals("your guessing number is equal to original number",result);
    }
    @Test
    public void givenOneNegativeNumberOneIsGuessedOneUserNumberShouldReturnEqualMessage(){
        //Arrange
        //Act
        String result=randomnumber.random(10,-10);
        //Assert
        assertEquals(null,result);
    }
}