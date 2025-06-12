/*
5. Aim of the program :  Write
a program in Java to take first name and last name from user and print
both in one line as last name followed by first name
    Input:      Enter first name: KIIT
                Enter Second Name: UNIVERSITY
    Output:     UNIVERSITY KIIT
*/


import java.util.*;
public class Name{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String first = ob.nextLine();
        System.out.println("Enter last name: ");
        String last = ob.nextLine();
        System.out.println("\n--------------------------\n");
        System.out.println(last+" "+first);
    }
}
