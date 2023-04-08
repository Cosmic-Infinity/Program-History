/*
29. A class Merger_29 concatenates two positive integers that are greater than 0 and produces a
new merged integer.
Example:If the first number is 23 and the second is 764,then the concatenated number will be
23764
 */

/*
Enter two numbers
998
12
First Number=998
Second Number=12
Merged Number=99812
*/
import java.util.Scanner;
public class Merger_29{
    long n1,n2,mergNum;
    Merger_29(){
        n1=n2=mergNum=0;
    }

    void readNum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        n1=sc.nextLong();
        n2=sc.nextLong();
    }

    void JoinNum(){
        mergNum=Long.valueOf(n1+""+n2);
    }

    void show(){
        System.out.println("First Number="+n1);
        System.out.println("Second Number="+n2);
        System.out.println("Merged Number="+mergNum);
    }

    public static void main(String[] args){
        Merger_29 ob1=new Merger_29();
        ob1.readNum();
        ob1.JoinNum();
        ob1.show();
    }
}