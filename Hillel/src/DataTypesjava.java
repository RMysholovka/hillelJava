/**
 * Created by RMysholovka on 21.09.2015.
 */
public class DataTypesjava {
    public static void main(String[] args) {
        byte b = 120;
        short s = b;
        long l = s;

        double d = l; // опасная операция так как может образоваться неточность

        l = 15;
        int maxValue = Integer.MAX_VALUE;
        System.out.println("integer max value is: " + maxValue);
        long intMaxValue = maxValue;
        long intOverflow = intMaxValue + 1;

        int i = (int) intOverflow;
        System.out.println("overflow int: " + i);

        d = Math.PI;
        i = (int) d;

        System.out.println("PI is: " + i);

        i = (int) 3.9;

        System.out.println("3.9 after converting is: " + i);

        /*
        byte = - + 8 bit
        short = -+ 16 bit
        char = -+ 16 bit
        int = -+ 32 bit
        long = -+ 64 bit
        float == -+ 32 bit
        double = -+ 64 bit 3.4 * 10^308
         */

    }

    private static void realNmberComperion() {
        if (1.1 + 1.1 + 1.1 == 3.3) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are not equal");
        }
        System.out.println("1.1 + 1.1 + 1.1 =" + (1.1 + 1.1 + 1.1));
    }

    private static void primitiveDataType() {
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
