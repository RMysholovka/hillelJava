package HomeWork.xor;

import java.util.Scanner;

/**
 * Created by ${Roman} on 18.10.2015.
 */
public class Xor {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter your message: ");
        String message = scanner.next();
        System.out.println("Pleas enter your key: ");
        String key = scanner.next();


        crypt(message, key);


    }

    public static void crypt(String message, String key) {

       char[] charsK = key.toCharArray();
        char[] charsM = message.toCharArray();
        for (int i = 0; i < charsM.length; i++) {
            for (int j = 0; j < charsK.length; j++) {
                charsM[i] ^= charsK[j];


           }


        }
        String encmessage = String.copyValueOf(charsM);
        System.out.println("\n enmessage: " + encmessage);
    }
}

