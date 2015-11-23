package IO;

import java.io.Serializable;

/**
 * Created by RMysholovka on 23.11.2015.
 */
public class Car implements Serializable {
    private static final long serialVersionUID = -7512501727561008871L;
    String model;
    int year;
    CarOwner owner;
    String color;

    public Car(String model, int year, CarOwner owner, String color) {
        this.model = model;
        this.year = year;
        this.owner = owner;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", owner=" + owner +
                ", color=" + color +
                '}';
    }
}
