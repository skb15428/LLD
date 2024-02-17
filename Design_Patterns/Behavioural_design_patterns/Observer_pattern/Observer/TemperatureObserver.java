package Design_Patterns.Behavioural_design_patterns.Observer_pattern.Observer;

import Design_Patterns.Behavioural_design_patterns.Observer_pattern.Observable.Observable;
import Design_Patterns.Behavioural_design_patterns.Observer_pattern.Observable.WeatherDataObservable;

public class TemperatureObserver implements Observer{
    Observable observable;

    int temperature;

    public TemperatureObserver(Observable observable){
        this.observable = observable;
    }
    @Override
    public void update() {
        this.temperature = observable.getData().getTemperature();
        display();
    }

    private void display() {
        System.out.println("Temperature is : " + this.temperature);
    }
}
