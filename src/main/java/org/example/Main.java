package org.example;

import org.example.applications.IAcomodadorApp;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        IAcomodadorApp acomodadorApp = context.getBean(IAcomodadorApp.class);

        acomodadorApp.run();
    }
}