import java.util.Scanner;

/**
 * Created by RMysholovka on 01.10.2015.
 */
public class ArreysExample {
    public static void main(String[] args) {
        forIch();
    }

    private static void forIch() {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[5];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("index: " + i + ", value: " + intArray[i]);
        }

        for (int value : intArray) {
            System.out.println("value: " + value);
        }
    }

    private static void arreyaInit() {
        int[] ints = {4, 6, 5, 6, 7};

        int ints2[] = {3, 4, 5, 6};

        int value = ints[2];
        System.out.println(value);

        int[] inputValues = new int[3];

        Scanner scanner = new Scanner(System.in);
        inputValues[0] = scanner.nextInt();
        inputValues[1] = scanner.nextInt();
        inputValues[2] = scanner.nextInt();

        System.out.println("first: " + inputValues[0]);
        System.out.println("seond: " + inputValues[1]);
        System.out.println("third: " + inputValues[2]);
    }
}
