package OOP;

import OOP.OOP;

/**
 * Created by RMysholovka on 05.10.2015.
 */
public class Caller {
    public static void main(String[] args) {
        OOP.printString();
        OOP.shareString = "yahoo";
        OOP.printString();
    }
}
