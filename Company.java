/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplelabtest;

import java.util.Scanner;

/**
 *
 * @author Arwa
 */
public class Company {
    private String companyName;
    private Payable[] companyPayments;
    private static int currentPayments;
    private String type;
    public Company(String companyName)
    {
        this.companyName = companyName;
        this.companyPayments = new Payable[100];
        this.currentPayments = 0;
    }
    
    public void addPayment(String type)
    {
        if (type.equals("employee"))
        {
            this.type = "Employee";
            Scanner in = new Scanner(System.in);
            System.out.println("Enter employee number, employee name, and salary in separate lines:");
            String number = in.nextLine();
            String name = in.nextLine();
            double salary = in.nextDouble();
            Employee e = new Employee();
            e.setEmployee(name,salary,number);
            companyPayments[currentPayments]= e;
            currentPayments++;
            
        }
        else
        {
            this.type = "Invoice";
            Scanner in = new Scanner(System.in);
            System.out.println("Enter item number, item description, quantity and price per item in separate lines:");
            String number = in.nextLine();
            String description = in.nextLine();
            int quantity = in.nextInt(); 
            double price = in.nextDouble(); 
            Invoice i = new Invoice();
            i.setInvoice(number,description,quantity,price);
            companyPayments[currentPayments]= i;
            currentPayments++;
        }
    }
    
    public void printDuePayments()
    {
        double total = 0;
        System.out.println("============================");
        System.out.println(companyName);
        System.out.println("============================");
        System.out.println(currentPayments+" outstanding payments:");
        for(int i =0;i<currentPayments;i++)
        {
            
            companyPayments[i].print();
            
            System.out.printf("%s%2.3f\n","Payment due: OMR",companyPayments[i].getPaymentAmount());
            double price= companyPayments[i].getPaymentAmount();
            total = total + price;
        }
        System.out.printf("%s%2.3f\n","Total due payments: OMR",total);
        
    }
}
