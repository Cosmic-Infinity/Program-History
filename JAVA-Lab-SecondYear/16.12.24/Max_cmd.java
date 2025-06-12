/*
6. Aim of the program :  Find the largest among 3 user entered nos. at the command prompt using Java
    Input: Enter three number .
    Output: Display the Largest Number

 */
import java.util.*;
public class Max_cmd{
    public static void main(String[] args){
        int max = 0;
        try{
            if(args.length!=3){
                System.out.println("Enter 3 integers");
                return;
            }
            int n1=Integer.parseInt(args[0]);
            int n2=Integer.parseInt(args[1]);
            int n3=Integer.parseInt(args[2]);
            max = Math.max(n1, Math.max(n2,n3));
        }catch(Exception e){
            System.out.println("Enter only integers");
            return;
        }
        System.out.println("Maximum number: "+max);
    }
}