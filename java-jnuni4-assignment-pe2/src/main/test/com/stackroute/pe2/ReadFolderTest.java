package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReadFolderTest {
    public static ReadFolder readFolder;

    @BeforeClass
    public static void setUp() {

        readFolder = new ReadFolder();
    }

    @AfterClass
    public static void tearDown() {

        readFolder = null;
    }

    @Test
    public void testForGetTextFilenamesOfFolder()
    {
        String[] filenames = readFolder.getFolderFilenames("/home/poornima/Desktop", "txt");

        assertEquals(1, filenames.length);

        assertEquals("file.txt", filenames[0]);

//        assertEquals("sample.txt", filenames[1]);
    }


    @Test()
    public void testForGetFilenamesOfFolderFailure() {
        String[] filenames = readFolder.getFolderFilenames("/home/poornima/Desktop/Dummy", "pdf");

    }
}