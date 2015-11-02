package collections.mutableState;

import java.util.Objects;

/**
 * Created by RMysholovka on 02.11.2015.
 */
public class Car {
    final String model;
    final int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(year, car.year) &&
                Objects.equals(model, car.model);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);


    }
}
