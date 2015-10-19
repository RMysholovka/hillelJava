import java.util.Scanner;

/**
 * Created by ${Roman} on 05.10.2015.
 */
public class Encryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter your message: ");
        String message = scanner.next();
        System.out.println("Pleas enter your key: ");
        String key = scanner.next();
        String encmsg = "";
        String decmsg = "";


        //  int keylen = key.length();
        // int msglen = message.length();


        int j;
        j = 0;
        for (int i = 0; i < message.length(); i++) {

            encmsg = (encmsg + (char) (message.charAt(i) ^ key.charAt(j)));

            j++;
            if (j == key.length()) {
                j = 0;
                System.out.println("Encoded message: " + encmsg);
            }

        }

        j = 0;
        for (int i = 0; i < message.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == key.length()) {
                j = 0;
            }
        }

        System.out.println("Decoded message: " + decmsg);

    }

}


