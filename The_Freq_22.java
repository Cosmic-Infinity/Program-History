/*22. Write a program to find the frequency of a word “the” present in a String. Input:
 * Computer Science is the text book for the plus two students. Output: Frequency of ‘the’ = 2*/

class The_Freq_22
{
    public static void main(String s){    
        System.out.println((s.length() - (s.replace(" the ", "  ")).length())/3);
    }
}

/*Description
   
    Type        Name            Description
 
 1. String       s           stores user input

 */