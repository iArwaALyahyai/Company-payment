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
public class Employee implements Payable {
    private String name;
    private double salary;
    private String employeeNumber;
    

    public void setEmployee(String name,double salary,String employeeNumber)
    {
        this.name = name;
        this.salary = salary;
        this.employeeNumber = employeeNumber;
    }

    public double getPaymentAmount() {
        return salary;
    }

    public void print() {
        System.out.println("Employee: "+employeeNumber+","+name);
    }
    
}
