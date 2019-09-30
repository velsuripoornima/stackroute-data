package com.stackroute.domain;

public class Actor {

    private String name,gender;
    private int age;

<<<<<<< HEAD
    //creating the parameter constructor for actor
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //creating the getters and setters
=======
    //creating getters and setters
>>>>>>> 5f5832b31543acc093577c85fc4a29747ef0e480
    public void setName(String name) {

        this.name = name;
    }


    public void setGender(String gender) {

        this.gender = gender;
    }


    public void setAge(int age) {

        this.age = age;
    }

<<<<<<< HEAD
    //display the actor information
    public void info(){

        System.out.println("Actor name is:"+name+ "\ngender of the actor is :" +gender+ "\nage is :" +age +"\n");
=======
    //display information about actor
    public void info(){

        System.out.println("Actor name is:"+name+ "\ngender of the actor is :" +gender+ "\nage is :" +age);
>>>>>>> 5f5832b31543acc093577c85fc4a29747ef0e480
    }

}
