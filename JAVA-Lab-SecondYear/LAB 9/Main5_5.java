/*
5.5. StringBuilder vs. String Concatenation: Measure the performance difference when appending characters 100,000 times.
 */

class Main5_5 {
    public static void main(String[] args) {
        long startTime, endTime;

        // Using String Concatenation
        String str = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str += "a";
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken String Concatenation: " + (endTime - startTime) + " ms");

        // Using StringBuilder
        StringBuilder sb = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken StringBuilder: " + (endTime - startTime) + " ms");
    }
}
