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
public class ConcreteProduct {

    private List<Observer> followers = new ArrayList();

    private Product state;

    public Product getState() {
        return state;
    }

    public void updateState(Product state) {
        
            this.state = state;
            notifyObs();
        
    }

    public void notifyObs() {
        for (Observer obs : followers) {
            obs.update(state);
        }
    }

    public void attach(Observer obs) {
        followers.add(obs);
    }

    public void detach(Observer obs) {
        followers.remove(obs);
    }

}
