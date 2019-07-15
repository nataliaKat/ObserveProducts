/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observeproducts;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author kat26
 */
public class Product extends ConcreteProduct {
    
    protected String name;
    protected int quantity;
    protected String color;
    protected String size;
    
    public Product(String name, int quantity, String color, String size) {
        
        this.name = name;
        this.quantity = quantity;
        this.color = color;
        this.size = size;
    }
    
    public Product() {
    }
    
    public void setName(String name) {
        if (!this.name.equals(name)) {
            this.name = name;
            updateState(this);
        }
    }
    
    public void setQuantity(int quantity) {
        if (this.quantity != quantity) {
            this.quantity = quantity;
            updateState(this);
            
        }
    }
    
    public void setColor(String color) {
        if (!this.color.equals(color)) {
            this.color = color;
            updateState(this);
            
        }
    }
    
    public void setSize(String size) {
        if (!this.size.equals(size)) {
            this.size = size;
            updateState(this);
        }
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + this.quantity;
        hash = 59 * hash + Objects.hashCode(this.color);
        hash = 59 * hash + Objects.hashCode(this.size);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.size, other.size)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", quantity=" + quantity + ", color=" + color + ", size=" + size + '}';
    }
    
}
