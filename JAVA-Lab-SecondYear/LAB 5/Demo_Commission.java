/*
6. Write a class, Commission, which has an instance variable, sales; an appropriate
constructor; and a method, commission() that returns the commission.
Now write a demo class to test the Commission class by reading a sale from the user,
using it to create a Commission object after validating that the value is not negative.
Finally, call the commission() method to get and print the commission. If the sales are
negative, your demo should print the message “Invalid Input”.
*/

import java.util.Scanner;
class Demo_Commission{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter sales: ");
        int sales = ob.nextInt();
        if(sales<0)
            System.out.println("Invalid Input");
        else{
            Commission cm = new Commission(sales);
            System.out.println("Commission is : "+cm.commission());
        }
    }
}

class  Commission{
    int sales;
    Commission(int sl){sales = sl;}

    float commission(){
        return (0.15f*sales);
    }
}