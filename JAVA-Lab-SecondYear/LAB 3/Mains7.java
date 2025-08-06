/*
7.  Aim of the program :
Write a program in Java to create a class Rectangle having data members    
length and breadth 
and three methods called read(), calculate() and display()
to read the values of length and breadth,  
calculate the area and perimeter of the rectangle 
and display the result respectively.

Create a class named 'Rectangle' with two data members 'length' and 'breadth' 
and two methods to print the area and perimeter of the rectangle respectively.
Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle.

Input:   Mention length and breadth 
Output: Display Area of Rectangle and Perimeter of rectangle.
 */

import java.util.Scanner;
class Mains7{
    public static void main(String[] args){
        Rectangle rt = new Rectangle(5,4);
        rt.calculate();
        rt.read();
        rt.calculate();
    }
}

class Rectangle{
    float length, breadth;
    Rectangle(float l, float b){
        length = l;
        breadth = b;
    }

    void read(){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = ob.nextFloat();
        System.out.println("Enter breadth: ");
        breadth = ob.nextFloat();
    }

    void calculate(){
        float a = length*breadth;
        float p = 2*(length+breadth);
        display(a,p);
    }

    void display(float a, float p){
        System.out.println("Area = "+a);
        System.out.println("Perimeter = "+p);
    }
}