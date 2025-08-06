/*
11. Aim of the program : Write a program in java using constructor overloading concept
to calculate the area of a rectangle having data member as length and breadth.
Use default constructor to initialize the value of the data member to zero
and parameterized constructor to initialize the value of data member according to the user input.

Input: Mention the value of length and breadth
Output: Display the area of rectangle accordingly.
 */
import java.util.Scanner;
class Mains11{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        float l, b;
        System.out.println("Length? : ");
        l = ob.nextFloat();
        System.out.println("Breadth? : ");
        b = ob.nextFloat();
        Rect rt = new Rect(l,b);
        System.out.println("Area: "+rt.area());
    }
}

class Rect{
    float l, b;
    Rect(){l = 0; b=0;}

    Rect(float len, float bre){
        l = len; b = bre;
    }

    float area(){return (l*b);}
}