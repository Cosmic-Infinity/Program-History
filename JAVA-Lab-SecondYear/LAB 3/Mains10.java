/*
10. 
Aim of the program :  Write a program which will overload the area () method 
and display the area of a circle, triangle and square as per user choice 
and user entered dimensions. 

Input:  Mention dimensions like radius, base, height, side
Output:    Display area of circle/Display area of triangle/Display area of square
 */

import java.util.Scanner;
class Mains10{
    public static void main(String[]args){
        Scanner ob = new Scanner(System.in);
        Area ar = new Area();
        System.out.println("Enter choice: 1(Circle), 2(Triangle), 3(Square)");
        int c = ob.nextInt();
        float r, b, h, s;
        switch(c){
            case 1:
                System.out.println("Enter radius: ");
                r = ob.nextFloat();
                ar.area(r);
                break;
            case 2:
                System.out.println("Enter base and height: ");
                b = ob.nextFloat();
                h = ob.nextFloat();
                ar.area(b,h);
                break;
            case 3:
                System.out.println("Enter square: ");
                s = ob.nextFloat();
                ar.area(1, s);
                break;
            default: System.out.println("INVALID Choice");
        }
    }
}

class Area{
    void area(float r){
        System.out.println("Area: "+(2*3.14*r));
    }

    void area(float b, float h){
        System.out.println("Area: "+(0.5*b*h));
    }

    void area(int n, float s){
        System.out.println("Area: "+(s*s));
    }
}