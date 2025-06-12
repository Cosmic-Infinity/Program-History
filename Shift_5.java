/*
 *5. Write a program in java to store 10 numbers in a Single Dimensional Array. Now, shift
 *each array element into the next cell in a cyclic order. Display the array elements after
 *shifting them
 */

class Shift_5
{
    public static void main(){

        int a[] = {1,2,3,4,5,6,7,8,9,10};           
        int temp = a[9];//saving last index value       
        for (int i=9; i>0; i--)//shifting values as required
            a[i] = a[i-1];
        a[0] = temp; //applying last index value to first index position
        for (int i=0; i<10; i++)//printing result
            System.out.println(a[i]);
    }
}

/*Description
   
    Type        Name                Description
 
 1. int         temp                for storing last index value for later use
 2. int         i                   loop variable
 3. int[]       a                   to store arrary of numbers 
   
 
 */