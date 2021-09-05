package problem;

class WeatherData{
    // data
    String forecast;
    float temperature;

    // displays
    CurrentDayWeather currentDayWeather;
    NextDayWeather nextDayWeather;

    public WeatherData(CurrentDayWeather currentDayWeather, NextDayWeather nextDayWeather){
        this.currentDayWeather = currentDayWeather;
        this.nextDayWeather = nextDayWeather;
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
        currentDayWeather.updatedWeather(forecast, temperature);
        nextDayWeather.updatedWeather(forecast, temperature);
        
    }

}