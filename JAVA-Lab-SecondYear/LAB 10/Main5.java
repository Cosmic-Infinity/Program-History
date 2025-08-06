/*
5.Character Stream Reading Line by Line:  Write a Java program that uses FileReader 
to read a text file line by line and prints each line to the console.
 */

import java.io.*;
class Main5{
    public static void main(String[] args){
        try{
            FileReader f1 = new FileReader("file4.txt");
            int c = 0;
            while((c=f1.read())!=-1){
                System.out.print((char)c);
            }
            f1.close();
            System.out.println("\n-------------------------");
        }catch (Exception e){System.out.println(e);}
    }
}