package com.stackroute.lamdaandstram;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

import static org.junit.Assert.*;

public class LamdaDemoTest {
    public static LamdaDemo lamdaDemo;

    @BeforeClass
    public static void setUp(){
        lamdaDemo=new LamdaDemo();
    }

    @AfterClass
    public static void tearDown(){
        lamdaDemo=null;
    }

    @Test
    public void givenListShiouldReturnListOfEmployeeNamesWithSortedorderAndFilterWithCMessage(){

        List<Employee> list=new ArrayList<>();
        Employee employee1=new Employee("poornima","v",21);
        Employee employee2=new Employee("mahesh","v",24);
        Employee employee3=new Employee("chandana","c",24);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        List<Employee> result=new ArrayList<>();
        result.add(employee3);
        result.add(employee2);
        result.add(employee1);

        List<Employee> filterResult=new ArrayList<>();
        filterResult.add(employee3);

        assertEquals(result,lamdaDemo.sort(list));
        assertEquals(filterResult,lamdaDemo.filter(list));

    }

    @Test
    public void givenEmptyListShiouldReturnListOfEmployeeNamesWithSortedorderAndFilterWithCMessage(){

        List<Employee> list=new ArrayList<>();
        Employee employee1=new Employee("","",0);
        Employee employee2=new Employee("mahesh","c",24);
        Employee employee3=new Employee("chandana","a",24);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        List<Employee> result=new ArrayList<>();
        result.add(employee1);
        result.add(employee3);
        result.add(employee2);


        List<Employee> filterResult=new ArrayList<>();
        filterResult.add(employee2);

        assertEquals(result,lamdaDemo.sort(list));
        assertEquals(filterResult,lamdaDemo.filter(list));

    }

    @Test
    public void givenNullInputShouldReturnNullMessage(){
        List<Employee> list=new ArrayList<>();
        list.add(null);

        List<Employee> result=new ArrayList<>();
        list.add(null);

        List<Employee> filterResult=new ArrayList<>();
        list.add(null);

        assertNull(lamdaDemo.sort(list));
        assertNull(lamdaDemo.filter(list));
    }

    @Test
    public void givenListShiouldReturnListOfEmployeeNamesWithSortedorderAndFilterWithCGivingNegativeAgeErrorMessage(){

        List<Employee> list=new ArrayList<>();
        Employee employee1=new Employee("santhi","v",-28);
        Employee employee2=new Employee("mahesh","c",24);
        Employee employee3=new Employee("chandana","a",24);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        List<Employee> result=new ArrayList<>();
        result.add(employee1);
        result.add(employee3);
        result.add(employee2);


        List<Employee> filterResult=new ArrayList<>();
        filterResult.add(employee3);

        assertNotEquals(result,lamdaDemo.sort(list));
        assertNotEquals(filterResult,lamdaDemo.filter(list));

    }

    @Test
    public void givenListShiouldReturnListOfEmployeeNamesWithSortedorderAndFilterWithCGivingNegativeAgeAndNumericStringErrorMessage(){

        List<Employee> list=new ArrayList<>();
        Employee employee1=new Employee("santhi","1",-28);
        Employee employee2=new Employee("mahesh","2",24);
        Employee employee3=new Employee("chandana","a",24);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        List<Employee> result=new ArrayList<>();
        result.add(employee1);
        result.add(employee2);
        result.add(employee3);


        List<Employee> filterResult=new ArrayList<>();


        assertEquals(result,lamdaDemo.sort(list));
        assertEquals(filterResult,lamdaDemo.filter(list));

    }

}