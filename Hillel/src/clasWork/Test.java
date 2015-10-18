package clasWork;

import java.awt.geom.Path2D;

/**
 * Created by ${Roman} on 17.10.2015.
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            System.out.print(i + " , ");
            if (i % 2 == 0)
                continue;
            System.out.println("\n");
        }

        outer: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.print("\n");
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.print("\n");
    }




}
