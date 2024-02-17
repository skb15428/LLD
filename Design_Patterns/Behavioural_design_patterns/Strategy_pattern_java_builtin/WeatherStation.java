package Design_Patterns.Behavioural_design_patterns.Strategy_pattern_java_builtin;

public class WeatherStation {
    public static void main(String args[]){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentCondition = new CurrentConditionsDisplay(weatherData);

        weatherData.addObserver(currentCondition);

        weatherData.setMeasurements(10,20,30);


    }
}
