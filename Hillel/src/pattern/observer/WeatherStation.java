package pattern.observer;

/**
 * Created by RMysholovka on 05.11.2015.
 */
public class WeatherStation {
    int temperature;
    int hamdity;
    int pressure;

    WeatherDisplay current = new WeatherDisplay();


    public void meassurementChange() {
        current.set(temperature, hamdity, pressure);
        current.display();

    }

    public int getTemperature() {
        return temperature;
    }

    public int getHamdity() {
        return hamdity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setHamdity(int hamdity) {
        this.hamdity = hamdity;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
