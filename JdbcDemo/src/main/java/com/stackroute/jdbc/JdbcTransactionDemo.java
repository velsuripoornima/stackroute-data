package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcTransactionDemo {

    Connection connection;

    public void addEmployeeDetails() {


        //we are initializing the how many values we have to transfer into table
        String insertTableSQL = "insert into Employee values(?,?,?)";

        try {
            //loading the drivers
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Use the DriverManager to get the connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "poornima", "Velsuripoornima@123");

            PreparedStatement preparedStatementInsert = connection.prepareStatement(insertTableSQL);

            connection.setAutoCommit(false);

            //scanning the given inputs
            Scanner scanner = new Scanner(System.in);

            //here we are entering the values
            System.out.println("Enter values to insert into table : Id, Name, Gender");

            System.out.println("enter id");

            int id = scanner.nextInt();

            String name = scanner.nextLine();

            String gender = scanner.next();

            System.out.println(id);

            //here we are updating the row
            PreparedStatement preparedStatementUpdate = connection.prepareStatement("update Employee set id = 42 where name = 'poornima'");

            //executing the row
            preparedStatementUpdate.executeUpdate();

            System.out.println("Updated!!!");

            //displaying the rows
            preparedStatementInsert = connection.prepareStatement(insertTableSQL);
            preparedStatementInsert.setInt(1, id);
            preparedStatementInsert.setString(2, name);
            preparedStatementInsert.setString(3,gender);
            preparedStatementInsert.executeUpdate();

            connection.commit();

            System.out.println("Done!");

        }
        catch ( ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (SQLException e) {

            System.out.println(e.getMessage());

            try {
                //handling the exception
                System.out.println("Connection Rollback done!!!!");
                connection.rollback();

            } catch (SQLException ex) {

                ex.printStackTrace();
            }
        }
        finally {

            try {

                connection.close();

            }
            catch (SQLException e) {

                e.printStackTrace();
            }
        }
    }
}
