/*
6.Character Stream with Exception Handling:  Write a Java program using 
FileReader to read a text file and handle any IOException that occurs.
 */

import java.io.*;
class Main6{
    public static void main(String[] args){
        FileReader fin = null;
        try{
            fin = new FileReader("file1.txt");
            int i=0;
            while((i=fin.read())!=-1);
            System.out.println("Read Successfully");
        } 
        catch (FileNotFoundException e) {System.out.println(e.getMessage());}
        catch (IOException e) {System.out.println(e.getMessage());}
        catch (SecurityException e) {System.out.println(e.getMessage());}
        catch (NullPointerException e) {System.out.println(e.getMessage());}
        catch (IllegalArgumentException e) {System.out.println(e.getMessage());}
        catch(Exception e){System.out.println(e);}
    }
}