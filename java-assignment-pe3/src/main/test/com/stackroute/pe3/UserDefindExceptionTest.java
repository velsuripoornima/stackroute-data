package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDefindExceptionTest {
    public static UserDefindException userDefindException;
    @BeforeClass
    public static void setUp(){
        userDefindException=new UserDefindException();
    }
    @AfterClass
    public static void tearDown(){
        userDefindException=null;
    }
    @Test
    public void setUserDefindException(){
        assertEquals("Exception",userDefindException.throwsException(5));

        assertEquals("Exception",userDefindException.throwsException(15));

        assertEquals("Exception",userDefindException.throwsException(10));
    }
}