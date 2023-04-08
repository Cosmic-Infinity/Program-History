/*
Enter number of terms
5
a,b,ba,bab,babba
*/

import java.util.Scanner;
public class FiboString_16{
    String x,y,z;
    int n;
    FiboString_16(){
        x="a";
        y="b";
        z="ba";
    }

    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");
        n=sc.nextInt();
    }

    void generate(){
        System.out.print(x+","+y+","+z);
        for(int i=1;i<=n-3;i++){
            x=y;
            y=z;
            z=y+x;
            System.out.print(","+z);
        }
    }

    public static void main(String[] args){
        FiboString_16 obj1=new FiboString_16();
        obj1.accept();
        obj1.generate();
    }
}