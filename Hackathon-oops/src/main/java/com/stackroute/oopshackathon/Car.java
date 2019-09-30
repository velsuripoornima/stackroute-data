package com.stackroute.oopshackathon;

public class Car {

    public boolean engine;
    public int wheels;
    public Cylinder cylinder;

    public Car(boolean engine, int wheels, Cylinder cylinder) {
        this.engine = engine;
        this.wheels = wheels;
        this.cylinder = cylinder;
    }

    public void startEngine(){

        System.out.println("engine started......");

    }

    public void accelarate(){

        System.out.println("accelarator started.....");

    }

    public void brake(){

        System.out.println("put brake .......");
    }

    public void displayCarDetails(){

        System.out.println("engine:"+this.engine+"\n wheels:"+this.wheels+"\n no of cylinders: "+this.cylinder.noOfCylinders+"\n name of the cylinders:"+this.cylinder.nameOfTheCylinders);
    }

}
