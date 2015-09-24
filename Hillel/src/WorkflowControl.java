import java.util.Scanner;

/**
 * Created by RMysholovka on 24.09.2015.
 */
public class WorkflowControl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("please enter your age ");
        int age = scanner.nextInt();

        if (age < 20) {
            System.out.println("you are young ");
        } else {
            System.out.println("you aren't young ");

        }

        if (age < 10) {
            System.out.println("kid");
        } else if (age < 20) {
            System.out.println("young");
        } else if (age < 50) {
            System.out.println("adult");
        } else if (age > 49) {
            System.out.println("old");
        }


        if (age >= 0 && age < 10) {
            System.out.println("kid");
        }
        if (age >= 10 && age < 20) {
            System.out.println("young");
        }
        if (age >= 20 && age < 50) {
            System.out.println("adult");

        }
        if (age >= 50) {
            System.out.println("old");
        }
    }

    private static void Explonation() {
        boolean condition = false;
        if (condition) System.out.println("in if ");
        System.out.println("out of IF block");

        if (condition) {
            System.out.println("in IF ");
        }

        if (condition) {

            System.out.println("out of in block ");
        }

        System.out.println("still in If Block");


        System.out.println("out of If block");
    }
}
