package pattern.observer;

/**
 * Created by RMysholovka on 05.11.2015.
 */
public class ObserverMain {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        WetherForecast forecast = new WetherForecast();
        WeatherDisplay display = new WeatherDisplay();
        WeatherStatistic statistic = new WeatherStatistic();


        station.register(current);
        station.register(statistic);
        station.register(forecast);

        station.setPressure(20);
        station.setHamdity(50);
        station.setTemperature(10);
        station.measurementChanged();

        System.out.println();
        station.setPressure(25);
        station.setHamdity(50);
        station.setTemperature(10);

        station.measurementChanged();
    }
}
