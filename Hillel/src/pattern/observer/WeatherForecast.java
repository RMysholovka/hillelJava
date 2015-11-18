package pattern.observer;

import java.util.Random;

/**
 * Created by ${Roman} on 11.11.2015.
 */
public class WeatherForecast implements WeatherObserver {
    int temperature;
    int humidity;
    int pressure;

    public void updateWeather(WeatherStation station) {
        this.temperature = generate(station.getTemperature());
        this.humidity = generate(station.getHumidity());
        this.pressure = generate(station.getPressure());
    }

    private int generate(int value) {
        Random random = new Random();
        double seed = random.nextDouble();
        seed = seed - 0.5;
        seed = seed / 5;

        return (int) (value * (1 + seed));
    }

    public void display() {
        System.out.println("forecast: temperature: " + temperature +
                ", humidity: " + humidity +
                ", pressure: " + pressure);
    }
}


