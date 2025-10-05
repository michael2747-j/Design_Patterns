
/*
 MICHAEL MELLES
Student ID: 111838223
Due Date: Oct 5, 2025

CarAdapter.java
Adapter class that wraps the legacy Car class and implements the IVehicle interface.
Translates IVehicle method calls into Car-specific operations.
Allows Car to be used in the simulation without modifying its original implementation.
*/

package adapter;

import legacy.Car;





public class CarAdapter implements IVehicle {
    private Car car;

    public CarAdapter(Car car) {
        this.car = car;
    }

    @Override
    public void travel(double distance) {
        car.carTravel(distance);
    }

    @Override
    public void addFuel(double amount) {
        car.carAddFuel(amount);
    }

    @Override
    public double getDistanceTraveled() {
        return car.getCarDistance();
    }

    @Override
    public double getTimeTraveled() {
        return car.getCarTime();
    }

    @Override
    public double getFuelLevel() {
        return car.getCarFuelLevel();
    }

    @Override
    public double getFuelCost() {
        return car.getCarFuelCost();
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }
}
