package pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RMysholovka on 05.11.2015.
 */
public class WeatherStatistic implements WeatherObserver {
    List<Integer> temperatures = new ArrayList<>();
    List<Integer> humidities = new ArrayList<>();
    List<Integer> pressueres = new ArrayList<>();

    public void updateWeather(WeatherStation station) {
        temperatures.add(station.getTemperature());
        humidities.add(station.getHumidity());
        pressueres.add(station.getPressure());
    }

    public void display() {
        System.out.println("Statistic: temperatures: " + temperatures +
                ", humidities: " + humidities +
                ", pressures: " + pressueres);
    }
}
