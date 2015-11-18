package HomeWork.myHashSet;

import java.security.PublicKey;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by ${Roman} on 04.11.2015.
 */
public class HashList {
    private static String message;
    public Object value;
    public HashList next;


    public static void main(String[] args) {



       // System.out.println("enter massage: ");
      //  Scanner scanner = new Scanner(System.in);
       // String massage = scanner.next();

       // char[] array = message.toCharArray();
        char b = 'r';
       char k = '6';
       // for (int i = 0; i < array.length; i++) {

             //  long result =  (array[i] ^ k);
          // result = result +  (array[i] ^ k);
       long result = b^k;
            System.out.println(result);
        }
    }

