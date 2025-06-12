
/*
Enter a word
infinity
vowels = 3
consonants = 5
Original word = INFINITY
Rearranged word = IIINFNTY
 */

import java.util.Scanner;
public class Rearrange_11{
    String wrd,newwrd;
    Scanner sc=new Scanner(System.in);
    Rearrange_11(){
        wrd="";
        newwrd="";
    }

    void readword(){
        System.out.println("Enter a word" );
        wrd=sc.next();
        wrd=wrd.toUpperCase();
    }

    void freq_vow_con(){
        int vowelFrequency=0,consonantFrequency=0;
        for(int i=0;i< wrd.length();i++){
            if("AEIUO".indexOf(wrd.charAt(i))>-1)
                vowelFrequency++;
        }
        consonantFrequency= wrd.length()- vowelFrequency ;
        System.out.println("vowels = "+ vowelFrequency);
        System.out.println("consonants = " + consonantFrequency);
    }

    void arrange(){
        String vowel="",consonants="";
        for(int i=0;i< wrd.length();i++){
            char c = wrd.charAt(i);
            if("AEIUO".indexOf(c)>-1)
                vowel=vowel+c;
            else
                consonants =consonants+c;
        }
        newwrd= vowel+consonants;
    }

    void display(){
        System.out.println("Original word = "+ wrd);
        System.out.println("Rearranged word = "+ newwrd);
    }

    public static void main(String[] args){
        Rearrange_11 ob1=new Rearrange_11();
        ob1.readword();
        ob1.freq_vow_con();
        ob1.arrange();
        ob1.display();
    }
}