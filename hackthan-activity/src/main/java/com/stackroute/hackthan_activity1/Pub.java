package com.stackroute.hackthan_activity1;

public interface Pub {

    public void customerOrderFood();

    public  boolean acceptOrder(String[] foodItems);

    public void notifiesBartenderAndChef(String[] foodItems);

    public void callServer();
}
