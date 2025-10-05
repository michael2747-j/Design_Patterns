/*
MICHAEL MELLES
Student ID: 111838223
Due Date: Oct 5, 2025

IVehicle
Interface that defines the unified contract for all vehicle types in the simulation.
Includes methods for travel, fuel management, and reporting metrics.
Implemented by adapter classes to wrap legacy vehicle classes.
*/

package adapter;

public interface IVehicle {
    void travel(double distance);
    void addFuel(double amount);
    double getDistanceTraveled();
    double getTimeTraveled();
    double getFuelLevel();
    double getFuelCost();
    String getVehicleType();
}


