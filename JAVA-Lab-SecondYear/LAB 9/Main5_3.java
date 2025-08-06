/*
5.3Memory Optimization with String.intern(): Show how using intern() reduces memory usage for duplicate strings.
 */

public class Main5_3 {
    public static void main(String[] args) {
        // Creating many duplicate strings without using intern
        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Request GC to get more accurate readings
        long before = runtime.totalMemory() - runtime.freeMemory();

        for (int i = 0; i < 10000; i++) {
            String duplicate = new String("MemoryTest");
        }

        runtime.gc();
        long afterWithoutIntern = runtime.totalMemory() - runtime.freeMemory();

        // Creating many duplicate strings using intern
        runtime.gc();
        long beforeIntern = runtime.totalMemory() - runtime.freeMemory();

        for (int i = 0; i < 10000; i++) {
            String duplicate = new String("MemoryTest").intern();
        }

        runtime.gc();
        long afterWithIntern = runtime.totalMemory() - runtime.freeMemory();

        // Printing memory usage
        System.out.println("Memory used without intern: " + (afterWithoutIntern - before) + " bytes");
        System.out.println("Memory used with intern: " + (afterWithIntern - beforeIntern) + " bytes");
    }
}