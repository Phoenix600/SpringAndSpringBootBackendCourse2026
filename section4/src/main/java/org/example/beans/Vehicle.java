package org.example.beans;

import org.springframework.stereotype.Component;

@Component("vehicleBean")
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
}
