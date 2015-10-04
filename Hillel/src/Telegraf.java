import java.util.Scanner;

/**
 * Created by ${Roman} on 04.10.2015.
 */
public class Telegraf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pleas enter your message: ");
        String message = scanner.nextLine();
        System.out.println("Pleas enter the price of one word: ");
        int priceForWord = scanner.nextInt();

        int price = priceForWord * message.split(" ").length;


        System.out.println(price + " cents, price per message");
    }


}

