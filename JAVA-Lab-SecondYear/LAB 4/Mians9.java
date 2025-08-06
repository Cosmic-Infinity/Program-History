/*
9. A plastic manufacturer sells plastic in different shapes like 2D sheet
and 3D box. The cost of sheet is Rs 40/ per square ft. and the cost of
box is Rs 60/ per cubic ft. Implement it in Java to calculate the cost
of plastic as per the dimensions given by the user where 3D inherits from 2D. 
 */
import java.util.Scanner;

class Mians9{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter dimensions : ");
        Box buy = new Box(ob.nextInt(), ob.nextInt(), ob.nextInt());
        buy.calculate();
    }
}

class Sheet{
    int l, b; float cost = 40;
    Sheet(int l, int b){
        this.l = l;
        this.b = b;
    }

    void calculate(){
        System.out.println("Cost of sheet = " + (l*b*cost));
    }
}

class Box extends Sheet{
    int h; float cost = 60;
    Box(int l, int b, int h){
        super(l, b);
        this.h = h;
    }

    void calculate(){
        if(l==0 || b==0 || h==0){
            if(l==0)
                l=h;
            else if(b==0)
                b=h;
            super.calculate();
        }        
        else
            System.out.println("Cost of boxes = " + (l*b*h*cost));
    }
}

