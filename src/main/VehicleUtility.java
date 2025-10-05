/*
MICHAEL MELLES'
Student ID: 111838223
Due Date: Oct 5, 2025

VehicleUtility.java
Utility class that provides a static method to print vehicle information.
Accepts any IVehicle implementation and displays its type, distance traveled, time taken, fuel level, and cost.
Used by TravelSimulation to keep output formatting consistent across vehicle types.
*/

package main;
import adapter.IVehicle;

public class VehicleUtility {
    public static void printVehicleInformation(IVehicle vehicle) {
        System.out.println("Vehicle Type: " + vehicle.getVehicleType());
        System.out.println("Travel Distance: " + vehicle.getDistanceTraveled() + "km");
        System.out.println("Travel Time: " + vehicle.getTimeTraveled() + " hours");
        System.out.println("Current Fuel Level: " + vehicle.getFuelLevel() + "L");
        System.out.println("Fuel Cost: $" + vehicle.getFuelCost());
        System.out.println();
    }
}
