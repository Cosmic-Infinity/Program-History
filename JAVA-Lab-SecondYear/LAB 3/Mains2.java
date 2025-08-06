/*
2.
Write a program in java to define a class Shape 
which has data member "area" 
and a member function showArea(). 

Derive two classes Circle and Rectangle from Shape class. 
Add appropriate data members and member functions to calculate and display the area of Circle and Rectangle. 
 */

class Mains2{
    public static void main(String[] args){
        Circle cr = new Circle(5);
        Rectangle rct = new Rectangle(5,2);
        cr.showArea();
        rct.showArea();
    }
}

class Shape{
    double area;
    public void showArea(){
        System.out.println("Area of the shape is :"+area);
    }
}

class Circle extends Shape{
    float r;
    Circle(float rad){
        r = rad;
    }

    public void showArea(){
        super.area = 2 * 3.14 * r;
        super.showArea();
    }
}

class Rectangle extends Shape{
    float l, b;
    Rectangle(float len, float bre){
        l = len;
        b = bre;
    }

    public void showArea(){
        super.area = l*b;
        super.showArea();
    }
}