package com.stackroute.domain;
<<<<<<< HEAD

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
=======
>>>>>>> 5f5832b31543acc093577c85fc4a29747ef0e480

public class Movie {

    private Actor actor;

<<<<<<< HEAD
    //created default constructor
    public Movie() {

    }

    //creating the constructor for actor class
    public Movie(Actor actor) {
        this.actor = actor;
    }


=======
    //create contructor for actor class
>>>>>>> 5f5832b31543acc093577c85fc4a29747ef0e480
    public void setActor(Actor actor) {

        this.actor = actor;
    }

<<<<<<< HEAD
    //by using this method we are calling the actor class method
=======
    //by using this method we are calling the actor method
>>>>>>> 5f5832b31543acc093577c85fc4a29747ef0e480
    public void displayinfo(){

        actor.info();
    }
}
