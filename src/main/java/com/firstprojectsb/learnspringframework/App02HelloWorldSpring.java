package com.firstprojectsb.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {

        //1 Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2 Config the things that we´d want Spring to manage - @Configuration

        //3 Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));  //nome do bean criado - no caso: name

    }
}
