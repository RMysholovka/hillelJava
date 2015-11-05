package pattern.observer;

/**
 * Created by RMysholovka on 05.11.2015.
 */
public class WeatherDisplay {
    int temperature;
    int hamdity;
    int pressure;

    public void set(int temperature, int hamdity, int pressure) {
        this.temperature = temperature;
        this.hamdity = hamdity;
        this.pressure = pressure;

    }

    public void print() {
        System.out.println("temperature: " + temperature + ", hamidity:" + hamdity + ", pressure:" + pressure);
    }
}
