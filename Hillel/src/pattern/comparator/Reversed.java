package pattern.comparator;

import OOP.Cat;

import java.util.Comparator;

/**
 * Created by RMysholovka on 29.10.2015.
 */
public class Reversed implements Comparator<Cat> {

    Comparator<Cat> comparator;

    public Reversed(Comparator<Cat> comparator) {
        this.comparator = comparator;
    }

    @Override
    public int compare(Cat o1, Cat o2) {
        return comparator.compare(o1, o2) * -1;
    }
}
