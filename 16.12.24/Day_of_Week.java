/*
3. Aim of the program:   Write a program to print the week day for the given day no. of the    current month using switch case statement
    Input:  Mention the Day no in the program
    Output: Display the week day(either Sunday/Monday/Tuesday/Wednesday /Thursday/Friday/Saturday)
 */

import java.util.*;
public class Day_of_Week{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int day = 0;
        System.out.println("Assumed current month of December. ");
        System.out.println("Assumed day 1 of December as Sunday ");
        System.out.println("Day no: ");
        day = ob.nextInt();
        System.out.println("\n--------------------------\n");
        switch(day%8){
            case 1: System.out.println("Sunday");
                break;
            case 2: System.out.println("Monday");
                break;
            case 3: System.out.println("Tuesesday");
                break;
            case 4: System.out.println("Wednesday");
                break;
            case 5: System.out.println("Thursday");
                break;
            case 6: System.out.println("Friday");
                break;
            case 7: System.out.println("Saturday");
                break;
            default: System.out.println("Invalid Day no.");
        }
    }
}