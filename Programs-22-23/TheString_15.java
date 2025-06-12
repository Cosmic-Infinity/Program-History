/*
ENTER A SENTENCE WITH CHARACTER NOT MORE THAN 100
Cheetah is the fastest land animal
Number of words=6
Number of consonants=18

 */

import java.util.Scanner;
public class TheString_15{
    String str;
    int len,wordcount,cons;
    TheString_15(){
        str="";
        wordcount=0;
        cons=0;
    }

    TheString_15(String ds){
        str=ds+" ";
        len=str.length();
        cons=0;
        wordcount=0;
    }

    void countFreq(){
        str=str.toLowerCase();
        for(int i=0;i< len;i++){
            char ch=str.charAt(i);
            if(ch==' ')
                wordcount++;
            else{
                if("aeiou".indexOf(ch)==-1)
                    cons++;
            }
        }
    }

    void Display(){
        System.out.println("Number of words="+wordcount);
        System.out.println("Number of consonants="+cons);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A SENTENCE WITH CHARACTER NOT MORE THAN 100");
        TheString_15 ob1=new TheString_15(sc.nextLine());
        ob1.countFreq();
        ob1.Display();
    }
}