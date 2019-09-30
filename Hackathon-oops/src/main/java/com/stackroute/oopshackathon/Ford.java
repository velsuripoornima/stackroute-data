package com.stackroute.oopshackathon;

public class Ford extends Car {

    public String carName;
    public String model;
    public String registrationNumber;

    public Ford(boolean engine, int wheels, Cylinder cylinder) {
        super(engine, wheels, cylinder);
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void display(){
        System.out.println(" Car details: \nname:"+this.carName+"\n model: "+this.model+"\n registration number");
    }
}
