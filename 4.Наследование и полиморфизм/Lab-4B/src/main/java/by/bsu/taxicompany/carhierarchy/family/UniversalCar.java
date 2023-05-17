package by.bsu.taxicompany.carhierarchy.family;

import by.bsu.taxicompany.interfaces.MediumOrder;
public class UniversalCar extends FamilyCar implements MediumOrder {

    public UniversalCar (String brand, String model, String carID,
                         double fuelConsumption, double velocity,
                         double maxCarryingWeight, int maxPassengers) {
        this.brand = brand;
        this.model = model;
        this.carID = carID;
        this.fuelConsumption = fuelConsumption;
        this.velocity = velocity;
        this.maxCarryingWeight = maxCarryingWeight;
        this.maxPassengers = maxPassengers;
        this.doors = 5;
    }
}
