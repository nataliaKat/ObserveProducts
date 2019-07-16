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
public class ConcreteCustomer extends Customer implements Observer{

    public ConcreteCustomer(String name) {
        super(name);
    }
    
    @Override
    public void update(Product p) {
        System.out.println(super.getName() + ", " + p + " was updated");
    }
}
