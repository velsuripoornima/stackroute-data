package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class SetSortingTest {

    public static SetSorting setSorting;

    @BeforeClass
    public static void setUp(){
        setSorting=new SetSorting();
    }
    @AfterClass
    public static void tearDown(){
        setSorting=null;
    }

    @Test
    public void givenSetShouldReturnListMessage(){

        Set<String> set=new HashSet<>();
        set.add("Harry");
        set.add("Olive");
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");

        List<String> result=new ArrayList<>();

        result.add("Alice");
        result.add("Bluto");
        result.add("Eugene");
        result.add("Harry");
        result.add("Olive");

        assertEquals(result,setSorting.sorting(set));
    }

    @Test
    public void givenEmptySetShouldReturnListMessage(){

        Set<String> set=new HashSet<>();
        set.add("Harry");
        set.add("Olive");
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");
        set.add(" ");

        List<String> result=new ArrayList<>();


        result.add("Alice");
        result.add("Bluto");
        result.add("Eugene");
        result.add("Harry");
        result.add("Olive");


        assertNotEquals(result,setSorting.sorting(set));
    }

    @Test
    public void givenNullSetShouldReturnListMessage(){

        Set<String> set=new HashSet<>();
        set.add(null);
        List<String> result=new ArrayList<>();
        result.add(null);

        assertNull(setSorting.sorting(set));
    }



}