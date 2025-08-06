/*
24. Buffered Streams Performance Comparison: Write a Java program that compares the performance of copying a file using FileInputStream vs. BufferedInputStream. Measure and print the time taken for each approach.
 */

import java.io.*;

class Main24 {
    public static void main(String[] args) {
        String sourceFile = "file13.txt";
        String destFile1 = "file14.txt";
        String destFile2 = "file14.txt";

        // Measure time for FileInputStream and FileOutputStream
        try {
            long startTime = System.currentTimeMillis();
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destFile1);

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            fis.close();
            fos.close();
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken using FileInputStream and FileOutputStream: " + (endTime - startTime) + " ms");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Measure time for BufferedInputStream and BufferedOutputStream
        try {
            long startTime = System.currentTimeMillis();
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile2));

            int byteData;
            while ((byteData = bis.read()) != -1) {
                bos.write(byteData);
            }

            bis.close();
            bos.close();
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken using BufferedInputStream and BufferedOutputStream: " + (endTime - startTime) + " ms");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
