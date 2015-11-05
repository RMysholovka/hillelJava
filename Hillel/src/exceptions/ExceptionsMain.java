package exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RMysholovka on 05.11.2015.
 */
public class ExceptionsMain {
    public static void main(String[] args) {
        Integer i = null;
        System.out.println("befor");

        try {
            System.out.println("befor try");
            nestodMethod1(i);
            System.out.println("after try");
        } catch (NullPointerException e) { // NPE
            System.out.println("Somsing wrong: " + e.toString());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Somsing else wrong: " + e.toString());
        } catch (RuntimeException e) {
            System.out.println("Somsing Runtime Ex wrong: " + e.toString());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void nestodMethod1(Integer i) throws Exception {
        // List<Integer> integers = new ArrayList<>();
        //integers.get(1);
        // nestodMethod2(i);


        if (true) {
            throw new Exception("My exceptoin");
        }

        if (true) {
            throw new RuntimeException("my own exception");
        }
        nestedMethod2(i);
    }

    private static void nestedMethod2(Integer i) {

        i.toString();
    }
}

