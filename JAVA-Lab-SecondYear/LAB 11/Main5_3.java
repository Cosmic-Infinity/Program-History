/*
 * 5.3. Write a program to demonstrate how the notify() method can be used to 
 * wake up a waiting thread in inter-thread communication.
 */
public class Main5_3 {
    public static void main(String[] args) {
        SharedResource shared = new SharedResource();
        // Thread that waits
        Thread t1 = new Thread(() -> shared.waitingThread(), "t1");
        // Thread that notifies
        Thread t2 = new Thread(() -> shared.notifyingThread(), "t2");
        t1.start();
        t2.start();
    }
}

class SharedResource {
    public synchronized void waitingThread() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting...");
            wait(); // Waits until notified
            System.out.println(Thread.currentThread().getName() + " is resumed and proceeding...");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }

    public synchronized void notifyingThread() {
        try {
            Thread.sleep(2000); // Simulate some work before notifying
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " is notifying...");
        notify(); // Notifies the waiting thread
    }
}
