package multithreading;

/**
 * Created by RMysholovka on 30.11.2015.
 */
public class MultithreadingMain {
    public static void main(String[] args) {
        Thread otherThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("other thread begin");
               /* try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("other thread is interrupted");
                }
*/
                while (!Thread.currentThread().isInterrupted()) ;
                {

                }

                System.out.println("other thread end");
            }
        });
//thread.setDaemon(true);
        otherThread.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }

        try {
            otherThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main thread end");

    }
}
