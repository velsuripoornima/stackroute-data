package main.java.com.stackroute.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring1 {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("beams.xml");

        Airtel airtel=context.getBean("airtel",Airtel.class);
        airtel.activeService();

    }
}
