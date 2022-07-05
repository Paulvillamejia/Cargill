package cargill_excersise_paul_villalobos.Model;

import cargill_excersise_paul_villalobos.Model.Vehicle;
import java.util.Date;

/**
 *
 * @author Paul Villalobos
 */
public class Motorcycle extends Vehicle {
    
    String helmetIncluted;

    /*
    The constructor with a extens class provides all the parameters of a vehicle and includes the new parameters
*/
    public Motorcycle(String helmetIncluted, String stockID, String Make, String Model, Color color, String vehicleType, String costPrice, int spareParts, double laborCost, Date registrationDate, double mileage, Date purchaseDate, double VehicleAgeInYears) {
        super(stockID, Make, Model, color, vehicleType, costPrice, spareParts, laborCost, registrationDate, mileage, purchaseDate, VehicleAgeInYears);
        this.helmetIncluted = helmetIncluted;
    }

    public String getHelmetIncluted() {
        return helmetIncluted;
    }

    public void setHelmetIncluted(String helmetIncluted) {
        this.helmetIncluted = helmetIncluted;
    }

    @Override
    public String toString() {
        return "Motorcycle{" + "helmetIncluted=" + helmetIncluted + '}';
    }
    
    
    
}
