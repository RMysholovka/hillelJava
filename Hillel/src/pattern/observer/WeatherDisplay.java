package pattern.observer;

/**
 * Created by RMysholovka on 05.11.2015.
 */
public class WeatherDisplay implements WeatherObserver {
    int temperature;
    int hamidity;
    int pressure;

    public void updateWeather(WeatherStation station) {
        this.temperature = temperature;
        this.hamidity = hamidity;
        this.pressure = pressure;

    }

    public void print() {
        System.out.println("temperature: " + temperature + ", hamidity:" + hamidity + ", pressure:" + pressure);
    }

    public void display() {
    }
}
