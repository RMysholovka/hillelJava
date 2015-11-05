package pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RMysholovka on 05.11.2015.
 */
public class WeatherStatistic {
    List<Integer> temperatures = new ArrayList<>()
    :
    List<Integer> hamidities = new ArrayList<>()
    :
    List<Integer> pressures = new ArrayList<>()
    :


    public void set(int temperature, int hamdity, int pressure) {
        temperatures.add(temperature);
        hamidities.add(hamdity);
        pressures.add(pressure);
    }

    public void display() {

    }
}
