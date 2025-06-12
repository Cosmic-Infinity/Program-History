/*Question 3
A MOBIUS function M(N) returns the value -1 or 0 or 1 for a natural number (N) by
the following conditions are defined :
When,
M ( N ) = 1 if N=1.
M ( N ) = 0 if any prime factor of N is contained more than once.
M ( N ) = ( -1 )^P if N is the product of ‘P’ distinct prime factors.
Write a program to accept a positive natural number (N) and display the MOBIUS result
with proper message.*/

import java.util.*;
class Mobius{
    public static void main(){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = ob.nextInt();
        while(n<1){ //natural number test
            System.out.println("Not a natural number.Try Again.");
            n= ob.nextInt();
        }      
        System.out.println("M("+n+") = "+mobius(n));//result of mobius test
    }

    private static byte mobius(int n){
        if(n==1){ //when mobius retult +1
            System.out.println("Input: "+n);
            System.out.println("Output: 1 = 1");
            System.out.println("NO PRIME FACTORS");
            return 1;
        }
        else{
            System.out.println("Input: "+n);
            short pf_count = primefac(n);
            if( pf_count == 0){ //when  mobius result 0
                System.out.println("DUPLICATE PRIME FACTORS");
                return 0;
            }
            else{ //when mobius result -1^something
                System.out.println("NUMBER OF DISTINCT PRIME FACTORS = "+pf_count);
                return ((byte)Math.pow(-1,pf_count));
            }
        }
    }

    private static short primefac(int n){
        short fac = 2;
        short last_fac = 0;
        short pf_count=0;
        byte dupli = 0;
        System.out.print("Output: "+n+" = ");
        for(; n>1;){ //finding prime factors
            if(n%fac==0){
                if(pf_count>0) //just for styling. no actual function
                    System.out.print(" x ");
                n=n/fac;
                System.out.print(fac);//printing prime factors
                pf_count++; //counting prime factors
                if(fac == last_fac) //duplicate factor check
                    dupli = 1; //enabling flag when duplicate detected
                last_fac=fac;               
            }
            else
                fac++;
        }
        System.out.println();
        if (dupli==0) //returning no. of prime factos if flag inactive
            return pf_count;
        else //otherwise returning 0
            return 0;
    }
}


/*Description
   
    Type        Name            Description
 
 1. int         n           user input
 
 2. short       pf_count    stores the number of prime factors
 
 3. short       fac         stores current factor for testing
 4. short       last_fac    stores last prime factor for duplicate check
 5. byte        dupli       flag for duplicate check
 
 */