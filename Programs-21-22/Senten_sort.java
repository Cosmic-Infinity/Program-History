/*
Question 2
Write a program to accept a sentence which may be terminated by either ‘.’ , ‘?’ or ‘!’
only. The words are to be separated by a single blank space and are in lower case.
Perform the following tasks:
(a) Check for the validity of the accepted sentence and for the terminating character.
(b) Arrange the words contained in the sentence according to the size of the words in
order. If two words are of the same length then the first occurring
comes first. The sentence should begin with a capital alphabet in both the cases
i.e. Input and Output.
(c) Display both the sentences separately with each sentence beginning with a capital
alphabet.*/

class Senten_sort{
    public static void main(String s){
        //String s = "i love my country?";
        boolean f = s.endsWith(".") || s.endsWith("?") || s.endsWith("!");//last character check
        System.out.print(!f?"Termination character mismatch\n":"");
        int len = s.length()-1;
        for(int i = 0; i<len; i++){ //looping through all charcaters
            char c = s.charAt(i);
            char c1 = s.charAt(i+1);
            if(c == ' '){
                if( c1 == ' '){ //single space check
                    System.out.println("ONE Space between words allowed");
                    f=false;
                    break;
                }  
            }
            else if(Character.isUpperCase(c)){ //lower case check
                System.out.println("All Characters must be lower case");
                f = false;
                break;
            }
        }

        if(f){ //when sentence valid
            char last = s.charAt(len);
            s=s.substring(0,len).trim()+" ";
            String[] s_array = new String[(s.length()-s.replace(" ","").length())];           
            String word ="";
            short count = 0;  
            len = s.length();
            for(int i = 0;i<len; i++){ //adding word to array
                char c = s.charAt(i);
                if(c==' '){
                    s_array[count++] = word;
                    word="";
                }
                else word=word+c;
            }
            for(int i = 0; i<count-1; i++) //sorting with bubble sort algorithm
            {
                for(int j = 0; j<count-1-i; j++)
                {
                    if(s_array[j+1].length() < s_array[j].length())
                    {
                        String temp = s_array[j+1];
                        s_array[j+1] = s_array[j];
                        s_array[j] = temp;
                    }
                }
            }

            //printing initial sentence with first character uppercased
            s=s.trim()+last;
            System.out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1,len));
            s ="";
            for(int i=0;i<count;i++) //forming re-arranged sentence
                s=s+s_array[i]+" ";
            s=s.trim()+last;
            //printing resultant sentence with first character uppercased
            System.out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1,len));
        }
    }
}

/*Description

Type        Name            Description

1. String      s           user input, later used to store new sentences
2. boolean     f           flag for input validity check
3. int         len         stores input lenght
4. String[]    s_array     array to store the words of the input sentence
5. short       count       stores the number of words in the sentence
6. char        last        stores the sentence termination character
7. String      word        helps with word formation
8. int         i, j        loop variables
9. char        c, c1       stores character for validity test

 */