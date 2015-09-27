import java.util.Scanner;

/**
 * Created by ${Roman} on 27.09.2015.
 */
public class ParityCheck {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Please enter your number ");
        int number = vvod.nextInt();

        int result = number % 2;

        if (0 == result) {
            System.out.println("Your number is Even ");
        } else {
            System.out.println("Your number is Not Even ");
        }

    }
}
