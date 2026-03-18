package org.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

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

    private void init()
    {
        System.out.println("Init Method Called");
        this.brandName = "MacLaren";
    }

    @PreDestroy
    private void destroy()
    {
        System.out.println("Destroying Vehicle Bean");
    }

    @Override
    public String toString()
    {
        return  "Brand Name : " + getBrandName() + "\n";
    }
}
