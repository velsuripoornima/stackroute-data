package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoMatrixTest {
    public static AddTwoMatrix addTwoMatrix;
    @BeforeClass
    public static void setUp(){
        addTwoMatrix=new AddTwoMatrix();
    }
    @AfterClass
    public static void tearDown(){
        addTwoMatrix=null;
    }
    @Test
    public void matrixAdditionSuccess(){
        assertArrayEquals(new int[][] {{2,4},{6,8},{10,12}},
                addTwoMatrix.matrixAddition(3,2,new int[][] {{1,2},{3,4},{5,6}},new int[][]{{1,2},{3,4},{5,6}}));

        assertArrayEquals(new int[][] {{0,0},{0,0},{0,0}},
                addTwoMatrix.matrixAddition(3,2,new int[][] {{1,2},{3,4},{5,6}},new int[][]{{-1,-2},{-3,-4},{-5,-6}}));

        assertArrayEquals(new int[][] {{-2,-4},{-6,-8},{-10,-12}},
                addTwoMatrix.matrixAddition(3,2,new int[][] {{-1,-2},{-3,-4},{-5,-6}},new int[][]{{-1,-2},{-3,-4},{-5,-6}}));
    }
    @Test
    public void matrixAdditionFailure() {
        assertArrayEquals(null,
                addTwoMatrix.matrixAddition(3, 2, new int[][]{{1, 2}, {5, 6}}, new int[][]{{1, 2}, {3, 4}, {5, 6}}));

        assertArrayEquals(null,
                addTwoMatrix.matrixAddition(3, 2, new int[][]{{,},{,},{,}}, new int[][]{{1, 2}, {3, 4}, {5, 6}}));


    }
    }


