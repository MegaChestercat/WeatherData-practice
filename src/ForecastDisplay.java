public class ForecastDisplay implements DisplayElement, Observer{
    float oldPressure;
    float currentPressure = 29.92f;
    WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void display(){
        System.out.println("Forecast: ");
        if(currentPressure > oldPressure){
            System.out.println("The weather will improve");
        }
        else if(currentPressure == oldPressure){
            System.out.println("The weather will maintain the same");
        }
        else if(currentPressure < oldPressure){
            System.out.println("The weather will be worsen");
        }
    }
    public void update(float temp, float humidity, float pressure){
        oldPressure = currentPressure;
        currentPressure = pressure;

        display();
    }
}
