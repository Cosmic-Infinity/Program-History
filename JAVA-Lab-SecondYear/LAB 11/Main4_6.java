/*
 * 4.6. Create a Java program to avoid deadlock using proper synchronization strategies.
 */
public class Main4_6 {
    public static void main(String[] args) {
        final Object resource1 = "Resource1";
        final Object resource2 = "Resource2";

        // Thread 1 locks resource1 then resource2
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked resource 1");
                synchronized (resource2) {
                    System.out.println("Thread 1: Locked resource 2");
                }
            }
        });

        // Thread 2 locks resource1 then resource2 (same lock ordering as Thread 1)
        Thread t2 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 2: Locked resource 1");
                synchronized (resource2) {
                    System.out.println("Thread 2: Locked resource 2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
