import java.util.Scanner;

/**
 * Created by RMysholovka on 01.10.2015.
 */
public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // цикл FOR
            System.out.println("for loop " + i);
        }


    }

    private static void metodDo() {
        String yesNo;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("yes/no");
            yesNo = scanner.next();

        } while (!(yesNo.equals("yes") || yesNo.equals("no"))); // пока не получит false
    }


    private static void metdWhile() {
        int counter = 0;
        while (counter < 10) {
            counter++;
            System.out.println("while loop: " + counter);


        }
    }


    private static void money() {
        int money = 1000;
        int month = 0;
        while (money < 1500) {
            money += 100;
            month++;
            System.out.println("Money: " + money + "month: " + month);

        }
    }
}
