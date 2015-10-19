package OOP.tdd;

import OOP.Cat;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by RMysholovka on 19.10.2015.
 */
public class SortingTest {

    @Test
    public void sortInAscendingOrder() {

        Integer[] unsorted = {111, 137, 0, 239, 6, 3, 2, 8, 4, 5};

        Sorter sorter = new Sorter();
        Integer[] sorted = (Integer[]) sorter.sort(unsorted);

        Comparable[] expected = {0, 2, 3, 4, 5, 6, 8, 111, 137, 239};

        Assert.assertArrayEquals("Sorting is broken ;", expected, sorted);


    }

    @Test
    public void sourceArrayShouldBeUnsourted() {
        Integer[] unsorted = {111, 137, 0, 239, 6, 3, 2, 8, 4, 5};
        Integer[] sorted = {111, 137, 0, 239, 6, 3, 2, 8, 4, 5};

        Sorter sorter = new Sorter();
        sorter.sort(unsorted);


        Assert.assertArrayEquals("\"Sorting is broken ", unsorted, sorted);
    }

    @Test
    public void catsShouldByName() {

        Cat cat = new Cat(false, 2, "Tom", "black");
        Cat cat2 = new Cat(false, 2, "Cat name", "White");

    }
}
