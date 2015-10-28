package collections;

/**
 * Created by RMysholovka on 26.10.2015.
 */
public class ListElement {
    Object value;
    ListElement next;

    public ListElement(Object value) {
        this.value = value;
    }


    public int size() {
        if (next == null) {
            return 1;
        } else {
            return 1 + next.size();
        }
        //return  next == null
    }

    public void add(Object value) {
        if (next == null) {
            next = new ListElement(value);
        } else {
            next.add(value);
        }
    }


}
