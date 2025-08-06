/*
30. Copying a File with Progress Display: Write a Java program that copies a large file (e.g., a video or an image) and displays the progress (in percentage) on the console as the file is copied using FileInputStream and FileOutputStream.
 */

import java.io.*;

class Main30 {
    public static void main(String[] args) {
        String sourceFile = "bigfile.mp4";
        String destinationFile = "bigfile-copy.mp4";

        try {
            File source = new File(sourceFile);
            long totalBytes = source.length();
            long copiedBytes = 0;

            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationFile);

            byte[] buffer = new byte[1024];
            int bytesRead;
            int p=0,pold=0;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                copiedBytes += bytesRead;
                pold = p;
                p = (int) (copiedBytes * 100 / totalBytes);
                if(pold!=p)
                    System.out.println("Progress: " + p + "%\r");
            }

            fis.close();
            fos.close();
            System.out.println("\nFile copied successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
