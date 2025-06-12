/*
 * 6. Write a program in java to store 10 numbers each, in two different Single Dimensional Arrays.
 * Now, shift the elements in ‘Z’ form such that n[0] is shifted in m[0] and m[0]
 * in n[1], n[1] in m[1] and so on ...... . display the array elements after shifting them
 */

class ShiftZ_6
{
    public static void main(){

        int n[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int m[] = {11,22,33,44,55,66,77,88,99,19};
        //saving specific values for later use
        int temp = m[9];
        int temp1 = n[0];
        for (int i=9; i>0; i--)//shifting values
        {
            m[i] = n[i];
            n[i] = m[i-1];  
        }
        //applying saved values to required positions
        n[0] = temp;
        m[0] = temp1;
        //printing arrays
        for (int i=0; i<10; i++)
            System.out.print(n[i] + ",");
        System.out.println();
        for (int i=0; i<10; i++)
            System.out.print(m[i] + ", ");
            
        //19,11,22,33,44,55,66,77,88,99,
        //1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
    }
}

/*Description
   
    Type        Name                Description
 
 1. int         temp, temp1         for storing specific values for later use
 2. int         i                   loop variable
 3. int[]       m, n                to store arrary of numbers 
   
 
 */