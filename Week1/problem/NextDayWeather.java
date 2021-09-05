package problem;

class NextDayWeather{
    String forecast;
    float temperature;
    public void updatedWeather(String forecast, float temperature){
        if(forecast.equals("Cloudy"))
            this.forecast = "Rainy";
        else if(forecast.equals("Rainy"))
            this.forecast = "Partial Cloudy";
        this.temperature = (float) (temperature + 1.1);
        display();
    }

    public void display(){
        System.out.println("Next Day Weather Predication Report is:\n Forecast: "+forecast + "\n Temperature: " + temperature);
    }

}