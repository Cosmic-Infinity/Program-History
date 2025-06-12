/*
Enter a sentencethey like playing basketball
Input:they like playing basketball 
Output: yhet eikl glayinp lasketbalb 
 */

import java.util.Scanner;
public class Exchange_17{
    String sent,rev;
    int size;
    Exchange_17(){
        sent="";
        rev="";
        size=0;
    }

    void readsentence(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence");
        sent=sc.nextLine()+" ";
        size=sent.length();
    }

    void exfirstlast(){
        String wd="";
        for(int i=0;i< size;i++){
            char ch=sent.charAt(i);
            if(ch==' '||ch=='.'){
                if(wd.length()>1){
                    rev=rev + wd.charAt(wd.length()-1);
                    rev=rev + wd.substring(1,wd.length()-1);
                    rev=rev + wd.charAt(0);
                    rev=rev+ch;
                }
                else
                    rev=rev+wd+ch;
                wd="";
            }
            else
                wd=wd+ch;
        }
    }

    void display(){
        System.out.println("Input:"+sent);
        System.out.println("Output: "+rev);
    }

    public static void main(String args[]){
        Exchange_17 obj1=new Exchange_17();
        obj1.readsentence();
        obj1.exfirstlast();
        obj1.display();
    }
}