package pattern.iterator;

import OOP.Cat;

import java.util.Comparator;

/**
 * Created by ${Roman} on 01.11.2015.
 */
public class SortByAge implements Comparator <Cat>{
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        }
        if (o1.getAge() < o2.getAge()) {
            return -1;
        }
        return 0;
    }
}


