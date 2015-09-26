import org.hamcrest.core.StringContains;
import org.junit.internal.JUnitSystem;

/**
 * Created by RMysholovka on 17.09.2015.
 */
public class MyFirstClass {
    public static void main(String[] args) {
        String helloMessage = "Hello world";
        System.out.println(helloMessage);

        int romaBirthYear = 1980;

        int romaAge = 35;
        int alexAge = 33;

        System.out.println("Before changes:" + romaBirthYear);

        romaBirthYear = 2015;

        System.out.println("I'm " + romaAge);

        System.out.println("31" + 31);

        System.out.println(31 + 31);


    }
}
