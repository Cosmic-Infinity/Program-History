import java.io.*;

class Read_and_Add{
    public static void main(String[] args){
        try{
            FileInputStream fin1 = new FileInputStream("file1.txt");
            FileInputStream fin2 = new FileInputStream("file2.txt");
            FileOutputStream fout = new FileOutputStream("file3.txt");
            int a = 0, b = 0, num1 = 0, num2 = 0, num3=0;
            while((a=fin1.read())!=-1)
                num1 = (num1*10) + (a-'0');
            while((b=fin2.read())!=-1)
                num2 = (num2*10) + (b-'0');
            fout.write((num1+num2+"").getBytes());
            System.out.println("Written Successfully");
        }catch (Exception e){System.out.println(e);}
    }
}