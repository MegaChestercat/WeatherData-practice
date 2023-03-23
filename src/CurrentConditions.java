public class CurrentConditions implements DisplayElement, Observer{
    private float temp, humidity, pressure;
    WeatherData data;
    public CurrentConditions(WeatherData data){
        this.data = data;
        data.registerObserver(this);
    }
    public void display(){
        System.out.println("\nCurrent Conditions: \nTemperature (C Degrees): " + temp + "\nHumidity: " + humidity + "Pressure: " + pressure);
    }
    public void update(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }
}
