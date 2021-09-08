package weatherapplication;

import java.util.ArrayList;

class WeatherData implements Subject{
    // Data
    String forecast;
    float temperature;

    // List of Displays -> Observers
    ArrayList<Observer> observerList;

    public WeatherData(){
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observerList.remove(observerList.indexOf(o));
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.updatedWeather(forecast, temperature);
        }
    }

    private String getUpdatedForecast(){
        // Assumption
        return "Cloudy";
    }

    private float getUpdatedTemperature(){
        // Assumption
        return (float) 20.3;
    }

    public void weatherChanged(){
        // latest data
        forecast = getUpdatedForecast();
        temperature = getUpdatedTemperature();

        // Notifiying
       notifyObservers();
        
    }
    
}