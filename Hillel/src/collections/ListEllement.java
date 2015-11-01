package collections;

/**
 * Created by ${Roman} on 28.10.2015.
 */
public class ListEllement {
    public Object value;
    public ListEllement next;

    public ListEllement(Object value) {
        this.value = value;
    }

    public int size() {
        if (next == null) {
            return 1;
        } else {
            return 1 + next.size();
        }
        // return next == null ? 1 : 1 + next.size();
    }

    public void add(Object value) {
        if (next == null) {
            next = new ListEllement(value);
        } else {
            next.add(value);
        }
    }

    public Object get(int index) {
        if (index == 0) {
            return value;
        } else {
            return next.get(index - 1);
        }
    }
}