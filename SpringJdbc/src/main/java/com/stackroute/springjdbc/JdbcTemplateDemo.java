package com.stackroute.springjdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcTemplateDemo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private void JdbcTemplateDemo(){

    }

    private void setJdbcTemplateDemo(JdbcTemplate jdbcTemplate){
            this.jdbcTemplate = jdbcTemplate;
    }


    public int saveEmployee(Employee emp){
        String str="insert into Employee values('"+emp.getId()+"','"+emp.getName()+"','"+emp.getGender()+"')";
        System.out.println(jdbcTemplate);
        return  jdbcTemplate.update(str);
    }

    public List<Employee> viewEmployee(Employee employee){
        String Query="select * from Employee";
        List<Employee> employeeList = jdbcTemplate.query(Query, new ResultSetExtractor<List<Employee>>()
        {
            @Override
            public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException
            {
                List<Employee> list = new ArrayList<Employee>();
                while (rs.next())
                {
                    Employee employee = new Employee();
                    employee.setId(rs.getInt(1));
                    employee.setName(rs.getString(2));
                    employee.setGender(rs.getString(3));
                    list.add(employee);
                }
                return list;
            }

        });
        return employeeList;
    }
}
