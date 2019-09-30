package com.stackroute.lamdaandstram;

public class Employee {
    private String name,lastname;
    private Integer age;

    public Employee(String name,String lastname,Integer age){
        this.name=name;
        this.lastname=lastname;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getLatname() {
        return lastname;
    }

    public void setLatname(String latname) {
        this.lastname = latname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", latname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }

}
