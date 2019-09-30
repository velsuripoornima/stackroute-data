package com.stackroute.pe5;

public class Student {

    String id,name,age;

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getAge() {

        return age;
    }

    public void setAge(String age) {

        this.age = age;
    }

    @Override
    public String toString() {

        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String id, String name, String age){
        this.id=id;
        this.name=name;
        this.age=age;

    }


}
