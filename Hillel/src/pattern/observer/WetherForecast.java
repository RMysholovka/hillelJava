package pattern.observer;

import java.util.Random;

/**
 * Created by RMysholovka on 09.11.2015.
 */
public class WetherForecast implements WeatherObserver {
    int temperature;
    int hamidity;
    int pressure;

    public void updateWeather(WeatherStation station) {
        this.temperature = generate(temperature);
        this.hamidity = generate(hamidity);
        this.pressure = generate(pressure);
    }

    private int generate(int value) {
        Random random = new Random();
        double seed = random.nextDouble();
        seed = seed - 0.5;
        seed = seed / 5;

        return (int) (value * (1 + seed));
    }

    public void display() {
        System.out.println("forecast: temperature: " + temperature + ", hamidity: " + hamidity + ", pressure:" + pressure);
    }
}
