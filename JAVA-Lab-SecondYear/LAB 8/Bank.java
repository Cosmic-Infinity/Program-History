/*
1. Create a program that simulates a banking system.
Implement exception handling for cases such as insufficient funds,
invalid account number, and invalid transaction amount.
 */
import java.util.*;

class Bank{
    static int fund;
    static long acno;
    public static void main(String[] args) throws InsufficientFundException {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter account no.");
        int transact;
        try{
            acno = ob.nextLong();        
            System.out.println("Enter deposit amount");
            transact = ob.nextInt();
            fund = transact;
            System.out.println("Enter withdrawal amount");
            transact = ob.nextInt();
            if(transact>fund)
                throw new InsufficientFundException();
        }catch(InputMismatchException e){System.out.println("Invalid Input.");}
        catch(InsufficientFundException e){System.out.println("Insufficient fund in account");}
    }
}
class InsufficientFundException extends Exception{
    InsufficientFundException(){}
}
