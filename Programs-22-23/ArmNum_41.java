/*
371 is an Armstrong number

2451 is not an Armstrong number
*/

import java.util.*;
public class ArmNum_41{
    int n,l;
    static Scanner x=new Scanner(System.in);
    ArmNum_41(int nn){
        n=nn;
        l=Integer.toString(n).length();
    }

    int sum_pow(int i){ 
        if(i==0)
            return 0;
        else
            return (int)Math.pow(i%10,l) + sum_pow(i/10);
    }

    void isArmstrong(){
            System.out.println(sum_pow(n)==n? n+ " is an Armstrong number":"NOT");
    }

    static void main(int n){
        ArmNum_41 obj=new ArmNum_41(n);
        obj.isArmstrong();
    }
}