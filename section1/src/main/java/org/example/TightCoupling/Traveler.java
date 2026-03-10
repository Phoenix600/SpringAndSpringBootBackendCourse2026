package org.example.TightCoupling;

// Dependent Class
public class Traveler
{
    // Dependency Class
//    Bike bike = new Bike();
//    Car car = new Car();
    BiCycle biCycle = new BiCycle();
    public void startJourney()
    {
        System.out.println("Starting Journey");
        biCycle.accelerate();
        biCycle.brake();
        System.out.println("End Of Journey");
    }
}
