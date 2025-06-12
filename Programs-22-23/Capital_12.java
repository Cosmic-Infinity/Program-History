/*
Enter the sentence
he Is a Good Boy
Sentence = he Is a Good Boy 
Words with first letter capital =3   
*/

import java.util.Scanner;
public class Capital_12{
    String sent;
    int freq;
    Capital_12(){
        sent=""; freq = 0;
    }

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        sent=sc.nextLine()+" ";
    }

    boolean isCap(String w){
        if (Character.isUpperCase(w.charAt(0))==true)
            return true;
        else
            return false;
    }

    void display(){
        System.out.println("Sentence = " +sent);
        String b[] = sent.split("");
        for(int i=0;i<b.length;i++){
            if(isCap(b[i]))
                freq++;
        }
        System.out.println("Words with first letter capital ="+freq) ;
    }

    public static void main(String args[]){
        Capital_12 ob1=new Capital_12();
        ob1.input();
        ob1.display() ;
    }
}