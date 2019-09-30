package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortAndSumNumberTest {
    SortAndSumNumber sortandsumofnumber;
    @Before
    public void setUp(){
        sortandsumofnumber=new SortAndSumNumber();
    }
    @After
    public void tearDown(){
        sortandsumofnumber=null;
    }
    @Test
    public void givenNumberShouldReturnSortSumAndLimitMessage(){
        //Arrange
        //Act
//        SortAndSumNumber.Result result=sortandsumofnumber.sort(3456);
        //Assert
//        assertEquals("Sorted number in non-increasing order 6543",result.sortNumber);
//        assertEquals("Sum of even numbers 10",result.sumOfEvenNumbers);
//        assertEquals(false,result.checkSumLimit);
        assertEquals("Sorted number in non-increasing order 54321",sortandsumofnumber.sort(12345));

        assertEquals(6,sortandsumofnumber.sumOfEven(12345));

        assertEquals(false,sortandsumofnumber.checkSumLimit(6));

    }
//    @Test
//    public void givenNumberAndStringShouldReturnSortSumAndLimitMessage(){
//        //Arrange
//        //Act
//        SortAndSumNumber.Result result=sortandsumofnumber.sort(-3652);
//        //Assert
//        assertEquals("Sorted number in non-increasing order 0",result.sortNumber);
//        assertEquals("Sum of even numbers 0",result.sumOfEvenNumbers);
//        assertEquals(false,result.checkSumLimit);
//    }
    @Test
   public void givenNumberZeroShouldReturnSortSumAndLimitMessage(){
//        //Arrange
//        //Act
//        SortAndSumNumber.Result result=sortandsumofnumber.sort(0);
//        //Assert
//        assertEquals("Sorted number in non-increasing order 0",result.sortNumber);
//        assertEquals("Sum of even numbers 0",result.sumOfEvenNumbers);
//        assertEquals(false,result.checkSumLimit);
        assertEquals("Sorted number in non-increasing order 0",sortandsumofnumber.sort(-42346));

        assertEquals(0,sortandsumofnumber.sumOfEven(-42346));

        assertEquals(false,sortandsumofnumber.checkSumLimit(0));
    }

    @Test
    public void givenZeroNumberShouldReturnSortSumAndLimitMessage(){
//        //Arrange
//        //Act
//        SortAndSumNumber.Result result=sortandsumofnumber.sort(0);
//        //Assert
//        assertEquals("Sorted number in non-increasing order 0",result.sortNumber);
//        assertEquals("Sum of even numbers 0",result.sumOfEvenNumbers);
//        assertEquals(false,result.checkSumLimit);
        assertEquals("Sorted number in non-increasing order 0",sortandsumofnumber.sort(0));

        assertEquals(0,sortandsumofnumber.sumOfEven(0));

        assertEquals(false,sortandsumofnumber.checkSumLimit(0));
    }

}