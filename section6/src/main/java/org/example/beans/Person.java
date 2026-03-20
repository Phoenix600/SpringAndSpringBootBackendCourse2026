package org.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person
{
    private String name;

//    @Autowired
    private Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle)
    {
        System.out.println("Person Constructor Called");
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

//    @Autowired
    public void setVehicle(Vehicle vehicle) {
        System.out.println("Set Vehicle Method Called...");
        this.vehicle = vehicle;
    }

    @PostConstruct
    private void init()
    {
        this.name = "Steve";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }
}
