/*
 * 5.6. Write a Java program that demonstrates wait() and notifyAll() by having 
 * multiple threads wait on a shared resource and notifying all threads to proceed at once.
 */
public class Main5_6 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Create multiple waiting threads
        for (int i = 1; i <= 3; i++) {
            Thread t = new Thread(() -> resource.waitingThread(), "Thread-" + i);
            t.start();
        }

        // Notify all threads after a delay
        new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulate some work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            resource.notifyAllThreads();
        }, "Notifier").start();
    }
}

class SharedResource {
    public synchronized void waitingThread() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting...");
            wait(); // Wait until notified
            System.out.println(Thread.currentThread().getName() + " is proceeding...");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }

    public synchronized void notifyAllThreads() {
        System.out.println(Thread.currentThread().getName() + " is notifying all threads...");
        notifyAll(); // Notify all waiting threads
    }
}
