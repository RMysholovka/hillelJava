import java.util.Arrays;

/**
 * Created by RMysholovka on 05.10.2015.
 */
public class OOP {
    static String shareString;

    public static void main(String[] args) {
        shareString = "some string";
        int i = 10;
        add(i);
        System.out.println(i);


        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        add(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(shareString);
    }

    private static void add(int[] ints) {
        ints[0] = ints[0] + 1;
        ints[1] = ints[1] + 1;
        ints[2] = ints[2] + 1;
        shareString = " shares string after add int[] method";
        System.out.println(shareString);
    }


    private static void add(int i) {
        i++;
        shareString = " shares string after add int method";
        System.out.println(shareString);
    }

    public static void printString() {
        System.out.println(shareString);

    }
}

