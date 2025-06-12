/*
2. Aim of the program:  Write a program to print the corresponding grade for the given    mark using if..else statement in Java
    Input:  Mention the grade in the program
    Output: Display the Grade either O/E/A/B/C
 */


import java.util.*;
public class Grading{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int marks = 0;
        System.out.println("Enter integer marks: ");
        marks = ob.nextInt();
        System.out.println("\n--------------------------\n");
        if(marks > 100 || marks<0)
            System.out.println("Invalid Input");
        else {
            if(marks>89)
                System.out.println("Grade = O");
            else {
                if(marks>79)
                    System.out.println("Grade = E");
                else {
                    if(marks>69)
                        System.out.println("Grade = A");
                    else {
                        if(marks>59)
                            System.out.println("Grade = B");
                        else {
                            if(marks>49)
                                System.out.println("Grade = C");
                            else {
                                if(marks>39)
                                    System.out.println("Grade = D");
                                else
                                    System.out.println("Grade = F");
                            }
                        }
                    }
                }
            }
        }
    }
}