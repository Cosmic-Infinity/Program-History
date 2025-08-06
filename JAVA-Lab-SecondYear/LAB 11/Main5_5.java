/*
 * 5.5. Create a Java program where one thread produces data and another thread 
 * consumes it. Use wait() and notify() to synchronize the communication.
 */
import java.util.LinkedList;

public class Main5_5 {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();
        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}

class ProducerConsumer {
    private final LinkedList<Integer> buffer = new LinkedList<>();
    private final int capacity = 5;
    // Produce items
    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (buffer.size() == capacity) {
                    wait(); // wait if the buffer full
                }
                System.out.println("Produced: " + value);
                buffer.add(value++);
                notify(); // notify consumer
                Thread.sleep(1000); // production delay
            }
        }
    }

    // Consume items
    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (buffer.isEmpty()) {
                    wait(); // Wait if the buffer empty
                }
                int value = buffer.removeFirst();
                System.out.println("Consumed: " + value);
                notify(); // notify producer
                Thread.sleep(1000); // consumption time
            }
        }
    }
}
