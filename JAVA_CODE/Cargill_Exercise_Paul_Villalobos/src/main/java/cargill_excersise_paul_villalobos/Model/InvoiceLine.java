/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cargill_excersise_paul_villalobos.Model;

import cargill_excersise_paul_villalobos.Model.Vehicle;

/**
 *
 * @author user
 */
public class InvoiceLine {
 
    String invoiceLineID;
    Invoice invoice;
    Vehicle vehicle;
    double SalePrice;
    int lineItem;

    public InvoiceLine(String invoiceLineID, Invoice invoice, Vehicle vehicle, double SalePrice, int lineItem) {
        this.invoiceLineID = invoiceLineID;
        this.invoice = invoice;
        this.vehicle = vehicle;
        this.SalePrice = SalePrice;
        this.lineItem = lineItem;
    }

    public String getInvoiceLineID() {
        return invoiceLineID;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public double getSalePrice() {
        return SalePrice;
    }

    public int getLineItem() {
        return lineItem;
    }

    public void setInvoiceLineID(String invoiceLineID) {
        this.invoiceLineID = invoiceLineID;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setSalePrice(double SalePrice) {
        this.SalePrice = SalePrice;
    }

    public void setLineItem(int lineItem) {
        this.lineItem = lineItem;
    }

    @Override
    public String toString() {
        return "InvoiceLine{" + "invoiceLineID=" + invoiceLineID + ", invoice=" + invoice + ", vehicle=" + vehicle + ", SalePrice=" + SalePrice + ", lineItem=" + lineItem + '}';
    }
    
    
    
}
