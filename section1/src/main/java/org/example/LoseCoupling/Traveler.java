package org.example.LoseCoupling;

public class Traveler
{
    private IVehicle vehicle;

    Traveler(IVehicle vehicle)
    {
        this.vehicle = vehicle;
    }


    public IVehicle getVehicle()
    {
        return vehicle;
    }

    public void setVehicle(IVehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    public void startJourney()
    {
        System.out.println("Start Journey");
        vehicle.accelerate();
        vehicle.accelerate();
        System.out.println("End Journey");
    }
}
