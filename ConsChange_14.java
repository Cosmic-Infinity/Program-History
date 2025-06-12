/*
Enter word in Lowercase
gamer
Originalword=gamer
Sorted Word=gmrae
Changed word=GMRae
*/

import java.util.Scanner;
public class ConsChange_14{
    String word;
    int len;
    Scanner sc=new Scanner(System.in);
    ConsChange_14(){
        len=0;
        word="";
    }

    void readword(){
        System.out.println("Enter word in Lowercase");
        word=sc.next();
        len=word.length();
    }

    void shiftcons(){
        String consonants="",vowels="",sortedWord="";
        for(int i=0;i< len;i++){
            char ch=word.charAt(i);
            if("aeiou".indexOf(word.charAt(ch))>-1)
                vowels+=ch;
            else
                consonants+=ch;
        }
        sortedWord=consonants+vowels;
        System.out.println("Sorted Word="+sortedWord);
        word=sortedWord;
    }

    void changeword(){
        String newWd="";
        for(int i=0;i< len;i++){
            char ch=word.charAt(i);
            if("aeiou".indexOf(word.charAt(i))==-1)
                newWd+=Character.toUpperCase(ch);
            else
                newWd+=ch;
        }
        System.out.println("Changed word="+newWd);
    }

    void show(){
        System.out.println("Originalword="+word);
        shiftcons();
        changeword();
    }

    public static void main(String[] args){
        ConsChange_14 ob1=new ConsChange_14();
        ob1.readword();
        ob1.show();
    }
}