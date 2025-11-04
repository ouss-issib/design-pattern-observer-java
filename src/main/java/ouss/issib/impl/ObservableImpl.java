package ouss.issib.impl;

import ouss.issib.obs.Observable;
import ouss.issib.obs.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    List<Observer> observers = new ArrayList<>();
    private int state;

    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.updateState(state));
    }

    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
        this.notifyObservers();
    }
}
