package org.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Vehicle
{
    private String brandName;

    public Vehicle()
    {
        System.out.println("Vehicle Bean Created");
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @PostConstruct
    private void init()
    {
        this.brandName = "Toyota";
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}
