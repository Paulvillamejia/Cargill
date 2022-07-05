
package cargill_excersise_paul_villalobos.Model;

import java.util.Date;

/**
 *
 * @author Paul Villalobos
 */

public class Vehicle {
    /*
    Vehicle is the father class for all the vehicle, this makes the potencial of include more than cars in the enterprice,
    and is a solution to duplicate code.
    */
     String stockID;
     String Make;
     String Model;
     Color color;
     String vehicleType;
     String costPrice;
     int spareParts;
     double laborCost;
     Date registrationDate;
     double mileage;
     Date purchaseDate;
     double VehicleAgeInYears;
     
     /**
      generic constructor with data util for any vehicle
      */
    public Vehicle(String stockID, String Make, String Model, Color color, String vehicleType, String costPrice, int spareParts, double laborCost, Date registrationDate, double mileage, Date purchaseDate, double VehicleAgeInYears) {
        this.stockID = stockID;
        this.Make = Make;
        this.Model = Model;
        this.color = color;
        this.vehicleType = vehicleType;
        this.costPrice = costPrice;
        this.spareParts = spareParts;
        this.laborCost = laborCost;
        this.registrationDate = registrationDate;
        this.mileage = mileage;
        this.purchaseDate = purchaseDate;
        this.VehicleAgeInYears = VehicleAgeInYears;
    }

    public String getStockID() {
        return stockID;
    }

    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }

    public Color getColor() {
        return color;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getCostPrice() {
        return costPrice;
    }

    public int getSpareParts() {
        return spareParts;
    }

    public double getLaborCost() {
        return laborCost;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public double getMileage() {
        return mileage;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public double getVehicleAgeInYears() {
        return VehicleAgeInYears;
    }

    public void setStockID(String stockID) {
        this.stockID = stockID;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setCostPrice(String costPrice) {
        this.costPrice = costPrice;
    }

    public void setSpareParts(int spareParts) {
        this.spareParts = spareParts;
    }

    public void setLaborCost(double laborCost) {
        this.laborCost = laborCost;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setVehicleAgeInYears(double VehicleAgeInYears) {
        this.VehicleAgeInYears = VehicleAgeInYears;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "stockID=" + stockID + ", Make=" + Make + ", Model=" + Model + 
                ", color=" + color + ", vehicleType=" + vehicleType + ", costPrice=" + costPrice + 
                ", spareParts=" + spareParts + ", laborCost=" + laborCost + ", registrationDate=" + registrationDate + 
                ", mileage=" + mileage + ", purchaseDate=" + purchaseDate + ", VehicleAgeInYears=" + VehicleAgeInYears + '}';
    }
     
     
             
}
