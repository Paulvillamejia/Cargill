/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cargill_excersise_paul_villalobos.Model;

/**
 *
 * @author Paul Villalobos
 */
public class Color {
    
    String colorID;
    String colorName;

    public Color(String colorID, String colorName) {
        this.colorID = colorID;
        this.colorName = colorName;
    }

    public String getColorID() {
        return colorID;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorID(String colorID) {
        this.colorID = colorID;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public String toString() {
        return "Color{" + "colorID=" + colorID + ", colorName=" + colorName + '}';
    }
    
    
}
