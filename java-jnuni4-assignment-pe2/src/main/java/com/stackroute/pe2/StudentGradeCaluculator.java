package com.stackroute.pe2;
import java.util.Arrays;
import java.sql.Array;

public class StudentGradeCaluculator {
    public class Result  //creating result class for return all the
    {
        float average;
        int minimun;
        int maximum;
    }

    public StudentGradeCaluculator() //creating constructor for class
    {

    }

    public Result calculateGrades(int number, int[] grades) //this method return stmts
    {
        Result result = new Result();  //creating object to the class

        if(number != grades.length)
        {
            return null;
        }
        for (int grade : grades) {
            if (grade < 0 || grade > 100) {
                return null;
            }
        }

        result.average = Arrays.stream(grades).sum();
        Arrays.sort(grades);
        result.minimun = grades[0];
        result.maximum = grades[grades.length -1];

        return result;
    }
}
