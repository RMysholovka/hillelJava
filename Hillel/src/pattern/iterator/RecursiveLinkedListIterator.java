package pattern.iterator;

import collections.ListEllement;
import collections.RecursiveLinkedList;

import java.util.Iterator;

/**
 * Created by ${Roman} on 01.11.2015.
 */
public class RecursiveLinkedListIterator implements Iterator {

    private final RecursiveLinkedList list;
    ListEllement element;


    public RecursiveLinkedListIterator(RecursiveLinkedList list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (element == null) {
            return list.getHead() != null;
        }
        return element.next != null;
    }

    @Override
    public Object next() {
        if (element == null) {
            element = list.getHead();
        } else {
            element = element.next;
        }
        return element.value;
    }
}

