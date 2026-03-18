package org.example;

import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.example.config.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.naming.Context;
import java.lang.classfile.Annotation;


public class Main {
    static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        Person person =  context.getBean(Person.class);
        System.out.println("Person Bean From Spring Context : " + person.getName());
        System.out.println("Person Bean Owns The Vehicle Bean From Spring Context : " + person);
    }
}
