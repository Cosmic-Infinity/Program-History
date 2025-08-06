/*
6. Write a program in Java to define a
class Rectangle having data member: length and breadth; to calculate the
area and perimeter of the rectangle. Use constructor to read, and
member functions to calculate and display. 
 */

import java.util.Scanner;
class Mains6{
    public static void main(String[] args){
        Rectangle rt = new Rectangle();
        rt.calculate();
    }
}

class Rectangle{
    float length, breadth;
    Rectangle(){
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