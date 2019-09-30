package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateArrayElementTest {
    public static UpdateArrayElement updateArrayElement;

    @BeforeClass
    public static void setUp(){
        updateArrayElement=new UpdateArrayElement();
    }

    @AfterClass
    public static void tearDown(){
        updateArrayElement=null;
    }
    @Test
    public void givenArrayShouldReturnReplacementListArrayMessage(){

        List<String> result = new ArrayList<>();
        result.add("html");
        result.add("java");
        result.add("c");

        assertEquals(result, updateArrayElement.replaceElement(new String[] {"python","java","c"},0,"html"));
    }

    @Test
    public void givenArrayShouldReturnReplacementListArrayNullElementMessage(){

        List<String> result = new ArrayList<>();
        result.add("python");
        result.add("java");
        result.add("c");

        assertNotEquals(result, updateArrayElement.replaceElement(new String[] {"python","java","c"},0,null));
    }

    @Test
    public void givenArrayShouldReturnReplacementListArrayEmptyMessage(){

        List<String> result = new ArrayList<>();
        result.add(" ");
        result.add("java");
        result.add("c");

        assertEquals(result, updateArrayElement.replaceElement(new String[] {"python","java","c"},0," "));
    }

    @Test
    public void givenArrayShouldReturnReplacementListArrayNumberMessage(){

        List<String> result = new ArrayList<>();
        result.add("html");
        result.add("java");
        result.add("123");

        assertEquals(result, updateArrayElement.replaceElement(new String[] {"html","java","c"},2,"123"));
    }

    @Test
    public void givenNullArrayShouldReturnReplacementListArrayNumberMessage(){


        assertNull( updateArrayElement.replaceElement(null,2,"123"));
    }

    @Test
    public void givenArrayShouldReturnClearMessage(){

        List<String> result = new ArrayList<>();
        result.clear();

        assertEquals(result, updateArrayElement.clearElement(new String[] {"html","java","c"}));
    }

}