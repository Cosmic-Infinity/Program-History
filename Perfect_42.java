/*
Enter a number
496
496 is a Perfect number

Enter a number
124
124 is not a Perfect number
*/

import java .util.Scanner;
public class Perfect_42{
    int num;
    Perfect_42(int nn){num=nn;}

    int sum_of_factors(int i){
        if (i == num)
            return 0;
        else if(num%i==0)
            return i + sum_of_factors(i+ 1);
        else
            return sum_of_factors(i+ 1);
    }

    void check(){
        if (sum_of_factors(1)==num)
            System.out.println(num+" is a Perfect number");
        else
            System. out.println(num+" is not a Perfect number");
    }

    public static void main(String atgs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        Perfect_42 ob1=new Perfect_42(num);
        ob1.check();
    }
}