package solution;

public class WeatherApplicationUsingObserverPattern {
    public static void main(String[] args) {
            CurrentDayWeather currentDayWeather = new CurrentDayWeather();
            NextDayWeather nextDayWeather = new NextDayWeather();
    
            WeatherData weatherData = new WeatherData();

            // Registering Data Elements
            weatherData.registerObserver(currentDayWeather);
            weatherData.registerObserver(nextDayWeather);

            weatherData.weatherChanged();

            // Unregister NextDayWeather display element.
            weatherData.unregisterObserver(nextDayWeather);

            weatherData.weatherChanged();

    }
}