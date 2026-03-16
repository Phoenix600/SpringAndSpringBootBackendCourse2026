package org.example.beans;

public class Vehicle
{
    private String brandName;

    public Vehicle(String brandName)
    {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
