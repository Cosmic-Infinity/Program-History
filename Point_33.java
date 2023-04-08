/*
33. The coordinates of a Point_33 P on a two dimensional plane can be represented by P(x,y)
with x as the x-coordinate and y as the y-coordinate.The coordinates of midPoint of two
Point_33s P1(x1,yI) and P2(x2,y2) can be calculated as P(x,y) where:
x=(xl+x2)/2,y=(y1+y2)/2
 */

/*
enter x
25
enter y
65
enter x
4
enter y
45
25.0
65.0
4.0
45.0
14.5
55.0
 */
import java.util.Scanner;
public class Point_33{
    double x,y;
    Scanner sc = new Scanner(System.in);
    public Point_33(){
        x=0.0;
        y=0.0;
    }

    public void readPoint(){
        System.out.println("enter x");
        x=sc.nextDouble();
        System.out.println("enter y");
        y=sc.nextDouble();
    }

    public void displayPoint(){
        System.out.println(x);
        System.out.println(y);
    }

    public Point_33 midPoint(Point_33 A,Point_33 B){
        Point_33 C=new Point_33();
        C.x=(A.x+B.x)/2;
        C.y =(A.y+B.y)/2;
        return C;
    }

    public static void main(String[] args){
        Point_33 p=new Point_33();
        Point_33 q=new Point_33();
        Point_33 r=new Point_33();
        p.readPoint();
        q.readPoint();
        r=r.midPoint(p,q);
        p.displayPoint();
        q.displayPoint();
        r.displayPoint();
    }
}