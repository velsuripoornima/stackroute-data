package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradeCaluculatorTest {

    public static StudentGradeCaluculator studentGradeCalulator;

    @BeforeClass
    public static void setUp()
    {

        studentGradeCalulator = new StudentGradeCaluculator();
    }

    @AfterClass
    public static void tearDown()
    {

        studentGradeCalulator = null;
    }

    @Test
    public void testForGradeCalculatorSuccess()
    {
        int[] grades = {80,70,60,78};

        StudentGradeCaluculator.Result result = studentGradeCalulator.calculateGrades(4,grades);

        assertEquals(288,result.average,00);

        assertEquals(60,result.minimun);

        assertEquals(80,result.maximum);
    }

    @Test
    public void testForGradeCalculatorFailureWithInvalidInput()
    {
        int[] grades = {80,70,60,78, 465767};

        StudentGradeCaluculator.Result result = studentGradeCalulator.calculateGrades(4,grades);

        assertEquals(null,result);
    }

    @Test
    public void testForGradeCalculatorFailureWithOutOfRangeInput()
    {
        int[] grades = {80, 70, 60, 78, 178};

        StudentGradeCaluculator.Result result = studentGradeCalulator.calculateGrades(4, grades);

        assertEquals(null, result);
    }
}