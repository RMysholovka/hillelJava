package collections;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RMysholovka on 26.10.2015.
 */
public class RecursiveLinkedListTest {


    @Test
    public void sizeChangedOnAdd() {
        RecursiveLinkedList list = new RecursiveLinkedList();

        Assert.assertEquals(0, list.size());
        list.add(1);
        Assert.assertEquals(1, list.size());
        list.add(1);
        Assert.assertEquals(2, list.size());
        list.add(1);



    }

    @Test

    public void getReturnsAppropriateElements() {
        RecursiveLinkedList list = new RecursiveLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        Assert.assertEquals(1, list.get(0));
        Assert.assertEquals(1, list.get(1));
        Assert.assertEquals(1, list.get(2));

    }
}


