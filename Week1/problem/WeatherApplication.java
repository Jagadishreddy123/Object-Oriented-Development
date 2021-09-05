package problem;
/* 
Scenario:
Assume we are building a Weather Application, which notifies the viewers about Current Day Weather and NextDay Weather Prediction. Two displays one is CurrentDayWeather and NextDayWeather.
Whenever the weather report changes the display elements will be updated with the new data.
*/

class WaatherApplication{
    public static void main(String... args){
        CurrentDayWeather currentDayWeather = new CurrentDayWeather();
        NextDayWeather nextDayWeather = new NextDayWeather();

        WeatherData weatherData = new WeatherData(currentDayWeather, nextDayWeather);

        weatherData.weatherChanged();

    }
}


/**
 * Problem: In the WeatherApplication.java, we have several design issues with classes. 
 * 1. CurrentDayWeather and NextDayWeather are Tightly Coupled.
 * 2. Not followed several rules in both the display classes. Mainly "Program to interfaces, not implementations".
 * 3. If we want add any other display element, we need to modify the WeatherData class. Which makes no sense. 
 * Above are some of the problems from the WeatherApplication.java
 */

