/*
 * 5.7. Create a Java program that uses wait() and notify() to implement a signaling mechanism 
 * between two threads, where one thread sends a signal to another thread to perform an action.
 */
public class Main5_7 {
    public static void main(String[] args) {
        Signal signal = new Signal();
        // Thread that waits for the signal
        Thread waitingThread = new Thread(() -> signal.waitForSignal(), "WaitingThread");
        // Thread that sends the signal
        Thread signalingThread = new Thread(() -> signal.sendSignal(), "SignalingThread");

        waitingThread.start();
        signalingThread.start();
    }
}

class Signal {
    private boolean signalSent = false;

    public synchronized void waitForSignal() {
        while (!signalSent) {
            try {
                System.out.println(Thread.currentThread().getName() + " waiting for the signal...");
                wait(); // Wait until the signal is sent
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " received the signal. Proceeding...");
    }

    public synchronized void sendSignal() {
        try {
            Thread.sleep(2000); // Simulate some delay before sending the signal
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        signalSent = true;
        System.out.println(Thread.currentThread().getName() + " sent the signal.");
        notify(); // Notify the waiting thread
    }
}
