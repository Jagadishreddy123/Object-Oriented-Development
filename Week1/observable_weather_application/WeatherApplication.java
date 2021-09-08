package observable_weather_application;

public class WeatherApplication {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentDayWeather currentDayWeather = new CurrentDayWeather(weatherData);
        weatherData.weatherChanged();
    }
}