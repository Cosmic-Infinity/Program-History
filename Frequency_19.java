
/*
Enter a sentence in Lowercase
an apple and an apricot a day is healthy
Number of and = 1
Number of an = 2
 */

import java.util.Scanner;
public class Frequency_19{
    String text;
    int countand,countan,len;
    public Frequency_19(){
        text="";
        countand=0;
        countan=0;
    }

    public void accept(String n){
        text=n;
        if(text.charAt(text.length()-1)!='.')
            text=text+'.';
        len=text.length();
    }

    public void checkandfreq(){
        int pos=0,i=0; 
        for(i=0;i< len;i++){
            char ch=text.charAt(i);
            if(ch==' '||ch=='.'){
                String b=text.substring(pos,i);
                if(b.equals("and")==true){
                    countand++;
                }
                pos=i+1;
            }
        }
    }

    public void checkanfreq(){
        int pos=0,i=0;
        for(i=0;i< len;i++){
            char ch=text.charAt(i);
            if(ch==' '||ch=='.'){
                String  b=text.substring(pos,i);
                if(b.equals("an")==true)
                    countan++;
                pos=i+1;
            }
        }
    }

    public void display(){
        System.out.println("Number of and = "+countand);
        System.out.println("Number of an = "+countan);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence in Lowercase");
        Frequency_19 ob1=new Frequency_19();
        ob1.accept(sc.nextLine());
        ob1.checkandfreq();
        ob1.checkanfreq();
        ob1.display();
    }
}