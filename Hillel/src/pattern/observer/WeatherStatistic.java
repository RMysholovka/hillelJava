package pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RMysholovka on 05.11.2015.
 */
public class WeatherStatistic implements WeatherObserver {
    List<Integer> temperatures = new ArrayList<>();

    List<Integer> hamidities = new ArrayList<>();

    List<Integer> pressures = new ArrayList<>();


    public void updateWeather(WeatherStation station) {
        temperatures.add(temperature);
        hamidities.add(hamidity);
        pressures.add(pressure);
    }

    public void display() {
        System.out.println("weather statistic:");

    }
}
