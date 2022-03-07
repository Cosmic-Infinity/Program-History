/*
 * 1. Write a program in java to store 20 numbers in a Single Dimensional Array and print
 * the greatest and the smallest in the given set of numbers
 */

class Max_Min_1
{
    public static void main() {
        //variables
        int a[] = {1,96,3,4,5,6,7,8,9,-8,11,12,13,14,15,100,17,18,19,20};
        int max = a[0];
        int min = max;
        
        //looping through all values to find max, min
        for(int i = 0; i<20; i++){
            if(a[i] > max) //detecting max
            max = a[i];
            if(a[i] < min) //detecting min
            min = a[i];
        }
        //printing result
        System.out.println("Maximum : "+max + "\n"+ "Minimum : "+min);
    }
}

/*Description
   
    Type   Name            Description
 
 1. int     max         to store maximum value
 2. int     min         to store minimum value
 3. int     i           loop variable
 4. int[]   a           to store arrary of numbers 

 
 */