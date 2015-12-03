package multithreading.producerConsumer;

/**
 * Created by RMysholovka on 03.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();

        Producer producer = new Producer(bucket);
        Consumer consumer = new Consumer(bucket);

        producer.start();
        consumer.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        producer.interrupt();
        consumer.interrupt();

        try {
            producer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(bucket);
    }
}
