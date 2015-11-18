package pattern.observer;

/**
 * Created by RMysholovka on 05.11.2015.
 */
public class WeatherDisplay implements WeatherObserver {
    int temperature;
    int humidity;
    int pressure;

    public void updateWeather(WeatherStation station) {
        this.temperature = station.getTemperature();
        this.humidity = station.getHumidity();
        this.pressure = station.getPressure();
    }

    public void display() {
        System.out.println("temperature: " + temperature + ", humidity: " + humidity + ", pressure: " + pressure);
    }
}
