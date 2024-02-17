package Design_Patterns.Behavioural_design_patterns.Strategy_pattern_java_builtin;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {
    Observable observable;
    private int temperature;
    private int humidity;
    private int pressure;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    private void display() {
        System.out.println("Temperature is : " + temperature);
        System.out.println("Humidity is : " + humidity);
        System.out.println("Pressure is : " + pressure);
    }
}
