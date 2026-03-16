package org.example;

import org.example.beans.Vehicle;
import org.example.config.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Method;

public class Main {
    static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Vehicle vehicle = context.getBean("ferrariBean",Vehicle.class);
        System.out.println("Spring Bean From Context : " + vehicle.getBrandName());

        Vehicle vehicle1 = context.getBean(Vehicle.class);
        System.out.println("Primary Spring Bean From Context : " + vehicle1.getBrandName());

        String sData = context.getBean("myString",String.class);
        System.out.println("Spring Bean From Context : " + sData);

        sData = context.getBean(String.class);
        System.out.println("Spring Bean From Context : " + sData);

    }
}
