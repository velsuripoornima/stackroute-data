package com.stackroute.jdbc;

import java.sql.*;

public class DataBaseMetaDataDemo {

   private Connection con= null;
    private ResultSet rs;
    public void getMetaData()
    {
        try {
            //loading drivers
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Use the DriverManager to get the connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office","poornima","Velsuripoornima@123");
            DatabaseMetaData dbmd=con.getMetaData();

            //displaying the inbuilt methods in datasemetadata
            System.out.println("Driver Name: "+dbmd.getDriverName());
            System.out.println("Driver Version: "+dbmd.getDriverVersion());
            System.out.println("UserName: "+dbmd.getUserName());
            System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
            System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());
            System.out.println("Database transaction or not:"+dbmd.dataDefinitionCausesTransactionCommit());
            System.out.println("colum index:"+dbmd.getMaxColumnsInIndex());

            //here displaying the all the tables in the office database
            String table[]={"TABLE"};
            rs=dbmd.getTables("office",null,null,table);
            while(rs.next()){

                    System.out.println(rs.getString(3));
            }

            //displaying the all the columns in the particular table
            rs=dbmd.getColumns(null,null,"Employee",null);
            while ((rs.next())){
                String columnName = rs.getString("COLUMN_NAME");
                String datatype = rs.getString("DATA_TYPE");
                System.out.println(columnName+" "+datatype+" ");
            }

            rs=dbmd.getAttributes(null,null,"Employee",null);
            while (rs.next()){
                System.out.println(rs.getString(3));
            }
            con.close();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
