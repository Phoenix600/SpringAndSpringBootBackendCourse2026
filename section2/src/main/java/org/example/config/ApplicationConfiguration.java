package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration
{
    @Bean
    Vehicle vehicle()
    {
        System.out.println("Creating Vehicle Bean");
        Vehicle v = new Vehicle("Ferrari");
        return v;
    }

}
