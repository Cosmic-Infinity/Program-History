/*
Enter a string
Elephants are big, but blue whales are even bigger.
Original Sentence: Elephants are big, blue whales are even bigger.
Frequency of word beginning with a Vowel 4
*/
import java.util.*;
public class VowelWord_18{
    String str;
    int freq;
    VowelWord_18(){
        str="";
        freq=0;
    }

    public void readstr(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        str=sc.nextLine();
    }

    public void freq_vowel(){
        str=" "+str;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                ch=str.charAt(i+1);
                if("AEIOUaeiou".indexOf(ch)>-1)
                    freq++;
            }
        }
    }

    void display(){
        System.out.println("Original Sentence: "+str.trim());
        System.out.println("Frequency of word beginning with a Vowel "+freq);
    }

    public static void main(String[] args){
        VowelWord_18 ob1=new VowelWord_18();
        ob1.readstr();
        ob1.freq_vowel();
        ob1.display();
    }
}