package com.stackroute.jdbc;

import java.sql.*;

public class JdbcBatchDemo {


    public void getEmployeeDetails() {
       Connection con;
        ResultSet rs ;
        Statement stmt;

            try {
                //loading the drivers
                Class.forName("com.mysql.cj.jdbc.Driver");

                //Use the DriverManager to get the connection
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "poornima", "Velsuripoornima@123");

                con.setAutoCommit(false);

                stmt = con.createStatement();

                //deleting the row having name as batch example
                stmt.execute("delete from Employee where name = 'Batch Example'");

                //for repeating this loop we are inserting the values in the table
                for(int i=400; i <= 410 ;i++){

                    stmt.addBatch("insert into Employee values ("+i+",'Batch Example','female')");
                }

                //here executing the query
                int[] result = stmt.executeBatch();

                //finding the length
                System.out.println("The number of rows inserted: "+ result.length);

                con.commit();

                //display query
                String sql = "SELECT * FROM Employee";

                rs = stmt.executeQuery(sql);

                //by using next() method displaying the all rows in the table
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String gender=rs.getString("gender");

                        //Display values
                    System.out.print("ID: " + id+"\n name: " + name+"\n gender:"+gender);

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

