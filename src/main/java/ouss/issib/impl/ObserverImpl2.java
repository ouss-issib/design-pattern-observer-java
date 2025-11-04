package ouss.issib.impl;

import ouss.issib.obs.Observable;
import ouss.issib.obs.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Integer> history = new ArrayList<>();

    @Override
    public void updateState(Observable o) {
        if(!(o instanceof ObservableImpl obs)) return;
        int state = obs.getState();
        history.add(state);
        double sum =0;
        for(int i=0; i< history.size();i++){
            sum+=history.get(i);
        }
        System.out.println("************BEGIN OBSERVER IMPL 2***********");
        System.out.println("ObserverImpl2 : sum = " + sum);
        System.out.println("Moyenne = " + sum/history.size());
        System.out.println("************END OBSERVER IMPL 2***********");
    }
}
