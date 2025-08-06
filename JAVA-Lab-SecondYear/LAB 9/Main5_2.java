/*
5.2 Multi-threading with Strings: Write a multi-threaded program to show why StringBuffer is thread-safe but StringBuilder is not.
 */

public class Main5_2 {
    public static void main(String[] args) throws InterruptedException {
        int numThreads = 10, iterations = 10000;
        StringBuffer safe = new StringBuffer();
        StringBuilder unsafe = new StringBuilder();

        Runnable safeTask = () -> {
                    for (int i = 0; i < iterations; i++) safe.append("a");
            };

        Runnable unsafeTask = () -> {
                    for (int i = 0; i < iterations; i++) unsafe.append("a");
            };

        Thread[] safeThreads = new Thread[numThreads];
        Thread[] unsafeThreads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            safeThreads[i] = new Thread(safeTask);
            unsafeThreads[i] = new Thread(unsafeTask);
            safeThreads[i].start();
            unsafeThreads[i].start();
        }
        for (int i = 0; i < numThreads; i++) {
            safeThreads[i].join();
            unsafeThreads[i].join();
        }
        System.out.println("Expected length: " + (numThreads * iterations));
        System.out.println("StringBuffer length: " + safe.length());
        System.out.println("StringBuilder length: " + unsafe.length());
    }
}