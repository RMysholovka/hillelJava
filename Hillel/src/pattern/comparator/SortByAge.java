package pattern.comparator;

import java.util.Collection;
import java.util.Comparator;

/**
 * Created by RMysholovka on 29.10.2015.
 */
public class SortByAge implements Comparator {

    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        }
        if (o1.getAge() < o2.getAge()) {
            return 0;
        }
    }
}
