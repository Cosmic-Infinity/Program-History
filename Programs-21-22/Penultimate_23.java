/*23. Write a program to find the penultimate word of a sentence. The penultimate word is
 * the second last word present in a given sentence*/ 
 
 //"Computer Science is the text book for the plus two students.

class Penultimate_23
{
    public static void main(String s)
    {   
        System.out.println(s.substring(s.lastIndexOf(' ',s.lastIndexOf(' ')-1)+1, s.lastIndexOf(' ')));
    }
}

/*Description
   
    Type        Name            Description
 
 1. String       s           stores user input

 */