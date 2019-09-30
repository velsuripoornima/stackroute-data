package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BooleanMapDemoTest {
    public static BooleanMapDemo booleanMapDemo;

    @BeforeClass
    public static void setUp(){
        booleanMapDemo=new BooleanMapDemo();
    }

    @AfterClass
    public static void tearDown(){
        booleanMapDemo=null;
    }

    @Test
    public void givenMapShouldReturnResultMessage(){

        Map<String,Boolean> result=new HashMap<>();

        result.put("a",true);

        result.put("b",false);

        result.put("c",true);

        assertEquals(result,booleanMapDemo.mapboolean(new String[]{"a","b","c","a","c","c"}));
    }

    @Test
    public void givenArryIsEmptyShouldReturnResultMessage(){

        Map<String,Boolean> result=new HashMap<>();

        result.put(" ",false);


        assertEquals(result,booleanMapDemo.mapboolean(new String[]{" "}));
    }

    @Test
    public void givenArryIsNullShouldReturnResultMessage(){



        assertNull(booleanMapDemo.mapboolean(null));
    }

}