package com.stackroute.lamdaandstram;

import java.util.Comparator;
import java.util.List;

public class LamdaDemo {

    public List<Employee> sort(List<Employee>  list){
        try {

        list.sort(Comparator.comparing(Employee::getLatname).thenComparing(Employee::getName));

        return list;
        }
        catch (NullPointerException e)
        {
            return null;
        }
    }

    public List<Employee> filter(List<Employee>  list){
        try {

            list.removeIf(employee -> !employee.getLatname().startsWith("c"));

            return list;
        }
        catch (NullPointerException e){
            return null;
        }
    }

}
