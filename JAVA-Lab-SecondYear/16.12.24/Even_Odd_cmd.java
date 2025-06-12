/*
7. Aim of the program : Accept 10 numbers from command line and check how many of them are even and how many are odd.
    Input: Enter 10 number from keyboard
    Output:     Display number of even and odd number
 */
import java.util.*;
public class Even_Odd_cmd{
    public static void main(String[] args){
        int even = 0, odd = 0;
        int[] a = new int[10];
        try{
            if(args.length!=10){
                System.out.println("Enter 10 numbers");
                return;
            }
            for(int i=0; i<10; i++){
                a[i] = Integer.parseInt(args[i]);
                if(a[i]%2==0) even++;
                else odd++;
            }
        }catch(Exception e){
            System.out.println("Enter only integers");
            return;
        }
        System.out.println("Even numbers: \t"+even);
        System.out.println("Odd numbers: \t"+odd);
    }
}