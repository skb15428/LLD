package Design_Patterns.Behavioural_design_patterns.Observer_pattern.Observer;

import Design_Patterns.Behavioural_design_patterns.Observer_pattern.Observable.Observable;

public class PressureObserver implements Observer{

    Observable observable;
    int pressure;

    public PressureObserver(Observable observable){
        this.observable = observable;
    }
    @Override
    public void update() {
        this.pressure = observable.getData().getPressure();
        display();
    }

    private void display() {
        System.out.println("Pressure is : " + this.pressure);
    }
}
