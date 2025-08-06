/*
10. Implement a shape modeling tool using an abstract class `Shape` 
with abstract methods `draw()`, `area()`, and `perimeter()`. 
Subclasses `Triangle`, `Circle`, and `Rectangle` implement the methods.
Use these classes to calculate and compare areas and perimeters based on user-defined dimensions.
*/

class Mains10 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 3);
        circle.draw();
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());
        rectangle.draw();
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
        triangle.draw();
        System.out.println("Area: " + triangle.area());
        System.out.println("Perimeter: " + triangle.perimeter());
    }
}

abstract class Shape {
    abstract void draw();
    abstract float area();
    abstract float perimeter();
}

class Circle extends Shape {
    float radius;
    Circle(float radius) {
        this.radius = radius;
    }

    void draw() {
        System.out.println("Drawing the Circle. Radius: " + radius);
    }

    float area() {
        return (3.14f * radius * radius);
    }

    float perimeter() {
        return (2 * 3.14f * radius);
    }
}

class Rectangle extends Shape {
    float length, breadth;

    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void draw() {
        System.out.println("Drawing a Rectangle. Length: " + length + " and Breadth: " + breadth);
    }

    float area() {
        return (length * breadth);
    }

    float perimeter() {
        return (2 * (length + breadth));
    }
}

class Triangle extends Shape {
    float sideA, sideB, sideC;

    Triangle(float sideA, float sideB, float sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    void draw() {
        System.out.println("Drawing a Triangle. Sides: " + sideA + ", " + sideB + ", " + sideC);
    }

    float area() {
        float s = (sideA + sideB + sideC) / 2;
        return ((float)Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)));
    }

    float perimeter() {
        return (sideA + sideB + sideC);
    }
}
