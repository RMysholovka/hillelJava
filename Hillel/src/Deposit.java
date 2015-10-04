import java.util.Scanner;

/**
 * Created by ${Roman} on 04.10.2015.
 */
public class Deposit {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Pleas enter the start amount of balance: ");
        double k = scanner.nextDouble();
        System.out.print("Please enter the final amount of money on deposit: ");
        double m = scanner.nextDouble();
        int y = 0; //years

        balanceAfter(scanner, k);

        k = balanceMoreThen(k, m, y);



    }

    private static void balanceAfter(Scanner scanner, double k) {
        System.out.print("Pleas enter number months: ");
        int n = scanner.nextInt();

        double dep = k;
        int i = 0;
        while (i <= n){
            dep = dep + (dep*0.03/12);
            i++;
        }

        System.out.println("After: " + n + " months of the deposit will be: " + dep);
    }

    private static double balanceMoreThen(double k, double m, int y) {
        while (k <= m) {
            k = k + (k * 0.03);
            y++;
        }
        System.out.println("Deposit wakes greater than " + m + " after " + y + " years");
        return k;
    }
}
