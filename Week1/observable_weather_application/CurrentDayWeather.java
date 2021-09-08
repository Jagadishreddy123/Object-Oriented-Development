package observable_weather_application;

import java.util.Observable;
import java.util.Observer;

class CurrentDayWeather implements Observer {
    private String forecast;
    private float temperature;

    private Observable observable;

    public CurrentDayWeather(Observable observable){
        this.observable = observable;
        observable.addObserver((Observer) this);
    }

    public void display() {
        System.out.println("Current Day Weather report is:\n Forecast: " + forecast + "\n Temperature: " + temperature);
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData) o;
        this.forecast = weatherData.forecast;
        this.temperature = weatherData.temperature;
        display();
    }
}