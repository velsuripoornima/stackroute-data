package com.stackroute.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Employee emp=context.getBean("employee",Employee.class);
        emp.setId(1);
        emp.setName("okewjcoie");
        emp.setGender("miucde");

        JdbcTemplateDemo demo=context.getBean("templatedemo",JdbcTemplateDemo.class);
        demo.saveEmployee(emp);

        demo.viewEmployee(emp);
    }




}
