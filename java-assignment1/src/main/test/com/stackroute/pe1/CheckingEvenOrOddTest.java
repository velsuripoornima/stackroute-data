package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckingEvenOrOddTest {
    CheckingEvenOrOdd evenorodd;
    @Before
    public void setUp(){
        evenorodd=new CheckingEvenOrOdd();
    }
    @After
    public void teamDown(){
        evenorodd=null;
    }

    @Test
    public  void givenNumberShouldReturnStringlMessage(){
        //arrange

        //Act
        String result =evenorodd.isEvenOrOdd(33);

        //Assert
        assertNotEquals("Jerry",result);
    }

    @Test
    public  void givenNumberShouldReturnJerryMessage(){
        //arrange

        //Act
        String result =evenorodd.isEvenOrOdd(22);

        //Assert
        assertEquals("Jerry",result);
    }
    @Test
    public  void givenNumberShouldReturnTomMessage(){
        //arrange

        //Act
        String result =evenorodd.isEvenOrOdd(23);

        //Assert
        assertEquals("Tom",result);
    }
    @Test
    public  void givenNegativeNumberShouldReturnNullMessage(){
        //arrange

        //Act
        String result =evenorodd.isEvenOrOdd(-23);

        //Assert
        assertNull(null,result);
    }



}