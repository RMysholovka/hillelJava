package pattern.decorator;

<<<<<<< HEAD
/**
 * Created by RMysholovka on 12.11.2015.
 */
public class Main {
    public static void main(String[] args) {
       /* Beverage beverage = new Robusta();
=======
import java.util.Scanner;

/**
 * Created by RMysholovka on 12.11.2015.
 */
public class Main {
    public static void main(String[] args) {

     /*   Beverage beverage = new Robusta();
>>>>>>> origin/master
        beverage.setMilk(true);
        System.out.println(beverage.description() + " " + beverage.cost());

        Scanner scanner = new Scanner(System.in);
        int cash = scanner.nextInt();
<<<<<<< HEAD

        check(cash, beverage);*/


=======
        check(cash, beverage);

    }*/
        
>>>>>>> origin/master
        Beverage beverage = new Arabica();
        beverage = new Milk(beverage);
        beverage = new Milk(beverage);

        System.out.println(beverage.description());
<<<<<<< HEAD
        System.out.println(beverage.cost());


        Beverage beverage1 = new Milk(new Cream(new Milk(new Arabica())));

    }

    private static void check(int cash, Beverage beverage) {
        if (cash != beverage.cost()) {
            System.out.println("khm!");
        } else {
            System.out.println("ok");
        }
=======
        System.out.println(beverage.cost);

    /*private static void check(int cash, Beverage beverage) {
        if (cash != beverage.cost()) {
            System.out.println("kim");

        } else {
            System.out.println("ok");
        }*/
>>>>>>> origin/master
    }
}
