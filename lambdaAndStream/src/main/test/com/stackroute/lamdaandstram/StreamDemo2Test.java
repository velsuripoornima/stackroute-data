package com.stackroute.lamdaandstram;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StreamDemo2Test {
    public static StreamDemo2 streamDemo2;

    @BeforeClass
    public static void setUp(){

        streamDemo2=new StreamDemo2();
    }

    @AfterClass
    public static void tearDown(){

        streamDemo2=null;
    }

    @Test
    public void givenListShouldReturnListMessage(){
         List<String> memberNames=new ArrayList<>();

        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("ahana");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        List<String> result=new ArrayList<>();
        result.add("Amitabh");
        result.add("Aman");

        assertEquals(result,streamDemo2.findNames(memberNames));

    }

    @Test
    public void givenListShouldReturnListUppercaseMessage() {
        List<String> memberNames = new ArrayList<>();

        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("ahana");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        List<String> result1 = new ArrayList<>();
        result1.add("AMITABH");
        result1.add("SHEKHAR");
        result1.add("AMAN");
        result1.add("AHANA");
        result1.add("SHAHRUKH");
        result1.add("SALMAN");
        result1.add("YANA");
        result1.add("LOKESH");

        assertEquals(result1, streamDemo2.changeType(memberNames));
    }

    @Test
    public void givenListShouldReturnListEmptyMessage() {
        List<String> memberNames2= new ArrayList<>();

        memberNames2.add("Amitabh");
        memberNames2.add("Shekhar");
        memberNames2.add("Aman");
        memberNames2.add("ahana");
        memberNames2.add("Shahrukh");
        memberNames2.add("Salman");
        memberNames2.add("Yana");
        memberNames2.add("Lokesh");

        List<String> result2 = new ArrayList<>();

        assertEquals(result2, streamDemo2.changeTypeAndFindString(memberNames2));
    }

    @Test
    public void givenListShouldReturnListCountMessage() {
        List<String> memberNames = new ArrayList<>();

        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("ahana");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        assertEquals(8, streamDemo2.count(memberNames));
    }


    @Test
    public void givenListSouldReturnListOfNameStartsWithSmessage(){
        List<String> memberNames1=new ArrayList<>();

        memberNames1.add("Amitabh");
        memberNames1.add("Shekhar");
        memberNames1.add("Aman");
        memberNames1.add("ahana");
        memberNames1.add("Shahrukh");
        memberNames1.add("Salman");
        memberNames1.add("Yana");
        memberNames1.add("Lokesh");

        List<String> result3=new ArrayList<>();
        result3.add("Shekhar");

        assertEquals(result3,streamDemo2.firstName(memberNames1));
    }

    @Test
    public void givenIntegerShouldReturnEvenNumberListMessage(){
        List<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(8);

        List<Integer> resultlist=new ArrayList<>();
        resultlist.add(2);
        resultlist.add(8);

        assertEquals(resultlist,streamDemo2.evenNumber(list1));
    }
}