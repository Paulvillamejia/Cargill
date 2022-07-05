/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cargill_excersise_paul_villalobos.Model;

import cargill_excersise_paul_villalobos.Model.Color;
import cargill_excersise_paul_villalobos.Model.Vehicle;
import java.util.Date;

/**
 *
 * @author Paul Villalobos
 */
public class Car extends Vehicle {
    /*
    Example of paramether of a car, diferent for a motorcycle
    */
    int numberOfDoors;

    /*
    Constructor
    */
    public Car(int numberOfDoors, String stockID, String Make, String Model, Color color, String vehicleType, String costPrice, int spareParts, 
            double laborCost, Date registrationDate, double mileage, Date purchaseDate, double VehicleAgeInYears) {
        super(stockID, Make, Model, color, vehicleType, costPrice, spareParts, laborCost, registrationDate, mileage, purchaseDate, VehicleAgeInYears);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" + "numberOfDoors=" + numberOfDoors + '}';
    }
    
    
}
