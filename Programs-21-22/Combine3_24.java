/*24. Write a program to accept any three-letter word and display all the probable three-letter
 * combinations. No letter should be repeated in the output.*/

class Combine3_24
{
    public static void main(String s)
    {
        if(s.length()!=3 ) //input lenght check
            System.out.println("Only 3 letter word allowed.");
        else{
            for(int i = 0; i<3; i++){ //loop for 1st character
                for(int j = 0; j<3; j++){ //loop for 2nd character
                    for(int k = 0; k<3; k++){ //loop for 3rd character
                        if(i!=j && j!=k && k!=i) //permutation logic
                            System.out.println(s.charAt(i)+""+s.charAt(j)+""+s.charAt(k));
                    }
                }
            }
        }
    }
}

/*Description
   
    Type        Name            Description
 
 1. String       s           stores user input
 2. int          i, j, k     loop variables

 */