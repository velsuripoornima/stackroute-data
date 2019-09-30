package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {
    public static PowerOfFour powerOfFour;
    @BeforeClass
    public static void setUp()
    {
        powerOfFour=new PowerOfFour();
    }
    @AfterClass
    public static void tearDown(){

        powerOfFour=null;
    }
    @Test
    public void givenNumberShouldReturnTestPowerOfFourSuccessMessage(){
        //Arrange
        //Act
        //Assert
        assertEquals(true,powerOfFour.isPower(1048576));

        assertEquals(true,powerOfFour.isPower(64));



    }
    @Test
    public void givenNumberShouldRetunTestPowerOfFourFailureMessages(){

        assertEquals(false,powerOfFour.isPower(0));

        assertEquals(false,powerOfFour.isPower(-4));

        assertFalse(powerOfFour.isPower(-1));
    }

}