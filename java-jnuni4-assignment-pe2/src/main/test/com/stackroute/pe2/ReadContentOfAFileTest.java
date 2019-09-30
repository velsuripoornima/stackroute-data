package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReadContentOfAFileTest {

    public static ReadContentOfAFile readContentOfAFile;

    @BeforeClass
    public static void setUp(){

        readContentOfAFile=new ReadContentOfAFile();
    }

    @AfterClass
    public static void tearDown(){

        readContentOfAFile=null;
    }
    @Test
    public void givenFileContent(){
        assertEquals(325,readContentOfAFile.readFile("/home/poornima/Desktop/file.txt"));
    }
}