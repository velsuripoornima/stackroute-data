package com.stackroute.domain;


import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import org.springframework.context.annotation.*;


@Configuration
public class MovieConfig {

    @Bean
    public Actor actorBean(){

       return new Actor("ram","male",21);
    }

    @Bean

    public Movie ram()
    {

        return new Movie();
    }

    @Bean(initMethod = "customInit",destroyMethod = "customDestroy")

    public BeanLifecycleDemoBean beanLifecycleDemoBean(){

        return new BeanLifecycleDemoBean();
    }

    @Bean
    public BeanPostProcessorDemoBean beanPostProcessorDemoBean(){

        return new BeanPostProcessorDemoBean();
    }
}
