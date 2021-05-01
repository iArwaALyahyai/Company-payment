/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplelabtest;

/**
 *
 * @author Arwa
 */
public class Invoice implements Payable{
    private String itemNumber;
    private String itemDescription;
    private int quantity;
    private double price;
    
    public void setInvoice(String itemNumber,String itemDescription,int quantity,double price)
    {
        this.itemNumber = itemNumber;
        this.itemDescription = itemDescription;
        this.quantity = quantity;
        this.price = price;
    }
    
    public double getPaymentAmount() {
        return quantity*price;
    }

    public void print() {
        System.out.println("Invoice: "+itemNumber+","+itemDescription);
    }
}

