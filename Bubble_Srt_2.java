/*
 * 2. Write a program in java to store 10 numbers in a Single Dimensional Array. Arrange
 * the numbers in descending order by using Bubble Sort Technique
 */

class Bubble_Srt_2
{
    public static void main(){

        int a[] = {7,3,4,44,6,7,96,8,9,-8};
        
        //bubble sort algorithm
        for(int i = 0; i<10; i++)
        {
            for(int j= 0; j<9-i; j++)
            {
                //swapping values without third variable
                if(a[j+1] > a[j])
                {                   
                    a[j] = a[j+1] + a[j];
                    a[j+1] = a[j] - a[j+1];
                    a[j] = a[j] - a[j+1];
                }
            }
        }
        //printing output
        for(int i = 0; i<10; i++){
            System.out.println(a[i]);
        }
    }
}

/*Description
   
    Type   Name            Description
 
 1. int     i, j        loop variables
 2. int[]   a           to store arrary of numbers 
   
 
 */