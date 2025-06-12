/* 8.WAP IN JAVA TO INPUT NUMBER N(1<_ N <_200) AND DISPLAY ALL THE HARSHAD
NUMBER OR NIVEN NUMBER IN THE RANGE FROM 1 TO N THEM (both inclusive).

HARSHAD NUMBER : IN RECREATIONAL MATHEMATICS, A HARSHAD NUMBER OR NIVEN
NUMBER IS AN INTEGER( IN BASE 10) THAT IS DIVISIBLE BY THE SUM OF ITS DIGITS.
 */

/*
Enter range : 20
1,2,3,4,5,6,7,8,9,10,12,18,20,
*/

import java .util.*;
class niven_8{
    public static void main(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter range : "); 
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            int temp=i;
            int sum = 0;
            while(temp>0){
                sum = sum+(temp%10);
                temp = temp/10;
            }
            System.out.print(i%sum==0?i+",":"");
        }
    }
}
