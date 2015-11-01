package collections;

/**
 * Created by RMysholovka on 26.10.2015.
 */
public class CustomLinkedList {
    private ListEllement head;

    public int size() {
        if (head == null) {
            return 0;
        } else {
            ListEllement current = head;
            int count = 1;
            while (current.next != null) {
                current = current.next;
                count++;
            }
            return count;
        }
    }

    public void add(Object value) {
        if (head == null) {
            head = new ListEllement(value);
        } else {
            ListEllement current = head;

            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListEllement(value);
        }
    }

    public Object get(int index) {
        if (head == null) {
            return null;
        } else {
            ListEllement current = head;
            for (int i = index; i != 0; i--) {
                if (current.next == null) {
                    return null;
                }
                current = current.next;
            }
            return current.value;
        }
    }
}

