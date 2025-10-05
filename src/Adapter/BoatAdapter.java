
/*
MICHAEL MELLES
Student ID: 111838223
Due Date: Oct 5, 2025

BoatAdapter.java
Adapter class that wraps the legacy Boat class and implements the IVehicle interface.
Translates IVehicle method calls into Boat-specific operations.
Allows Boat to be used in the simulation without modifying its original implementation.
*/


package adapter;

import legacy.Boat;




public class BoatAdapter implements IVehicle {
    private Boat boat;

    public BoatAdapter(Boat boat) {
        this.boat = boat;
    }

    @Override
    public void travel(double distance) {
        boat.boatTravel(distance);
    }

    @Override
    public void addFuel(double amount) {
        boat.boatAddFuel(amount);
    }

    @Override
    public double getDistanceTraveled() {
        return boat.getBoatDistance();
    }

    @Override
    public double getTimeTraveled() {
        return boat.getBoatTime();
    }

    @Override
    public double getFuelLevel() {
        return boat.getBoatFuelLevel();
    }

    @Override
    public double getFuelCost() {
        return boat.getBoatFuelCost();
    }

    @Override
    public String getVehicleType() {
        return "Boat";
    }
}
