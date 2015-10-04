/**
 * Created by ${Roman} on 04.10.2015.
 */
public class HappyTicket {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1001; i < 1000000; i++) {
            int i1 = i / 100000 % 10,
                    i2 = i / 10000 % 10,
                    i3 = i / 1000 % 10,
                    i4 = i / 100 % 10,
                    i5 = i / 10 % 10,
                    i6 = i % 10;
            if ((i1 + i2 + i3) == (i4 + i5 + i6)) {
                a++;
            }
        }
        System.out.println("Number happy tickets: " + a);


    }

}

