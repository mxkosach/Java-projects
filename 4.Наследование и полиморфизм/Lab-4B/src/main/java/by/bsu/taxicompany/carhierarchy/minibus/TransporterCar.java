package by.bsu.taxicompany.carhierarchy.minibus;

import by.bsu.taxicompany.interfaces.BigPassengerOrder;

public class TransporterCar extends MiniBusCar implements BigPassengerOrder {

    public TransporterCar(String brand, String model, String carID,
                          double fuelConsumption, double velocity, double maxCarryingWeight) {
        this.brand = brand;
        this.model = model;
        this.carID = carID;
        this.fuelConsumption = fuelConsumption;
        this.velocity = velocity;
        this.maxCarryingWeight = maxCarryingWeight;
        this.maxPassengers = 25;
    }
}
