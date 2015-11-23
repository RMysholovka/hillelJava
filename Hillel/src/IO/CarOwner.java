package IO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RMysholovka on 23.11.2015.
 */
public class CarOwner implements Serializable {
    String name;
    List<Car> cars = new ArrayList<>();

    public CarOwner(String name) {
        this.name = name;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public String toString() {
        return "CarOwner{" +
                "name='" + name + '\'' +
                //  "cars='" + cars + '\'' +
                '}';
    }

}
