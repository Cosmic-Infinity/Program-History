/*
5. Create a simple calculator program that performs basic arithmetic operations
(addition, subtraction, multiplication, division).
Implement exception handling for divide-by-zero and invalid inputs.
 */

import java.util.*;
class Calculator{
    public static void main(String[] args){
        int a, b, op;
        Scanner ob= new Scanner(System.in);
        try{
            System.out.println("Enter a: ");
            a = ob.nextInt();
            System.out.println("Enter b: ");
            b = ob.nextInt();
            System.out.println("Enter operation: 1(+), 2(-), 3(*), 4(/)");
            op = ob.nextInt();
            switch(op){
                case 1:System.out.println("a+b = "+(a+b));break;
                case 2:System.out.println("a-b = "+(a-b));break;
                case 3:System.out.println("a*b = "+(a*b));break;
                case 4:System.out.println("a/b = "+(a/b));break;
                default: System.out.println("Invalid operation");
            }
        }
        catch(ArithmeticException e){
            if (e.getMessage().equals("/ by zero")) {
                System.out.println("You are tyring to Divide by zero");
            }
        }
        catch(InputMismatchException e){System.out.println("Invalid input. Enter only integers.");}
    }
}