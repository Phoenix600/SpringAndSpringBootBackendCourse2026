package org.example.LoseCoupling;

public class Client
{
    static void main() {

        IVehicle bike = new Bike();
        IVehicle car   = new Car();
        IVehicle cycle = new BiCycle();

        Traveler t = new Traveler(bike);
        t.startJourney();

        t.setVehicle(car);
        t.startJourney();

        t.setVehicle(cycle);
        t.startJourney();
    }
}
