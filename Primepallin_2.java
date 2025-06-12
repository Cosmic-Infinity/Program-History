
/* 2. WAP IN JAVA TO PRINT ALL PRIME PALLINDROME NUMBERS BETWEEN ‘m’ AND ‘n’.*/

/*
enter the value of m
5
enter the value of n
75
prime pallindrom number between 5 and 75 are
5,7,11,
 */

import java.util.*;
public class Primepallin_2{
    public static void main(){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the value of m");
        int m=sc.nextInt();
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        System.out.println("prime palindrom number between "+m+" and "+n+" are");
        for (int i=m;i<=n;i++){
            int k=0;
            StringBuilder s = new StringBuilder((i+""));
            s=s.reverse();
            if((i+"").equals(s.toString())){
                for(int j=1;j<i;j++){
                    if(i%j==0)
                        k++;
                }
                if(k==1)
                    System.out.print(i+",");
            }
        }
    }
}
