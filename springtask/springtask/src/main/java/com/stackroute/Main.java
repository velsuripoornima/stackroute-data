package com.stackroute;


import com.stackroute.domain.Movie;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

        public static void main(String[] args) {
            //display acter information using application context
            ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
            Movie movie = context.getBean("rammovie", Movie.class);
            movie.displayinfo();

            //display actor information using the XMLBean factory
            XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("beans.xml"));
            Movie obj = factory.getBean("rammovie",Movie.class);
            obj.displayinfo();

            //display actor information using the beandefinition registry
            DefaultListableBeanFactory factory1=new DefaultListableBeanFactory();
            BeanDefinitionRegistry context1=new GenericApplicationContext(factory1);
            BeanDefinitionReader reader=new XmlBeanDefinitionReader(context1);
            reader.loadBeanDefinitions("beans.xml");
            Movie shivam=factory1.getBean("rammovie",Movie.class);
            shivam.displayinfo();

        }
}
