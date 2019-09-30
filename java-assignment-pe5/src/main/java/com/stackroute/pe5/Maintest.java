package com.stackroute.pe5;


import java.util.Collections;
import java.util.List;

public class Maintest {

    StudentSorter studentSorter = new StudentSorter();

    public List<Student> sortStudents(List<Student> studentList)
    {
        if(studentList != null) {

            Collections.sort(studentList, new StudentSorter());  //it sorts using compare method of StudentSorter
        }

        return studentList;
    }




}
