package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach firstSpringCoach = context.getBean("myCoach", Coach.class);
        System.out.println(firstSpringCoach.getDailyWorkout());
        context.close();
    }
}
