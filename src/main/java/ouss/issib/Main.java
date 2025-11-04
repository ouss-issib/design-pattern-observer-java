package ouss.issib;

import ouss.issib.impl.ObservableImpl;
import ouss.issib.impl.ObserverImpl1;
import ouss.issib.impl.ObserverImpl2;
import ouss.issib.obs.Observer;

public class Main {
    static void main() {
        ObservableImpl observable = new ObservableImpl();
        Observer observer1 = new ObserverImpl1();
        Observer observer2 = new ObserverImpl2();
        observable.subscribe(observer1);
        observable.subscribe(observer2);
        observable.subscribe(new Observer() {
            @Override
            public void updateState(int state) {
                System.out.println("++++++++ ObserverImpl3 : state = " + state +" ++++++++");
                System.out.println("Res = "+ state * Math.PI);
            }
        });

//        observable.subscribe(state -> {
//                System.out.println("++++++++ ObserverImpl4 : state = " + state +" ++++++++");
//                System.out.println("Res = "+ state * Math.PI);
//        });
        observable.setState(30);
        observable.setState(5);
        observable.notifyObservers();
    }
}