public class Main {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditions currentDisplay = new CurrentConditions(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(25, 50, 30.4f );
        weatherData.setMeasurements(30, 34, 23.2f );
        weatherData.setMeasurements(13, 34, 27.8f );
        weatherData.setMeasurements(9, 25, 28.6f );
    }
}
