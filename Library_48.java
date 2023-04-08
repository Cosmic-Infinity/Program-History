/*
Title		Author		price in Rs.
ISC Java	APC Publications	123.0

No. of days taken to return the book:	10
Fine charged: 	6.0
Total amount to be paid: 	8.46
*/

import java.util.*;
class Library_48{
    String name, author; double p;
    Library_48(String n, String a, double pr){
        name = n; author = a; p = pr;
    }

    void display(){
        System.out.println("Title" + "\t\t" + "Author" + "\t\t" + "price in Rs.");
        System.out.println(name+"\t" + author + "\t" + p);
        System.out.println();
    }
}