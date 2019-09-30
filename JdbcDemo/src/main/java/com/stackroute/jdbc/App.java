package com.stackroute.jdbc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //creating instance variable for class simplejdbcdemo
        SimpleJdbcDemo simpleJdbcDemo=new SimpleJdbcDemo();

        //printing all the employee details
        simpleJdbcDemo.getEmployeeDetails();

        //displaying the employee details in reverse order
        simpleJdbcDemo.getEmployeeDetailsInReverseOrder();

        //displaying the values from second row
        simpleJdbcDemo.getEmployeeDetailsFromSecondRowInReverse();

        //displaying the rows based on the given parameters
        simpleJdbcDemo.getEmployeeDetailsByNameAndGender("ravi","male");

        //creating the instance variable for class jdbcbatchdemo
        JdbcBatchDemo jdbcBatchDemo=new JdbcBatchDemo();
        jdbcBatchDemo.getEmployeeDetails();

        //creating the instance variable for class resultsetdatabasedemo
        ResultsetDatabaseDemo resultsetDatabaseDemo=new ResultsetDatabaseDemo();
        resultsetDatabaseDemo.getEmployeeDetails();

        //creating the instance variable for class databasemetadata
        DataBaseMetaDataDemo dataBaseMetaDataDemo=new DataBaseMetaDataDemo();
        dataBaseMetaDataDemo.getMetaData();

        //creating the instance variable for class jdbctransactiondemo
        JdbcTransactionDemo jdbcTransactionDemo=new JdbcTransactionDemo();
        jdbcTransactionDemo.addEmployeeDetails();

        //creating the instance variable for class rowsetdemo
        RowsetDemo rowsetDemo=new RowsetDemo();
        rowsetDemo.getEmployeeDetailsInReverseOrder();
    }
}
