package com.stackroute.domain;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    @Autowired
    private Actor actor;

    public Movie(){

    }

    public Movie(Actor actor) {
        this.actor = actor;
    }


//   @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void displayInfo(){

        actor.actorInformation();
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("implementing ApplicationContextAware .....");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

        System.out.println("Implementing beanfactoryAware .....");
    }

    public void setBeanName(String s) {

        System.out.println("Implementing beanNameAware.....");

    }
}
