package com.stackroute.jdbc;


import com.sun.rowset.JdbcRowSetImpl;


import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class RowsetDemo {


    private Connection connection;

    private Statement statement;

    private ResultSet resultSet;

    public void getEmployeeDetailsInReverseOrder()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "poornima", "Velsuripoornima@123");
            RowSetFactory rowSetFactory = RowSetProvider.newFactory();
            JdbcRowSet jdbcRowSet = new JdbcRowSetImpl(connection);
            //JdbcRowSet jdbcRowSet = rowSetFactory.createJdbcRowSet();
            jdbcRowSet.setCommand("select * from Employee"); // set properties, and
            jdbcRowSet.setUrl("jdbc:mysql://localhost:3306/office"); // connect to database
            jdbcRowSet.setUsername("poornima");
            jdbcRowSet.setPassword("Velsuripoornima@123");
            jdbcRowSet.execute(); // populate with data

            while (jdbcRowSet.next())
            {
                System.out.println(" "+ jdbcRowSet.getInt(1) + " " + jdbcRowSet.getString(2) + " " + jdbcRowSet.getString(3) + " " );
            }
        }
        catch (ClassNotFoundException|SQLException e) {

            e.printStackTrace();
        }
    }


}

