/*33. A class Mix has been defined to mix two words, character by character, in the following manner:
The first character of the first word is followed by the first character of the
second word and so on. If the words are of different length, the remaining characters of
the longer word are put at the end.
    Example: If the First word is “JUMP” and the second word is “STROLL”, then the required word will be “JSUTMRPOLL”
Some of the members of the class are given below:
    Classname : Mix
    Data member/instance variable:
        wrd : to store a word
        len : to store the length of the word
    Member functions/methods:
        Mix( ) : default constructor to initialize the data members with legal initial values
        void feedword( ) : to accept the word in UPPER case
        void mix_word( Mix P, Mix Q ) : mixes the words of objects P and Q as stated above and stores 
        the resultant word in the current object
        void display( ) : displays the word*/
        
import java.util.Scanner;        
class Mix
{
    String word;
    int len;
    Mix(){ //initialising
        word = "";
        len = 0;
    }

    void feedword( ){
        Scanner ob = new Scanner(System.in);
        word = ob.nextLine().toUpperCase(); //user input in uppercase
        len = word.length();
    }

    void mix_word( Mix P, Mix Q ){ //received two instances of Mix()
        for(int i = 0; i<P.len || i<Q.len ; i++) //looping through characters
        {
            if(i<P.len)
                word = word + P.word.charAt(i); //storing new characters in current instance
            if(i<Q.len)
                word = word + Q.word.charAt(i); //storing new characters in current instance
        }
        display();//calling display
    }

    void display( ){
        System.out.println("Mixed: "+word);//result
    }

    public static void main(){
        Mix mx1 = new Mix();
        Mix mx2 = new Mix();
        mx1.feedword();//input 1st word in instance mx1
        mx2.feedword();//input 2nd word in instance mx2
        new Mix().mix_word(mx1,mx2);//sending the words to a temporary istance
    }
}

/*Description
   
    Type        Name            Description
 
 1. String       word       stores the word
 2. int          len        stores the length of the word
 
 3. int          i          loop variable
 
 */