package com.stackroute.domain;


import org.springframework.stereotype.Component;

@Component

public class Actor {

    private String name;

    private String gender;

    private int age;

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public void actorInformation(){

        System.out.println("name of the actor:"+this.name+"\n age of the actor is:"+this.age+"\n gender of the actor is:"+this.gender);

    }
}
