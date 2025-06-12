/*10. Test for a Goldbach Number
A positive and even number is called a Goldbach number if 
the number can be expressed as the sum of two odd prime numbers.
Note that all even integers greater than 4 are Goldbach numbers.
 */

/*
Odd and Prime Pairs are: 
5 , 19
7 , 17
11 , 13
24 is a Goldbach number.
*/
import java.util.*;
class Goldbach_10{
    public static void main(int num){
        int arr1[]=new int[num];    
        int arr2[]=new int[num];
        int b=0;
        if(num%2!=0)   
            System.out.println("Invalid Input, Number is Odd.");            
        else{
            for(int i=2;i<num;i++){   
                int count=0;
                for(int j=2;j<i;j++){       
                    if(i%j==0)
                        count++;
                }
                if(count==0){
                    arr1[b]=i;   
                    arr2[b]=i; 
                    b++;
                }
            } 
            System.out.println("Odd and Prime Pairs are: ");               
            for(int i=0;i<b;i++){                   
                for(int j=i;j<b;j++){                               
                    if((arr1[i]+arr2[j])==num){              
                        System.out.print(arr1[i]+" , "+arr2[j]);   
                        System.out.println();                       
                    }                   
                }               
            }               
            System.out.println(num>2?num+" is a Goldbach number.":"Not Goldbach");
        }  
    } 
}