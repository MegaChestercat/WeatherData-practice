public class StatisticsDisplay implements DisplayElement, Observer{
    private float maxTemp;
    private float minTemp;
    private float tempSum;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void display(){
        System.out.println("Avg Temp: " + (tempSum/numReadings) + "\nMax Temp: " + maxTemp + "\nMinTemp: " + minTemp);
    }
    public void update(float temp, float humidity, float pressure){
        tempSum += temp;
        numReadings++;

        if(temp > maxTemp){
            maxTemp = temp;
        }
        if(temp < minTemp){
            minTemp = temp;
        }
        display();
    }

}
