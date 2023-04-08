/*Input a Number
175
175 is a Disarium number

Input a Number
5784
5784 is not a Disarium number
*/

import java.util.Scanner;
public class Disarium_43{
    int num,size;
    Disarium_43(int nn){
        num=nn;
        size=0;
    }

    void countDigits(){
        size=(num+"").length();
    }

    int sumofDigits(int n,int p){
        if(n==0)
            return 0;
        else
            return (int)Math.pow((n%10),p) +sumofDigits((n/10),(p-1));
    }

    void check(){
        if(sumofDigits(num,size)==num)
            System.out.println(num+" is a Disarium number");
        else
            System.out.println(num+" is not a Disarium number");
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a Number");
        Disarium_43 ob1=new Disarium_43(sc.nextInt());
        ob1.countDigits();
        ob1.check();
    }
}