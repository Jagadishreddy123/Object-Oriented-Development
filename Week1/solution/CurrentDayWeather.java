package solution;

class CurrentDayWeather implements Observer{
    private String forecast;
    private float temperature;
    public void updatedWeather(String forecast, float temperature){
        this.forecast = forecast;
        this.temperature = temperature;
        display();
    }

    public void display(){
        System.out.println("Current Day Weather report is:\n Forecast: "+forecast + "\n Temperature: " + temperature);
    }
}