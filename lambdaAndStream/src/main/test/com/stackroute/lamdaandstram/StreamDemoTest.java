package com.stackroute.lamdaandstram;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StreamDemoTest {
    public static StreamDemo streamDemo;

    @BeforeClass
    public static void setUp(){
        streamDemo=new StreamDemo();
    }

    @AfterClass
    public static void tearDown(){
        streamDemo=null;
    }

    @Test
    public void givenListShouldReturnListMessage(){

        List<String> places=new ArrayList<>();

        places.add("Nepal,Kathmandu");
        places.add("Nepal,Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");

        List<String> result=new ArrayList<>();
        result.add("Kathmandu");
        result.add("Pokhara");

        assertEquals(result,streamDemo.findPlaces(places,"Nepal"));
    }

}