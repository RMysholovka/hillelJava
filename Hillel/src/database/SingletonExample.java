package database;

/**
 * Created by RMysholovka on 21.12.2015.
 */
public class SingletonExample {
    private static SingletonExample instance = new SingletonExample();
    public String someValue;

    private SingletonExample() {

    }

    public static synchronized SingletonExample getInstance() {
        if (instance == null) {
            if (instance instanceof Object) {
                instance = new SingletonExample();

            }
        }
        return instance;
    }

}
