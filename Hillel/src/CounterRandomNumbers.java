import java.util.Random;
import java.util.Scanner;

/**
 * Created by ${Roman} on 05.10.2015.
 */
public class CounterRandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Random rand = new Random();
        int n = rand.nextInt(10);
        System.out.println("Pleas enter number from 0 to 9: ");
        int yourNumber = scanner.nextInt();
        System.out.println("Random numbers int: " + n);
        int i = 1;

        for ( int k = yourNumber ; k != n; k = scanner.nextInt() ) {
            System.out.println("Your number is wrong, pleas enter next number: ");
            i++;
        }


        System.out.println("Your number is right, the number of attempts: " + i);

    }
}

