package database;

import java.util.ArrayList;

/**
 * Created by RMysholovka on 21.12.2015.
 */
public class SingletonExample {
    private static SingletonExample instance = new SingletonExample();
    public String someValue;

    private SingletonExample() {

    }

    public static SingletonExample getInstance() {
        if (instance == null) {
            synchronized (SingletonExample.class) {
                if (instance == null) {
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }

    public static void clear() {
        instance = null;
    }


    public static void main(String[] args) throws InterruptedException {
        ArrayList<SingletonExample> singletonExamples = new ArrayList<>();
        singletonExamples.add(null);
        singletonExamples.add(null);

        int i = 0;
        while (true) {
            i++;


            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    SingletonExample singletonExample = SingletonExample.getInstance();
                    singletonExamples.set(0, singletonExample);
                }
            });


            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    SingletonExample singletonExample = SingletonExample.getInstance();

                    singletonExamples.set(1, singletonExample);
                }
            });

            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();

            if (singletonExamples.get(0) != singletonExamples.get(1)) {
                break;
            }
            clear();

        }
    }
}