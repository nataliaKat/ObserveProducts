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
public class Customer1 implements Observer{
    
    @Override
    public void update(Product p) {
        System.out.println("Customer 1 " + p + "was updated");
    }
    
}
