package pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RMysholovka on 05.11.2015.
 */
public class WeatherStation {
    private int temperature;
    private int humidity;
    private int pressure;

    private List<WeatherObserver> observers = new ArrayList<>();

    public void measurmentChanged() {
        for (WeatherObserver observer : observers) {
            observer.updateWeather(this);
        }
    }

    public void register(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
