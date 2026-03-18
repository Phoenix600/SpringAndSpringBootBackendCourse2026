package org.example.config;


import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration
{
        @Bean
        Vehicle vehicle()
        {
                Vehicle vehicle = new Vehicle();
                vehicle.setBrandName("Toyota");
                return vehicle;
        }

        @Bean
        Person person(Vehicle vehicle)
        {
            Person person = new Person();
            person.setName("Steve Jobs");
            person.setVehicle(vehicle);
            return person;
        }
}
