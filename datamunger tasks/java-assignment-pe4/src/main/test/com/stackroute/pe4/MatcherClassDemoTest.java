package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatcherClassDemoTest {
    public static MatcherClassDemo matcherClassDemo;

    @BeforeClass
    public static void setUp(){
        matcherClassDemo=new MatcherClassDemo();
    }

    @AfterClass
    public static void tearDown(){
        matcherClassDemo=null;
    }

    @Test
    public void givenStringShouldReturnFindTheWordRangeMessage()
    {
        assertEquals(" 4 - 6 21 - 23 29 - 31 ",matcherClassDemo.matcherClass("thi is matcher class is demo is","is"));
    }
}