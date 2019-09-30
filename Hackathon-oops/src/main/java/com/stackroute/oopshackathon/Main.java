package com.stackroute.oopshackathon;

public class Main {
    public static void main(String[] args) {

        Cylinder cylinder=new Cylinder(1,"abc");

        Honda honda=new Honda(true,4,cylinder);
        honda.setCarName("honda");
        honda.setModel("Honda city");
        honda.setRegistrationNumber("Ap03 1234");
        honda.display();
        honda.displayCarDetails();

        //ford car details
        System.out.println("\n\n...................Ford car details...............");
        Ford ford=new Ford(true,4,cylinder);
        ford.setCarName("Ford");
        ford.setModel("Ford mustang");
        ford.setRegistrationNumber("TN01 1234");
        ford.display();
        ford.displayCarDetails();

        //suzuki car details
        System.out.println("\n\n...................suzuki car details...............");
        Suzuki suzuki=new Suzuki(true,4,cylinder);
        suzuki.setCarName("Maruti suzuki");
        suzuki.setModel("suzuki celerio");
        suzuki.setRegistrationNumber("Ap01 1264");
        suzuki.display();
        suzuki.displayCarDetails();


    }
}
