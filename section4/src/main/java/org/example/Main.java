package org.example;

import org.example.beans.Vehicle;
import org.example.config.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Vehicle vehicle =  context.getBean("vehicleBean",Vehicle.class);
        System.out.println("Vehicle Bean From Spring Context : " + vehicle);
//        System.out.println("Vehicle Name From Spring Context : " + vehicle.getBrandName());
    }
}
