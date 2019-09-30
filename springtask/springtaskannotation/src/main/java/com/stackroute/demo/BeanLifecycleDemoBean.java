package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {


    public void destroy() throws Exception {

        System.out.println("implements disposal bean.....");
    }

    public void afterPropertiesSet() throws Exception {

        System.out.println("implementing initializing bean ....");

    }

    public void customInit(){

        System.out.println("custon initilization......");
    }

    public void customDestroy(){

        System.out.println("custom destroy method.....");
    }
}
