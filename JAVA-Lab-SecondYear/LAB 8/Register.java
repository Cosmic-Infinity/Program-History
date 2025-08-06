/*
2. Write a program that simulates a registration system
where a user inputs their personal details (name, email, phone number, etc.).
Implement exception handling for cases such as invalid email format,
missing fields, and incorrect phone number format.
 */
import java.util.*;

class Register{
    static String name, email;
    static long phone;
    public static void main(String[] args) throws InvalidEmailException, InvalidPhoneException, InvalidNameException {
        Scanner ob = new Scanner(System.in);

        try{
            System.out.println("Enter name.");
            name = ob.nextLine();
            if(name.length()<3)
                throw new InvalidNameException();
            System.out.println("Enter email.");
            email = ob.nextLine();
            if(email.indexOf('@')==-1 || email.indexOf('.')==-1)
                throw new InvalidEmailException();
            System.out.println("Enter phone no.");
            phone = ob.nextLong();
            if((phone+"").length()!=10)
                throw new InvalidPhoneException();

        }
        catch(InputMismatchException e){System.out.println("Invalid Input.");}
        catch(InvalidEmailException e){System.out.println("Invalid Email");}
        catch(InvalidPhoneException e){System.out.println("Invalid phone no.");}
        catch(InvalidNameException e){System.out.println("Invalid name.");}
    }
}

class InvalidEmailException extends Exception{
    InvalidEmailException(){}
}
class InvalidPhoneException extends Exception{
    InvalidPhoneException(){}
}
class InvalidNameException extends Exception{
    InvalidNameException(){}
}
