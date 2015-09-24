/**
 * Created by RMysholovka on 21.09.2015.
 */
public class DataTypesjava {
    public static void main(String[] args) {
        int age = 35;

        int days = age * 365;

        int hours = days * 24;

        int seconds = hours * 3600;

        long milliseconds = seconds * 1000L;

        long longseconds = milliseconds / 1000;

        seconds = (int) longseconds;

        seconds = (int) (milliseconds / 1000);

        System.out.println(milliseconds);

        double d = 3.54;
        int i = 10;
        long l = 1000000000000000000L;
        float f = 2.5F;


        boolean bool = true;
        bool = false;
        //bool = 0; error

        String s = "Hello orld";
        char c = 'h';

        byte b = 125;



    }
}
