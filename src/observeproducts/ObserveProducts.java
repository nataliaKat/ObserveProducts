/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observeproducts;

/**
 *
 * @author kat26
 */
public class ObserveProducts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Product p1 = new Product("T-shirt", 17, "blue", "medium");
        p1.attach(new Customer1());
        p1.setColor("white");
        
    }
    
}
