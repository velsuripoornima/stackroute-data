package main.java.com.stackroute.spring;

public class Airtel {

    private Services services;

    public void setServices(Services services) {
        this.services = services;
    }

    public void activeService(){
        services.service();
    }

}
