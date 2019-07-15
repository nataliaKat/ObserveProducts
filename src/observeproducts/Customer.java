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
public class Customer implements Observer{
    
    private String name;

    public Customer(String name) {
        this.name = name;
    }
    
    @Override
    public void update(Product p) {
        System.out.println(name + " " + p + " was updated");
    }

  
    
}
