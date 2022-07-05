package cargill_excersise_paul_villalobos.Model;

import java.util.Date;

/**
 *
 * @author Paul Villalobos
 */
public class Invoice {
    String invoiceID;
    String invoiceNumber;
    Client client;
    Date invoiceDate;
    double totalDiscount;
    double deliveryCharge;
    DateDimension datateDimension;
}
