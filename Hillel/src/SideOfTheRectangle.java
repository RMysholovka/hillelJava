import java.util.Scanner;

/**
 * Created by ${Roman} on 27.09.2015.
 */
public class SideOfTheRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter area of rectangle ");
        double area = scanner.nextDouble();
        System.out.print("Please enter perimetr of rectangle ");
        double perimetr = scanner.nextDouble();


        double b = ((Math.sqrt(Math.pow(perimetr, 2) - 16 * area) + perimetr) / 4);

        double a = area / b;

        if (2 * a + 2 * b == perimetr) {
            System.out.println("Side a of the rectangle = " + a + " and " + "Side b of the rectangle = " + b);

        } else
            System.out.println("The rectangle with such parameters does not exist");
    }
}
