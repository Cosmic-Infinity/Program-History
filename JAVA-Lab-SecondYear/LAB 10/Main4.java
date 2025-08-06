/*

4.    Character Stream Basics:  Write a Java program using FileReader and FileWriter to read a text file
and write its content to another text file.

 */
import java.io.*;
class Main4{
    public static void main(String[] args){
        try{
            FileReader f1 = new FileReader("file4.txt");
            FileWriter f2 = new FileWriter("file5.txt");
            int c = 0;
            while((c=f1.read())!=-1){
                System.out.print((char)c);
                f2.write(c);
            }
            f1.close();
            f2.close();
            System.out.println("\nWritten Successfully");
        }catch (Exception e){System.out.println(e);}
    }
}