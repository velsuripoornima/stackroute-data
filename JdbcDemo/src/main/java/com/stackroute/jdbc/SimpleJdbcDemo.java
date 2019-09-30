package com.stackroute.jdbc;

import java.sql.*;

public class SimpleJdbcDemo {

    private Connection connection;

    private    Statement statement;

    private ResultSet resultSet;

    public void getEmployeeDetails() {

        //load driver connection and register with Drivermanager

        //if we put all connections likes(connection,statement,result set) with in the try(here) ,we donit need to write finnaly block for closing this connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Use the DriverManager to get the connection
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/office","poornima","Velsuripoornima@123");

            statement=connection.createStatement();

            resultSet=statement.executeQuery("select * from Employee");


            while (resultSet.next()){

                System.out.println("Id:" +resultSet.getInt(1)+"\n name: "+resultSet.getString(2));
            }
        }
        catch (ClassNotFoundException e) {

            e.printStackTrace();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
                statement.close();
                resultSet.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    //print result set in reverse order
    public void getEmployeeDetailsInReverseOrder(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Use the DriverManager to get the connection
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/office","poornima","Velsuripoornima@123");

            statement=connection.createStatement();

            resultSet=statement.executeQuery("select * from Employee");

            resultSet.afterLast();
            while (resultSet.previous()){

                System.out.println("Id:" +resultSet.getInt(1)+"\n name: "+resultSet.getString(2)+"gender:"+resultSet.getString(3));
            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /*Move ResultSet to second row and print in reverse order*/
    public void getEmployeeDetailsFromSecondRowInReverse() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Use the DriverManager to get the connection
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/office","poornima","Velsuripoornima@123");

            statement=connection.createStatement();

            resultSet=statement.executeQuery("select * from Employee");

            resultSet.absolute(3);
            while (resultSet.previous()){

                System.out.println("Id:" +resultSet.getInt(1)+"\n name: "+resultSet.getString(2)+"gender:"+resultSet.getString(3));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //Use PreparedStatement to display by name and gender

    public void getEmployeeDetailsByNameAndGender(String name,String gender) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Use the DriverManager to get the connection
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/office","poornima","Velsuripoornima@123");

            statement=connection.createStatement();

            resultSet=statement.executeQuery("select * from Employee where name='"    +name+  "' and gender='"    +gender+ "'");

            while (resultSet.next()){

                System.out.println("Id:" +resultSet.getInt(1)+"\n name: "+resultSet.getString(2)+"gender:"+resultSet.getString(3));
            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
