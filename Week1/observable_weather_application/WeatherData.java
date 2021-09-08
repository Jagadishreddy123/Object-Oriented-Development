package observable_weather_application;

import java.util.Observable;

class WeatherData extends Observable{
    String forecast;
    float temperature;

    public WeatherData(){}

    private String getUpdatedForecast(){
        return "Cloudy";
    }

    private float getUpdatedTemperature(){
        return (float) 20.3;
    }

    public void weatherChanged(){
        forecast = getUpdatedForecast();
        temperature = getUpdatedTemperature();

        setChanged();
        notifyObservers();
    }
    
}