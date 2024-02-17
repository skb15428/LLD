package Design_Patterns.Behavioural_design_patterns.Observer_pattern.Observer;

import Design_Patterns.Behavioural_design_patterns.Observer_pattern.Observable.Observable;

public class HumidityObserver implements Observer{

    Observable observable;
    int humidity;

    public HumidityObserver(Observable observable){
        this.observable = observable;
    }
    @Override
    public void update() {
        this.humidity = observable.getData().getHumidity();
        display();
    }

    private void display() {
        System.out.println("Humidity is : " + this.humidity);
    }
}
