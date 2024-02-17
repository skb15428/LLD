package Design_Patterns.Behavioural_design_patterns.Observer_pattern;

import Design_Patterns.Behavioural_design_patterns.Observer_pattern.Observable.Data;
import Design_Patterns.Behavioural_design_patterns.Observer_pattern.Observable.Observable;
import Design_Patterns.Behavioural_design_patterns.Observer_pattern.Observable.WeatherDataObservable;
import Design_Patterns.Behavioural_design_patterns.Observer_pattern.Observer.HumidityObserver;
import Design_Patterns.Behavioural_design_patterns.Observer_pattern.Observer.Observer;
import Design_Patterns.Behavioural_design_patterns.Observer_pattern.Observer.PressureObserver;
import Design_Patterns.Behavioural_design_patterns.Observer_pattern.Observer.TemperatureObserver;

public class WeatherStation {
    public static void main(String args[]){
        WeatherDataObservable observable = new WeatherDataObservable();

        Observer temperature = new TemperatureObserver(observable);
        Observer humidity = new HumidityObserver(observable);
        Observer pressure = new PressureObserver(observable);

        observable.registerObserver(temperature);
        observable.registerObserver(humidity);
        observable.registerObserver(pressure);

        observable.setData(new Data(10,0,0));
        observable.setData(new Data(10,20,0));
        observable.removeObserver(pressure);
        observable.setData(new Data(30,40,0));
    }
}
