package com.stackroute.keepnote.configuration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class SpringInitilizerConfig implements WebApplicationInitializer {

    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
        context.register(NoteConfig.class);
        context.setServletContext(servletContext);
        ServletRegistration.Dynamic servlet=servletContext.addServlet("spring",new DispatcherServlet(context));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}
