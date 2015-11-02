package collections.mutableState;

import java.util.Comparator;

/**
 * Created by RMysholovka on 02.11.2015.
 */
public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {

        return o1.model.compareTo(o2.model);
    }

}
