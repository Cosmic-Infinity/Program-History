/*
 * 1. Aim of the program -Write a program to print your name, roll no, section and branch in separate lines.
Input:      Mention Name,Roll no,Section and branch
Output: Display Name
        Display Roll No
        Display Section
        Display Branch
 */


import java.util.*;
public class Student{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        String[] stuff= new String[4];
        System.out.println("Enter name: ");
        stuff[0] = ob.nextLine();
        System.out.println("Enter roll no.: ");
        stuff[1] = ob.nextLine();
        System.out.println("Enter section: ");
        stuff[2] = ob.nextLine();
        System.out.println("Enter branch: ");
        stuff[3] = ob.nextLine();
        System.out.println("\n--------------------------\n");
        System.out.println("Student details: ");
        System.out.println("Name: "+stuff[0]);
        System.out.println("Roll no.: "+stuff[1]);
        System.out.println("Section: "+stuff[2]);
        System.out.println("Branch: "+stuff[3]);
    }
}