/*
9. Aim of the program:  Program to find no. of objects created out of a class using ‘static’ modifier.
    Input:   No of objects created
    Output: Display the number of objects created (e.g. no of objects=3)
 */

import java.util.*;
public class Object_count{
    static int count = 0;
    Object_count(){
        count++;
    }

    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        while(true){
            System.out.println("Create object? (y/n)");
            String response = ob.nextLine();
            if(response.equalsIgnoreCase("y"))
                new Object_count();
            else
                break;
        }
        System.out.println("Program terminated.");
        System.out.println("No. of Objects Created = "+count);
    }
}