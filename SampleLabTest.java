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
public class SampleLabTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Company company = new Company("Muscat Logistics");
        company.addPayment("employee");
        company.addPayment("invoice");
        company.addPayment("invoice");
        company.addPayment("employee");
        company.printDuePayments();
    }
    
}
