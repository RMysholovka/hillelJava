package HomeWork.myHashSet;

/**
 * Created by ${Roman} on 04.11.2015.
 */
public class CalculationHash {
    private HashList head;

    public int size() {
        if (head == null) {
            return 0;
        } else {
            HashList current = head;
            int count = 1;
            while (current.next != null) {
                current = current.next;
                count++;
            }
            return count;
        }
    }

    public void calculationHash(String message) {
      //  int k = count;
        char[] array = message.toCharArray();
        char[] result = new char[array.length];

        for (int i = 0; i < array.length; i++) {

        }

    }
}