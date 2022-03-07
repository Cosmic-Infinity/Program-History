/*21.Write a program in java to accept a word and display the word in Piglatin Form. A
 * word is said to be Piglatin by framing a new word with the first vowel present along
 * with the remaining letters. The letters present before the first vowel are shifted towards
 * the end followed by ‘ay’. Ex.- Input: trouble Output: oubletray*/

class Piglatin_21
{
    public static void main(String s){  
        for(int i = 0; i<s.length(); i++){ //looping through all characters
            char c= s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){ //finding vowel
                s = s.substring(i, s.length()) + s.substring(0, i) + "ay";
                break; //performing piglatin operation
            }
        }
        System.out.println(s); //result
    }
}



/*Description
   
    Type        Name            Description
 
 1. String      s           to store user input
 2. int         i           loop variable
 3. char        c           stores characters for testing
 
 */