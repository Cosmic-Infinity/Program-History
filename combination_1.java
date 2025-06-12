/* 1. WAP IN JAVA TO ENTER A NATURAL NUMBER. DISPLAY ALL THE POSSIBLE COMBINATIONS
OF CONSECUTIVE NATURAL NUMBERS WHICH ADDS UP TO GIVE THE SUM EQUAL TO THE
ORIGINAL NUMBER.*/

/*
ENTER A NUMBER
50
8 9 10 11 12 
11 12 13 14 
*/

import java .util.*;
public class combination_1{
    // to find whether different combination of consecutive number equal to the original number
    public static void main (){
        Scanner sc= new Scanner (System.in);
        int j,sum;
        System.out.println("ENTER A NUMBER");
        int n= sc.nextInt();
        for(int i=1;i<=n/2+1;i++){
            sum=0;
            for(j=i;j<=n/2+1;j++){
                sum=sum+j;//calculating the sum of the concequtive number
                if(sum==n)//condition checking the function
                    break;
            }
            if(j<=n/2+1){
                for(int k=i;k<=j;k++)
                    System.out.print(k+" ");
                System.out.println();
            }
        }
    }
}
