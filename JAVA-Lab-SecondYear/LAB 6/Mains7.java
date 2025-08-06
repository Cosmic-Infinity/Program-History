/*
   7. Create a hierarchy where the superclass `Account` has a method `getAccountDetails()` 
   returning an `Account` object.
   Override this method in subclasses `SavingsAccount` and `CurrentAccount`
   to return their respective types.
   Demonstrate covariant return types by creating and invoking these objects dynamically.
*/

class Mains7{
    public static void main(String[] args){
        Account account = new Account();
        SavingsAccount savings = new SavingsAccount();
        CurrentAccount current = new CurrentAccount();

        System.out.println(account.getAccountDetails().s);
        System.out.println(savings.getAccountDetails().s);
        System.out.println(current.getAccountDetails().s); 
    }
}

class Account{
    String s = "Account class";
    Account getAccountDetails(){
        return this;
    }
}
class SavingsAccount extends Account{
    String s = "SavingsAccount class";
    SavingsAccount getAccountDetails(){
        return this;
    }
}
class CurrentAccount extends Account{
    String s = "CurrentAccount class";
    CurrentAccount getAccountDetails(){
        return this;
    }
}