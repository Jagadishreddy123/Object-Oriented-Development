package weatherapplication;

public class WeatherApplicationUsingObserverPattern {
    public static void main(String[] args) {
            CurrentDayWeather currentDayWeather = new CurrentDayWeather();
            WeatherData weatherData = new WeatherData();
            weatherData.registerObserver(currentDayWeather);
            weatherData.weatherChanged();
            weatherData.unregisterObserver(currentDayWeather);
    }
}