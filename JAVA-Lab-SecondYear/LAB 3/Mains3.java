/*
3.
Write a program to create an Account class containing 
acc_no
balance as data members 
and disp() to display the details. 

Inherit it in Person class with all mentioned data members and functions. 
Person class also has name and aadhar_no as extra data members of its own. 
Override disp() function. Create 5 persons‟ details.    
 */

class Mains3{
    public static void main(String[] args){
        Person p1 = new Person("Ram", 12345, 99999, 100);
        Person p2 = new Person("Mohan", 23456, 88888, 200);
        Person p3 = new Person("Sohan", 34567, 77777, 300);
        Person p4 = new Person("Shyama", 45678, 66666, 400);
        Person p5 = new Person("Ranni", 56789, 55555, 500);
        p1.display();
        
        p2.display();
        p3.display();
        p4.display();
        p5.display();
    }
}

class Person extends Account{
    String name;
    long aadhar_no;
    Person(String n, long ad, long ac, long bl){
        super(ac, bl);
        name = n;
        aadhar_no = ad;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Aadhar no. : "+aadhar_no);
        System.out.println("Account no. : "+acc_no);
        System.out.println("Balance : Rs."+bal);
        System.out.println("-------------------------------------");
    }
}
class Account{
    long acc_no;
    long bal;
    Account(long ac, long bl){
        acc_no = ac;
        bal = bl;
    }

    void display(){
        System.out.println("Account no. : "+acc_no);
        System.out.println("Balance : "+bal);
    }
}