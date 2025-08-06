/*

2.Byte Stream File Copy:  Write a Java program that copies the content of one binary file 
to another using FileInputStream and FileOutputStream.

 */
import java.io.*;
class Main2{
    public static void main(String[] args){
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try{
            fin = new FileInputStream("C:\\Users\\KIIT0001\\Documents\\4th Sem-also\\KFS CLEAN LOGO.png");
            fout = new FileOutputStream("C:\\Users\\KIIT0001\\Documents\\4th Sem-also\\KFS CLEAN LOGO2.png");
            int i=0;
            while((i=fin.read())!=-1)
                fout.write(i);
            fin.close();
            fout.close();
            System.out.println("Copied Successfully");
        }catch (Exception e){System.out.println(e);}
    }
}