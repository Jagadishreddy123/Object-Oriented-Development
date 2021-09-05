package solution;

/**
 * To Solve the Design issues in the WeatherApplication.java using the Observer Design Pattern.
 */

interface Observer {
    public void updatedWeather(String forecast, float temperature);
}