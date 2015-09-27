import java.util.Scanner;

/**
 * Created by ${Roman} on 27.09.2015.
 */
public class NearToTen {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Please enter your number One ");
        int numberOne = vvod.nextInt();
        System.out.print("Please enter your number Two ");
        int numberTwo = vvod.nextInt();
        int n = 10;
        int k = Math.abs(n - numberOne);
        int t = Math.abs(n - numberTwo);


        if (k == t) {
            System.out.println("NumberOne and NumberTwo is Equidistant to Ten ");
        }
        if (k < t) {
            System.out.println("NumberOne is Nearest to Ten ");
        }
        if (k > t) {
            System.out.println("NumberTwo is Nearest to Ten ");
        }


    }
}
