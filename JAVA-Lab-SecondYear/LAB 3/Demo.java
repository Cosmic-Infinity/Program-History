/*
6.
Aim of the program :
Write a class file – box with three data members(length, width, height)    
and a method volume().
Also implement the application class Demo where an object of the box class is created 
with user entered dimensions and volume is printed.

Input:      length,width and height.
Output:     Volume 
*/

import java.util.Scanner;
class Demo{
    public static void main(String[] args){
        float l, b, h;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Length : ");
        l = ob.nextFloat();
        System.out.println("Enter Width : ");
        b = ob.nextFloat();
        System.out.println("Enter Height : ");
        h = ob.nextFloat();
        Box1 b1 = new Box1(l, b, h);
        System.out.println("Volume is : "+b1.volume());
    }
}

class Box1{
    float length, width, height;
    Box1(float l, float w, float h){
        length = l;
        width = w;
        height = h;
    }
    float volume(){return length*width*height;}
}

