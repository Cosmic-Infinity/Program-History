/*
 * 5.9. Write a Java program that demonstrates the use of multiple producer and consumer threads, 
 * using a shared queue, wait(), and notify() for inter-thread communication.
 */
import java.util.LinkedList;

public class Main5_9 {
    public static void main(String[] args) {
        SharedQueue queue = new SharedQueue(5);

        // Create and start multiple producer threads
        for (int i = 1; i <= 2; i++) {
            Thread producer = new Thread(() -> {
                try {
                    queue.produce();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
            }, "Producer-" + i);
            producer.start();
        }

        // Create and start multiple consumer threads
        for (int i = 1; i <= 2; i++) {
            Thread consumer = new Thread(() -> {
                try {
                    queue.consume();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
            }, "Consumer-" + i);
            consumer.start();
        }
    }
}

class SharedQueue {
    private final LinkedList<Integer> buffer = new LinkedList<>();
    private final int capacity;
    private int value = 0;

    public SharedQueue(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce() throws InterruptedException {
        while (true) {
            while (buffer.size() == capacity) {
                wait(); // Wait if the queue is full
            }
            System.out.println(Thread.currentThread().getName() + " produced: " + value);
            buffer.add(value++);
            notifyAll(); // Notify all waiting threads
            Thread.sleep(500); // Simulate production time
        }
    }

    public synchronized void consume() throws InterruptedException {
        while (true) {
            while (buffer.isEmpty()) {
                wait(); // Wait if the queue is empty
            }
            int consumedValue = buffer.removeFirst();
            System.out.println(Thread.currentThread().getName() + " consumed: " + consumedValue);
            notifyAll(); // Notify all waiting threads
            Thread.sleep(500); // Simulate consumption time
        }
    }
}
