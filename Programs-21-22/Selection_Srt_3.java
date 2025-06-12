/*
 * 3. Write a program in java to store 10 numbers in a Single Dimensional Array. Arrange
 * these numbers in ascending order by using Selection Sort Technique.
 */

class Selection_Srt_3
{
    public static void main(){

        int a[] = {7,96,3,4,44,6,7,8,9,-8};
        //selection sort algorithm
        for(int i = 0; i<9; i++)
        {
            for(int j= i+1; j<10; j++)
            {
                //swapping value
                if(a[i] > a[j])
                {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        //printing sorted array
        for(int i = 0; i<10; i++){
            System.out.print(a[i] + " ");
        }
    }
}

/*Description
   
    Type   Name            Description
 
 1. int     i, j        loop variables
 2. int     temp        temporary variable for swapping values
 3. int[]   a           to store arrary of numbers 
   
 
 */