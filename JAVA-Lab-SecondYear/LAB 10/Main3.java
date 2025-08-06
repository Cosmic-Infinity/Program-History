/*

3.Byte Stream with Exception Handling:  Write a Java program that reads a binary file 
using FileInputStream and handles any IOException that may occur, such as file not found or permission issues.

 */
import java.io.*;
class Main3{
    public static void main(String[] args){
        FileInputStream fin = null;
        try{
            fin = new FileInputStream("C:\\Users\\KIIT0001\\Documents\\4th Sem-also\\KFS CLEAN LOGO.png");
            int i=0;
            while((i=fin.read())!=-1);
            System.out.println("Read Successfully");
        } 
        catch (FileNotFoundException e) {System.out.println(e.getMessage());}
        catch (EOFException e) {System.out.println(e.getMessage());}
        catch (IOException e) {System.out.println(e.getMessage());}
        catch(Exception e){System.out.println(e);}
    }
}