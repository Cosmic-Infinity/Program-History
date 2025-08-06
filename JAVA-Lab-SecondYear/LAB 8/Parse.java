/*
4. Write a program that parses integers from a user-provided string.
Handle exceptions for invalid input, such as `NumberFormatException`,
and provide meaningful error messages.
 */

import java.util.*;

class Parse{
    String inp="";
    Parse(String s){inp = s;}

    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        String s = ob.nextLine();
        Parse ps = new Parse(s);
        ps.parser();
    }

    void parser(){
        try{      
            int n = Integer.parseInt(inp);
            System.out.println("Number is: "+n);
        }
        catch(NumberFormatException e){
            System.out.println("Input was not a number");
        }
    }
}

