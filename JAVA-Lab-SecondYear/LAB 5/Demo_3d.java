/*
6a. Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and
Cone from it. The class ThreeDObject has methods wholeSurfaceArea ( ) and volume (
). Override these two methods in each of the derived classes to calculate the volume
and whole surface area of each type of three-dimensional objects. The dimensions of
the objects are to be taken from the users and passed through the respective
constructors of each derived class. Write a main method to test these classes.
 */

class Demo_3d{
    public static void main(String[] args){
        Box bx = new Box(2,3,4);
        Cube cb = new Cube(5);
        Cylinder cl = new Cylinder(2, 10);
        Cone cn = new Cone(5, 10);
        System.out.println("Surface area of Box: "+bx.wholeSurfaceArea());
        System.out.println("Volume of Box: "+bx.volume());
        System.out.println("Surface area of Cube: "+cb.wholeSurfaceArea());
        System.out.println("Volume of Cube: "+cb.volume());
        System.out.println("Surface area of Cylinder: "+cl.wholeSurfaceArea());
        System.out.println("Volume of Cyliner :"+cl.volume());
        System.out.println("Surface area of Cone: "+cn.wholeSurfaceArea());
        System.out.println("Volume of Cone: "+cn.volume());
    }
}

class ThreeDObject{
    final float pi=3.14f;
    float wholeSurfaceArea (){return 0f;}

    float volume (){return 0f;}
}

class Box extends ThreeDObject{
    float l, b, h;
    Box(float l, float b, float h){
        this.l=l;this.b=b;this.h=h;
    }

    float wholeSurfaceArea (){return (2*(l*b+b*h+h*l));}

    float volume (){return (l*b*h);}
}
class Cube extends ThreeDObject{
    float l;
    Cube(float l){this.l=l;}

    float wholeSurfaceArea (){return (6*l*l);}

    float volume (){return (l*l*l);}
}

class Cylinder extends ThreeDObject{
    float r, h;
    Cylinder(float r, float h){this.r=r;this.h=h;}

    float wholeSurfaceArea (){return (2*pi*r*h)+2*(pi*r*r);}

    float volume (){return (pi*r*r*h);}
}

class Cone extends ThreeDObject{
    float r, l, h;
    Cone(float r, float h){
        this.r=r; this.h=h;
        l=(float)Math.sqrt(r*r+h*h);
    }
    float wholeSurfaceArea (){return (pi*r*(r+l));}

    float volume (){return ((1f/3)*pi*r*r*h);}
}