package ouss.issib.obs;

public interface Observable {
    void subscribe(Observer state);
    void unsubscribe(Observer observer);
    void notifyObservers();
}
