import java.util.Scanner;

/**
 * Created by RMysholovka on 24.09.2015.
 */
public class WorkflowControl {
    public static void main(String[] args) {
        ternaryExample();

    }

    private static void ternaryExample() {
        int number = 5;
        String isEven = isEven(number);
        isEven = (number % 2 == 0) ? "yes" : "no"; // тернарный оператор
       /* if (number % 2 == 0) {
            isEven = true;
        } else {
            isEven = false;
        } */
    }

    public static String isEven(int someNumber) {
        if (someNumber % 2 == 0) {
            return "yes";
        } else {
            return "no";

        }

    }

    private static void caseWithInt() {
        int month = 5; // если переменная укажется строчная "май" будит ошибка, так как в case указаны цифры
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("outem");
                break;
            default:
                System.out.println("wrong number");
                break;

        }
    }

    private static void switchCaseExample() {
        int month = 5;
        switch (month) {
            case 1:
                System.out.println("jan");
                break;
            case 5:
                System.out.println("may");
                break;
            case 12:
                System.out.println("dec");
                break;
            default:
                System.out.println("wrong month number");
                break;
        }

    }


    {
        Scanner scanner = new Scanner(System.in);


        int age = getAge(scanner);


        if (age >= 0 && age < 10)

        {
            System.out.println("kid");
        }

        if (age >= 10 && age < 20)

        {
            System.out.println("young");
        }

        if (age >= 20 && age < 50)

        {
            System.out.println("adult");

        }

        if (age >= 50)

        {
            System.out.println("old");
        }

    }

    private static int getAge(Scanner scanner) {
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
        return age;
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
