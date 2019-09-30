package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapValueReplaceTest {
    public static MapValueReplace mapValueReplace;

    @BeforeClass
    public static void setUp(){
        mapValueReplace=new MapValueReplace();
    }

    @AfterClass
    public static void teatDown(){
        mapValueReplace=null;
    }

    @Test
    public void givenMapShouldReturnMapkeyValuemessage(){

        Map<String,String> input=new HashMap<>();
        input.put("1","abc");
        input.put("2","xyz");

        Map<String,String> result=new HashMap<>();
        result.put("1"," ");
        result.put("2","abc");

        assertEquals(result,mapValueReplace.replaceValue(input));
    }

    @Test
    public void givenMapShouldReturnMapkeyValue1message(){

        Map<String,String> input=new HashMap<>();
        input.put("1","poornima");
        input.put("2","xyz");

        Map<String,String> result=new HashMap<>();
        result.put("1","poornima");
        result.put("2"," ");

        assertNotEquals(result,mapValueReplace.replaceValue(input));
    }

    @Test
    public void givenMapShouldReturnMapkeyValueEmpty1message(){

        Map<String,String> input=new HashMap<>();
        input.put("1"," ");
        input.put("2","xyz");

        Map<String,String> result=new HashMap<>();
        result.put("1"," ");
        result.put("2"," ");

        assertEquals(result,mapValueReplace.replaceValue(input));
    }

    @Test
    public void givenMapInputValueIsNumberShouldReturnMapkeyValue1message(){

        Map<String,String> input=new HashMap<>();
        input.put("1","1234");
        input.put("2","xyz");

        Map<String,String> result=new HashMap<>();
        result.put("1"," ");
        result.put("2","1234");

        assertEquals(result,mapValueReplace.replaceValue(input));
    }

    @Test
    public void givenMapInputValueIsnullShouldReturnMapkeyValue1message(){

        Map<String,String> input=new HashMap<>();
        input.put("1",null);
        input.put("2","xyz");

        Map<String,String> result=new HashMap<>();
        result.put("1"," ");
        result.put("2",null);

        assertEquals(result,mapValueReplace.replaceValue(input));
    }

}