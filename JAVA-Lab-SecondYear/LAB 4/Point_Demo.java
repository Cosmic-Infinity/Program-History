/*
12.
Implement Point class for 3D point (x,y,z). Include appropriate constructors
Point(), Point(int, int, int) and Point(Point). Include the methods:

float find_distance(): distance from origin (0,0,0)
float find_distace(int x1, int y1, int z1): distance between (x,y,z) and (x1,y1,z1)
float find_distance(Point p1): distance between two points
boolean is_Equal(Point p1): equality between two points
void show(): shows the description about the point object.

Write down the application class Point_Demo to test the functionality.
 */
import java.util.*;
class Point_Demo{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter points: ");
        int x = ob.nextInt();
        int y = ob.nextInt();
        int z = ob.nextInt();
        Point pt = new Point(x,y,z);
        System.out.println("Distance from origin: "+pt.find_distance());
        System.out.println("Distance from (5,5,5): "+pt.find_distance(5,5,5));
        Point pt1 = new Point(4,5,6);
        System.out.println("Distance from (4,5,6): "+pt.find_distance(pt1));
        System.out.println("Equality test with itself: "+pt.is_Equal(pt));
    }
}

class Point{
    int x,y,z;
    Point(){
        x=y=z=0;
    }

    Point(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    Point(Point ob){
        x=ob.x;
        y=ob.y;
        z=ob.z;
    }

    float find_distance(){
        return (float)Math.sqrt(x*x + y*y + z*z);
    }

    float find_distance(int x1, int y1, int z1){
        return (float)Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1) + (z-z1)*(z-z1));
    }

    float find_distance(Point p1){
        int x1 = p1.x;
        int y1 = p1.y;
        int z1 = p1.z;
        return(find_distance(x1,y1,z1));
    }

    boolean is_Equal(Point p1){
        if(x==p1.x && y==p1.y && z==p1.z)
            return true;
        else
            return false;
    }
}