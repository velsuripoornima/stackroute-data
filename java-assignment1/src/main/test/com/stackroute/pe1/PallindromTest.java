package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PallindromTest {
    Pallindrom palindrom;
    @Before
    public void setUp(){
        System.out.println("Before");
        palindrom=new Pallindrom();
    }
    @After
    public void tearDown() {
        System.out.println("After");
    }
    @Test
    public  void givenNumberShouldReturnNotAPalidromMessage(){
        //arrange

        //Act
        String result = palindrom.CheckingPalindrom(12345);

        //Assert
        assertEquals("12345 is not palindrome",result);
    }

    @Test
    public  void givenNumberShouldReturnNumberIsPalidromAndSumIsMoreThan25Message(){
        //arrange
        Pallindrom palindrom=new Pallindrom();
        //Act
        String result = palindrom.CheckingPalindrom(2468642);

        //Assert
        assertEquals("2468642 is palindrome and the sum of even numbers is greater than 25",result);
    }

    @Test
    public  void givenNumberShouldReturnNumberIsPalidromAndSumIsLessThan25Message(){
        //arrange
        Pallindrom palindrom=new Pallindrom();
        //Act
        String result = palindrom.CheckingPalindrom(234565432);

        //Assert
        assertEquals("234565432 is palindrome and sum of even numbers is less than 25",result);
    }
    @Test
    public  void givenNegativeNumberShouldReturnNumberIsNotAPalindromMessage(){
        //arrange
        Pallindrom palindrom=new Pallindrom();
        //Act
        String result = palindrom.CheckingPalindrom(-234565432);

        //Assert
        assertEquals("-234565432 is not palindrome",result);
    }

}