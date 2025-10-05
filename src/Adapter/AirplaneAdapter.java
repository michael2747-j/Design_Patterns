/*
MICHAEL MELLES
Student ID: 111838223
Due Date: Oct 5, 2025

AirplaneAdapter.java
Adapter class that wraps the legacy Airplane class and implements the IVehicle interface.
Translates IVehicle method calls into Airplane-specific operations.
Allows Airplane to be used in the simulation without modifying its original implementation.
*/

package adapter;

import legacy.Airplane;




public class AirplaneAdapter implements IVehicle {
    private Airplane airplane;

    public AirplaneAdapter(Airplane airplane) {
        this.airplane = airplane;
    }

    @Override
    public void travel(double distance) {
        airplane.airplaneTravel(distance);
    }

    @Override
    public void addFuel(double amount) {
        airplane.airplaneAddFuel(amount);
    }

    @Override
    public double getDistanceTraveled() {
        return airplane.getAirplaneDistance();
    }

    @Override
    public double getTimeTraveled() {
        return airplane.getAirplaneTime();
    }

    @Override
    public double getFuelLevel() {
        return airplane.getAirplaneFuelLevel();
    }

    @Override
    public double getFuelCost() {
        return airplane.getAirplaneFuelCost();
    }

    @Override
    public String getVehicleType() {
        return "Airplane";
    }
}
