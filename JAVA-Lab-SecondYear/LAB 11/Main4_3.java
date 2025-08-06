/*
 * 4.3. Write a Java program that demonstrates a race condition by updating
 * a shared variable from multiple threads and fixing the race condition 
 * using synchronization.
 */
public class Main4_3 {
    private int counter = 0;

    public void increment() {
        counter++;
        System.out.println(Thread.currentThread().getName() + " incremented counter to: " + counter);
    }

    public void sync_increment() {
        synchronized (this) {
            counter++;
            System.out.println(Thread.currentThread().getName() + " incremented counter to: " + counter);
        }
    }

    public static void main(String[] args) {
        Main4_3 obj = new Main4_3();
        // Thread task to call the increment method
        Runnable task = () -> {
                    for (int i = 0; i < 2; i++)
                        obj.increment();
            };
        Runnable task_sync = () -> {
                    for (int i = 0; i < 2; i++)
                        obj.sync_increment();
            };
        Thread t1 = new Thread(task, "t1");
        Thread t2 = new Thread(task, "t2");
        t1.start();
        t2.start();
        try{Thread.sleep(100);}
        catch (Exception ie){}
        obj.counter = 0;
        System.out.println("Synchronized now");
        Thread t3 = new Thread(task_sync, "t3");
        Thread t4 = new Thread(task_sync, "t4");
        t3.start();
        t4.start();
    }
}
