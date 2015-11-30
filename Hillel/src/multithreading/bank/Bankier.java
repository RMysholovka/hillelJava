package multithreading.bank;

import java.util.Random;

/**
 * Created by RMysholovka on 30.11.2015.
 */
public class Bankier extends Thread {
    private Bank bank;
    private Random random = new Random();
    private long transactionCount;

    public Bankier(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            transactionCount++;
            int randomAmount = random.nextInt(1000);
            Boolean randomDirection = random.nextBoolean();
            bank.transacrion(randomAmount, randomDirection);
        }
    }
}
