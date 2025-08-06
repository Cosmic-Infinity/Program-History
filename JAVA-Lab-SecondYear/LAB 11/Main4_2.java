/*4.2. Create a program that uses a synchronized block to ensure that
 two threads don't simultaneously access a critical section of code.
 */
public class Main4_2 {
    private int counter = 0;

    public void increment() {
        synchronized (this) {
            counter++;
            System.out.println(Thread.currentThread().getName() + " incremented counter to: " + counter);
        }
    }

    public static void main(String[] args) {
        Main4_2 obj = new Main4_2();
        // Thread task to call the increment method
        Runnable task = () -> {
            for (int i = 0; i < 3; i++) {
                obj.increment();
            }
        };
        Thread t1 = new Thread(task, "t1");
        Thread t2 = new Thread(task, "t2");
        t1.start();
        t2.start();
    }
}
