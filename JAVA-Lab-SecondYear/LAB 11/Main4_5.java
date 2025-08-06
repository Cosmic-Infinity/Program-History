/*
 * 4.5. Write a Java program to demonstrate deadlock by creating two threads 
 * that each hold a lock on one resource and try to acquire the lock on the other resource.
 */
public class Main4_5 {
    public static void main(String[] args) {
        final Object resource1 = "Resource1";
        final Object resource2 = "Resource2";

        // Thread 1 tries to lock resource1 then resource2
        Thread t1 = new Thread(() -> {
                        synchronized (resource1) {
                            System.out.println("Thread 1: Locked resource 1");

                            try {Thread.sleep(100);} catch (Exception e) {}

                            synchronized (resource2) {
                                System.out.println("Thread 1: Locked resource 2");
                            }
                        }
                });

        // Thread 2 tries to lock resource2 then resource1
        Thread t2 = new Thread(() -> {
                        synchronized (resource2) {
                            System.out.println("Thread 2: Locked resource 2");

                            try {Thread.sleep(100);} catch (Exception e) {}
                            
                            synchronized (resource1) {
                                System.out.println("Thread 2: Locked resource 1");
                            }
                        }
                });

        t1.start();
        t2.start();
    }
}
