package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Scanner;


@Configuration
public class ApplicationConfiguration
{
    @Bean(name = "ferrariBean")
    Vehicle vehicle1()
    {
        System.out.println("Ferrari Bean Is Created");
        Vehicle v = new Vehicle("Ferrari");
        return v;
    }

    @Primary
    @Bean("audiBean")
    Vehicle vehicle2()
    {
        System.out.println("Audi R8 Bean Created");
        Vehicle vehicle = new Vehicle("Audi R8");
        return vehicle;
    }

    @Bean("mercedesBean")
    Vehicle vehicle3()
    {
        System.out.println("Mercedes S Class Bean Created");
        Vehicle vehicle = new Vehicle("Mercedes S Class");
        return vehicle;
    }


    @Bean
    Integer integer()
    {
        Integer x = 999;
        return x;
    }

    @Bean(name = "myString")
    String insertString()
    {
        String sData = new String("S2P Java & SpringBoot");
        return sData;
    }

    @Primary
    @Bean
    String insertAnotherString()
    {
        String sData1 = new String("I Hate SpringBoot");
        return sData1;
    }

    @Bean
    Scanner scanner()
    {
        return  new Scanner(System.in);
    }

}
