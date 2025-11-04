package ouss.issib.impl;

import ouss.issib.obs.Observable;
import ouss.issib.obs.Observer;

public class ObserverImpl1 implements Observer {

    @Override
    public void updateState(Observable o) {
        if(o instanceof ObservableImpl obs){
            System.out.println("**********BEGIN OBSERVER IMPL 1*************");
            System.out.println("ObserverImpl1 : state = " + obs.getState() );
            System.out.println("**********END OBSERVER IMPL 1*************");
        }

    }
}
