package collections;

import pattern.iterator.RecursiveLinkedListIterator;

import java.util.Iterator;

/**
 * Created by RMysholovka on 26.10.2015.
 */
public class RecursiveLinkedList implements Iterable {
    private ListEllement head;

    public int size() {
        if (head == null) {
            return 0;
        } else {
            return head.size();
        }
    }

    public void add(Object value) {
        if (head == null) {
            head = new ListEllement(value);
        } else {
            head.add(value);
        }
    }

    public Object get(int index) {
        if (head == null) {
            return null;
        } else {
            return head.get(index);
        }
    }

    public ListEllement getHead() {
        return head;
    }

    @Override
    public Iterator iterator() {
        return new RecursiveLinkedListIterator(this);
    }
}