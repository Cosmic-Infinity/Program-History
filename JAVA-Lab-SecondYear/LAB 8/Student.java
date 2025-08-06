/*
3. Design a `Student` class with a method that calculates the grade point average (GPA) of a student.
Implement exception handling for cases where the input grades are invalid or out of range.
 */

import java.util.*;

class Student{
    public static void main(String[] args) throws InvalidMarksException, InvalidGradeException {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter marks or grade of student");
        String inp="";
        try{
            inp = ob.nextLine();        
            int marks = Integer.parseInt(inp);
            if(marks<1 || marks>100)
                throw new InvalidMarksException();
            else
                System.out.println("Marks of Student is: "+marks);
        }
        catch(InvalidMarksException e){System.out.println("Invalid Marks");}
        catch(NumberFormatException e){
            try{
                if(inp.length()!=1 || "OEABCDEFoeabcdef".indexOf(inp)==-1)
                    throw new InvalidGradeException();
                else
                    System.out.println("Grade of Student is: "+inp.toUpperCase());
            }
            catch(InvalidGradeException f){System.out.println("Invaid Grade");}
        }

    }
}

class InvalidMarksException extends Exception{
    InvalidMarksException(){}
}
class InvalidGradeException extends Exception{
    InvalidGradeException(){}
}
