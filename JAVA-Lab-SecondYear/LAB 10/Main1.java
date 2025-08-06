/*

1.Byte Stream Basics:  Write a Java program that uses FileInputStream to read the contents
of a binary file (e.g., image, audio file) byte by byte and displays the byte values on the console.

 */
import java.io.*;
class Main1{
    public static void main(String[] args){
        FileInputStream fin = null;
        try{
            fin = new FileInputStream("C:\\Users\\KIIT0001\\Documents\\4th Sem-also\\KFS CLEAN LOGO.png");  
            int i=fin.read();
            while((i=fin.read())!=-1)
                System.out.println(i);
        }catch (Exception e){System.out.println(e);}
    }
}