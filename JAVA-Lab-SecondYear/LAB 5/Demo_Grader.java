/*
5. Write a class, Grader, which has an instance variable, score, an appropriate constructor
and appropriate methods. A method, letterGrade() that returns the letter grade as
O/E/A/B/C/F.
Now write a demo class to test the Grader class by reading a score from the user, using
it to create a Grader object after validating that the value is not negative and is not
greater then 100. Finally, call the letterGrade() method to get and print the grade.
 */
import java.util.Scanner;
class Demo_Grader{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = ob.nextInt();
        if(score<0 || score>100)
            System.out.println("Invalid Score");
        else{
            Grader gd = new Grader(score);
            System.out.println("Grade is : "+gd.letterGrade());
        }
    }
}

class Grader{
    int score;
    Grader(int sc){score = sc;}

    char letterGrade(){
        char c;
        if(score>89)
            c='O';
        else if(score>79)
            c='E';
        else if(score>69)
            c='A';
        else if(score>59)
            c='B';
        else if(score>49)
            c='C';
        else if(score>39)
            c='D';
        else
            c='F';
        return c;
    }
}
