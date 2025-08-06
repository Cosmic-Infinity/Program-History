/*
10.
Implement a class Triangle with data members a,b,c as it's sides. and methods
set_Din(): to initialize a,b,c
boolean is_Triangle(): to check if the sides form a triangle or not
float find_area(): only invoked if is_Triangle() is true, otherwise appropriate message;
float find_perimeter(): only invoked if is_Triangle() is true, otherwise appropriate message;
void show(): to display sides, ara, and perimeter

Write down the application Triangle_Demo where the functionality of the triangle class is Tested
 */
import java.util.*;
class Triangle_Demo{
    public static void main(String[] args){
        Triangle tr = new Triangle();
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter first side: ");
        float a = ob.nextFloat();
        System.out.println("Enter second side: ");
        float b = ob.nextFloat();
        System.out.println("Enter third side: ");
        float c = ob.nextFloat();
        tr.set_Dim(a,b,c);
        tr.show();
    }
}

class Triangle{
    float a,b,c;
    void set_Dim(float a, float b, float c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    boolean is_Triangle(){
        boolean f = false;
        float max = Math.max(a,Math.max(b,c));
        if(max == a)
            f = (b+c) > a;
        else if (max == b)
            f = (a+c) > b;
        else if(max == c)
            f = (a+b) > c;
        return f;
    }

    float find_area(){
        if(is_Triangle()){
            float s = (a+b+c)/2;
            float area = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
            return (area);
        }
        else{
            System.out.println("The given sides do not form a triangle.");
            return 0;
        }
    }

    float find_perimeter(){
        if(is_Triangle()){
            return (a+b+c);
        }
        else{
            System.out.println("The given sides do not form a triangle.");
            return 0;
        }
    }

    void show(){
        float area;
        float perim = find_perimeter();
        System.out.println("First side: "+a);
        System.out.println("Second side: "+b);
        System.out.println("Third side: "+c);
        System.out.println("Area: "+find_area());
        System.out.println("Perimeter: "+find_perimeter());
    }
}