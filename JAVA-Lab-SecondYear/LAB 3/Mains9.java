/*
9. Aim of the program : 
Write a program to overload subtract method with various parameters in a class in Java. 
Write the driver class to use the different subtract methods using object.

Input:  Mention various subtract method having different parameters.
Output: Subtract method will display the result accordingly
 */

class Mains9{
    public static void main(){
        Sub ob = new Sub();
        ob.subtract(5,4);
        ob.subtract(5f,4f);
        ob.subtract(5.0,4.0);
    }
}

class Sub{
    void subtract(int a, int b){
        System.out.println("Integer subtraction: "+(a-b));
    }

    void subtract(float a, float b){
        System.out.println("Float subtraction: "+(a-b));
    }

    void subtract(double a, double b){
        System.out.println("Double subtraction: "+(a-b));
    }
}