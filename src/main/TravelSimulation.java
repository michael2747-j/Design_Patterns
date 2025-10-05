/*
MICHAEL MELLES
Student ID: 111838223
Due Date: Oct 5, 2025

TravelSimulation.java
This is the main driver class for the travel simulation.
It creates instances of IVehicle using adapter classes for Boat, Car, and Airplane.
It simulates travel scenarios, prints vehicle information, and demonstrates fuel usage and overflow logic.
Calls VehicleUtility to display formatted output for each vehicle.
*/



package main;
import adapter.*;
import legacy.*;

public class TravelSimulation {
    public static void main(String[] args) {
        IVehicle boat = new BoatAdapter(new Boat());
        IVehicle car = new CarAdapter(new Car());
        IVehicle airplane = new AirplaneAdapter(new Airplane());

        // First round of travel
        boat.travel(100.0);
        VehicleUtility.printVehicleInformation(boat);

        car.travel(1000.0);
        VehicleUtility.printVehicleInformation(car);

        airplane.travel(10000.0);
        VehicleUtility.printVehicleInformation(airplane);

        // Add fuel
        System.out.println();
        System.out.println("Adding fuel...");
        System.out.println();

        boat.addFuel(120);
        car.addFuel(40);
        airplane.addFuel(50000);

        // Second round of travel
        boat.travel(100.0);
        VehicleUtility.printVehicleInformation(boat);

        car.travel(1000.0);
        VehicleUtility.printVehicleInformation(car);

        airplane.travel(10000.0);
        VehicleUtility.printVehicleInformation(airplane);

        new java.util.Scanner(System.in).nextLine();
    }
}

