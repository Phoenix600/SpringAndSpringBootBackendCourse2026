package org.example;

import org.example.beans.Vehicle;
import org.example.config.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.naming.Context;
import java.lang.classfile.Annotation;


public class Main {
    static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Vehicle vehicle =  context.getBean("vehicleBean",Vehicle.class);
        System.out.println("Vehicle Bean From Spring Context : " + vehicle);
        String brandName =  vehicle.getBrandName();
        System.out.println("Name Of vehicle : " + brandName);
//        System.out.println("Vehicle Name From Spring Context : " + vehicle.getBrandName());

        context.close();
    }
}
