package ouss.issib.impl;

import ouss.issib.obs.Observer;

public class ObserverImpl1 implements Observer {
    @Override
    public void updateState(int state) {
        System.out.println("**********BEGIN OBSERVER IMPL 1*************");
        System.out.println("ObserverImpl1 : state = " + state );
        System.out.println("**********END OBSERVER IMPL 1*************");
    }
}
