/*
1. Create a dynamic banking system where the superclass `Account` has a method `calculateInterest()`. 
Subclasses `SavingsAccount` and `FixedDepositAccount` override this method with different interest calculation logic. 
Use a superclass reference to handle multiple account types dynamically and calculate the interest for various accounts using user input. 
 */
import java.util.Scanner;
class Mains1{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter account type: 1(Normal), 2(Savigs), 3(Fixed)");
        byte n = ob.nextByte();
        System.out.println("Enter principal: ");
        float sum = ob.nextFloat();

        switch(n){
            case 1:
                Account normal = new Account();
                System.out.println("Normal amount = "+(sum+sum*normal.calculateInterest()));
                break;
            case 2:
                Account saving = new SavingsAccount();
                System.out.println("Savings amount = "+(sum+sum*saving.calculateInterest()));
                break;
            case 3:
                Account fixed = new FixedDepositAccount();
                System.out.println("Fixed amount = "+(sum+sum*fixed.calculateInterest()));
                break;
            default:
                System.out.println("Invalid account type");
        }
    }
}
class Account{
    float interest=5f;
    float calculateInterest(){
        return((interest+.5f)/100);
    }
}
class SavingsAccount extends Account{
    float interest=6f;
    float calculateInterest(){
        return((interest+.6f)/100);
    }
}
class FixedDepositAccount extends Account{
    float interest=7f;
    float calculateInterest(){
        return((interest+.7f)/100);
    }
}

