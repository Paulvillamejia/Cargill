/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cargill_excersise_paul_villalobos.Model;

/**
 *
 * @author Paul Villalobos
 */
public class Country {
    
    String countryID;
    String countryName;
    String countryISOCode;

    public Country(String countryID, String countryName, String countryISOCode) {
        this.countryID = countryID;
        this.countryName = countryName;
        this.countryISOCode = countryISOCode;
    }

    public String getCountryID() {
        return countryID;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryISOCode() {
        return countryISOCode;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCountryISOCode(String countryISOCode) {
        this.countryISOCode = countryISOCode;
    }

    @Override
    public String toString() {
        return "Country{" + "countryID=" + countryID + ", countryName=" + countryName +
                ", countryISOCode=" + countryISOCode + '}';
    }
    
    
}
