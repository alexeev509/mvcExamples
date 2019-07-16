package com.company;

import com.company.controllers.HelloController;
import org.springframework.context.ApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class Main implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println(servletContext.getClass());
        AnnotationConfigWebApplicationContext webApplicationContext=new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(AppConfig.class);
//        webApplicationContext.register(HelloController.class);
//        webApplicationContext.scan("controllers");

        DispatcherServlet dispatcherServlet=new DispatcherServlet(webApplicationContext);
        ServletRegistration.Dynamic dynamic=servletContext.addServlet("dispatcher",dispatcherServlet);
        dynamic.addMapping("/*");
        dynamic.setLoadOnStartup(1);

    }
}
