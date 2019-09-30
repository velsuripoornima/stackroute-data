package com.stackroute.oopshackathon;

public class Honda extends Car {
    public String carName;
    public String model;
    public String registrationNumber;

    public Honda(boolean engine, int wheels, Cylinder cylinder)
    {
        super(engine, wheels, cylinder);

        System.out.println("information getting from base class car....");
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
