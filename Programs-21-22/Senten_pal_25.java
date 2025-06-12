/*25. Write a program to accept a sentence which may be terminated by either ‘.’, ‘?’ or ‘!’ only.
 * The words are to be separated by a single blank space and are in uppercase.
 * Perform the following tasks:
 * (a) Check for the validity of the accepted sentence.
 * (b) Convert the non-palindrome words of the sentence into palindrome words by
 * concatenating the word by its reverse (excluding the last character). Example: The
 * reverse of the word HELP would be LEH (omitting the last alphabet) and by
 * concatenating both, the new palindrome word is HELPLEH. Thus, the word HELP
 * becomes HELPLEH. Note: The words which end with repeated alphabets, for example
 * ABB would become ABBA and not ABBBA and XAZZZ becomes XAZZZAX.
 * [Palindrome word: Spells same from either side. Example: DAD, MADAM etc.]
 * (c) Display the original sentence along with the converted sentence. Test your program
 * for the following data and some random data:
 * Example - INPUT: THE BIRD IS FLYING.
 * OUTPUT: THE BIRD IS FLYING.
 * THEHT BIRDRIB ISI FLYINGNIYLF*/

import java.util.Scanner;
public class Senten_pal_25
{
    public static void main(String s){   
        //String s = "THE ABAAZZZ DAD BIRD IS FLYING.";
        boolean f = s.endsWith(".") || s.endsWith("?") || s.endsWith("!"); //last character vaidity check
        System.out.println(!f?"Must end in . or ? or !":"");
        int len = s.length()-1;
        for(int i = 0; i<len; i++)
        {
            char c = s.charAt(i);
            char c1 = s.charAt(i+1);
            if(c == ' '){ //single space validity check
                if( c1 == ' '){
                    System.out.println("ONE Space between words allowed");
                    f=false;
                    break;
                }
            }
            else if(!(Character.isUpperCase(c))){ //case validity check
                System.out.println("All Characters must be UPPERCASE");
                f = false;
                break;
            }
        }

        if(f) //if valid
        {
            System.out.println("Sentence is valid");
            String word="";
            String s2="";
            char last = s.charAt(len);
            s=s.substring(0,len)+" ";
            len+=1;
            for(int i = 0; i<len; i++){//loop through characters
                char c = s.charAt(i);
                if(c == ' ')
                {
                    s2 = s2 + palindrome(word) + " "; //returns palindrome word
                    word="";
                }
                else 
                    word = word+c; //forming output sentence
            }
            System.out.println(s.trim()+last); //initial input
            System.out.println(s2.trim()+last); //result
        }
    }

    private static String palindrome(String s){
        String pal = "";
        int len = s.length();
        for(int i = 0; i < len; i++)//reversing the word
            pal = s.charAt(i)+pal;

        if(s.compareTo(pal) == 0) //return from here if word was initially palindrome
            return(s);
        else {
            for(int i = 0; i < len-1;){//eliminating repeated words from beginning
                char c = pal.charAt(i);
                char c1 = pal.charAt(i+1);            
                if(c==c1)
                    i++;
                else  {
                    pal=pal.substring(i+1);
                    break;
                }
            }
            return(s+pal); //returning a palindrome word for the corresponding input
        }
    }
}

/*Description

Type        Name            Description

1. String      s           user input
2. boolean     f           flag for input validity check
3. int         len         stores lenght of the string
4. int         i           loop variable
5. char        c, c1       stores two consecutive characters for testing
6. String      word        stores word for palindrome test
7. String      s2          stores resultant sentence
8. char        last        stores last character

9. String      pal         stores palindrome of the current word

 */