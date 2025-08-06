/*
 * 5.2. Create a Java program with two threads where one thread waits for 
 * a condition to be satisfied before notifying another thread to proceed.
 */
public class Main5_2 {
    private boolean cond = false;

    public synchronized void waitCond() {
        while (!cond) {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting...");
                wait(); // wait until notified
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " condition met, proceeding...");
    }

    public synchronized void setCond() {
        cond = true;
        System.out.println(Thread.currentThread().getName() + " set the condition.");
        notify(); // notify the waiting thread
    }

    public static void main(String[] args) {
        Main5_2 obj = new Main5_2();

        // Thread that waits for the condition
        Thread t1 = new Thread(() -> obj.waitCond(), "t1");

        // Thread that sets the condition
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulate some work before setting the condition
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            obj.setCond();
        }, "t2");

        t1.start();
        t2.start();
    }
}
