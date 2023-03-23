import java.util.ArrayList;

public class WeatherData implements Subject{
    ArrayList<Observer> observers;
    float temperature, humidity, pressure;
    public WeatherData(){
        observers = new ArrayList<Observer>();
    }
    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    public void notifyObservers(){
        for(int i = 0; i < observers.size(); i++){
            Observer ob = observers.get(i);
            ob.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}
