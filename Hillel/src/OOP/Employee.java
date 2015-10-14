package OOP;

import java.util.Arrays;

/**
 * Created by ${Roman} on 14.10.2015.
 */
public class Employee extends Human implements Vaccinable {
    private String position;
    private String[] vaccines = new String[3];
    private int vaccineCounter = 0;

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", vaccines=" + Arrays.toString(vaccines) +
                '}' + super.toString();
    }

    public void vaccinate(String vaccine) {
        vaccines[vaccineCounter] = vaccine;
        vaccineCounter++;
    }
}
