package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionCheckerTest {
    public static ExceptionChecker exceptionChecker;
    @BeforeClass
    public static void setUp(){
        exceptionChecker=new ExceptionChecker();
    }
    @AfterClass
    public static void tearDown(){
        exceptionChecker=null;
    }
    @Test
    public void throwsException(){

        assertEquals("NullPointerException",exceptionChecker.isException(null));

        assertEquals("IndexOutOfBoundException",exceptionChecker.isException("abc"));

        assertEquals("NegativeArraySizeException",exceptionChecker.isException("poori"));
    }

}