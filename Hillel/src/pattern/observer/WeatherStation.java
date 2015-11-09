package pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RMysholovka on 05.11.2015.
 */
public class WeatherStation {
    private int temperature;
    private int hamidity;
    private int pressure;

    List<WeatherObserver> observers = new ArrayList<>();


    public void measurementChanged() {
        for (WeatherObserver observer : observers) {
            observer.updateWeather(this);
        }

    }

    public void register(WeatherObserver observer) {
        observers.add(observer);
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHamdity() {
        return hamidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setHamdity(int hamdity) {
        this.hamidity = hamdity;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
