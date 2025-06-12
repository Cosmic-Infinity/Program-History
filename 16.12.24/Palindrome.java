/*
4. Aim of the program : Program to check a user entered number is palindrome or not 
    Input:  Mention the number in the program
    Output: display the number is Palindrome or not.
 */

import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int rev = 0;
        System.out.println("Enter integer marks: ");
        int n = ob.nextInt();
        System.out.println("\n--------------------------\n");
        for(int i=n; i>0; i=i/10){
            rev = (rev*10)+(i%10);
        }
        System.out.println("Number\t : "+n);
        System.out.println("Reverse\t : "+rev);
        System.out.println(rev == n? "Palindrome":"NOT Palindrome");
    }
}