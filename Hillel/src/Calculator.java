import java.util.Scanner;

/**
 * Created by ${Roman} on 29.09.2015.
 */
public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter number1: ");
        int number1 = scanner.nextInt();
        System.out.println("Pleas enter operation: ");
        String operation = scanner.next();
        System.out.println("Pleas enter second number2: ");
        int number2 = scanner.nextInt();


        int res = 0;
        res = metodCalc(number1, operation, number2, res);
        System.out.println("Result: " + res);


        System.out.println("Pleas enter number3: ");
        double number3 = scanner.nextDouble();
        System.out.println("Pleas enter operation trunk or fract: ");
        operation = scanner.next();
        scanner.close();

        double res1 = 0;
        res1 = metFractTrunk(number3, res1, operation);
        System.out.println("Result: " + res1);


    }

    private static int metodCalc(int number1, String operation, int number2, int res) {
        switch (operation) {
            case "+":
                res = number1 + number2;
                break;
            case "-":
                res = number1 - number2;
                break;
            case "*":
                res = number1 * number2;
                break;
            case ":":
                res = number1 / number2;
                break;
        }
        return res;
    }

    private static double metFractTrunk( double number3, double res1, String operation) {

        switch (operation) {

            case "trunk":
                res1 = (int) number3;
                break;
            case "fract":
                res1 = (double) (number3 - (int) number3);
                break;
        }
        return res1;
    }

}






