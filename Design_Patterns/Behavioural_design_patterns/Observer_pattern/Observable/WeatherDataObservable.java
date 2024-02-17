package Design_Patterns.Behavioural_design_patterns.Observer_pattern.Observable;

import Design_Patterns.Behavioural_design_patterns.Observer_pattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataObservable implements Observable{

    private List<Observer> observers;
    private Data data;

    public WeatherDataObservable(){
        this.observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update());
    }

    @Override
    public Data getData() {
        return this.data;
    }

    @Override
    public void setData(Data data) {
        this.data = data;
        notifyObservers();
    }
}
