/*
8. Aim of the program:  Program to sort the user entered list of numbers of any size
    Input:  List of Numbers
    Output: Display the numbers in Ascending order
 */

import java.util.*;
public class Sort_cmd{
    public static void main(String[] args){
        int even = 0, odd = 0, len = 0;
        len = args.length;
        int[] a = new int[len];
        try{
            for(int i=0; i<len; i++){
                a[i] = Integer.parseInt(args[i]);
            }
        }catch(Exception e){
            System.out.println("Enter only integers");
            return;
        }
        for(int i=0; i<len; i++){
            for(int j=0; j<len;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorted numbers: \n");
        for(int i=0; i<len; i++){
            System.out.print(a[i]+", ");
        }
        System.out.println();
    }
}