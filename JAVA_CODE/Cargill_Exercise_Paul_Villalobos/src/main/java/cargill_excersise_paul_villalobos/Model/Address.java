/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cargill_excersise_paul_villalobos.Model;

/**
 *
 * @author user
 */
public class Address {

   String addressName;
   String address2Name;
   String townName;
   String countryName;
   String postCode;
   String Region;
   String outerPostode;
   String countryID;

    public Address(String addressName, String address2Name, String townName, String countryName, String postCode, String Region, String outerPostode, String countryID) {
        this.addressName = addressName;
        this.address2Name = address2Name;
        this.townName = townName;
        this.countryName = countryName;
        this.postCode = postCode;
        this.Region = Region;
        this.outerPostode = outerPostode;
        this.countryID = countryID;
    }

    public String getAddressName() {
        return addressName;
    }

    public String getAddress2Name() {
        return address2Name;
    }

    public String getTownName() {
        return townName;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getRegion() {
        return Region;
    }

    public String getOuterPostode() {
        return outerPostode;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public void setAddress2Name(String address2Name) {
        this.address2Name = address2Name;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public void setOuterPostode(String outerPostode) {
        this.outerPostode = outerPostode;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    @Override
    public String toString() {
        return "Address{" + "addressName=" + addressName + ", address2Name=" + address2Name + 
                ", townName=" + townName + ", countryName=" + countryName + ", postCode=" + postCode + 
                ", Region=" + Region + ", outerPostode=" + outerPostode + ", countryID=" + countryID + '}';
    }
   
}
