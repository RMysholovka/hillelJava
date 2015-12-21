package database;

/**
 * Created by RMysholovka on 21.12.2015.
 */
public class SingltoneMain {
    public static void main(String[] args) {
        SingletonExample singleton = SingletonExample.getInstance();
        singleton.someValue = "asd";

        SingletonExample singleton2 = SingletonExample.getInstance();
        System.out.println(singleton2.someValue);
    }
}
