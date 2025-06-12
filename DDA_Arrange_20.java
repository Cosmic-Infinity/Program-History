/*20. Write a program to declare a single-dimensional array a[] and a square matrix b[][] of
size N, where N > 2 and N < 10. Allow the user to input positive integers into the single
dimensional array. Perform the following tasks on the matrix:
1. Sort the elements of the single-dimensional array in ascending order using any
standard sorting technique and display the sorted elements.
2. Fill the square matrix b[][] in the following format: If the array a[] = {5, 2, 8, 1} then,
after sorting a[] = {1, 2, 5, 8} Then, the matrix b[][] would fill as below:
1 2 5 8
1 2 5 1
1 2 1 2
1 1 2 5
3. Display the filled matrix in the above format*/

import java.util.Scanner;
class DDA_Arrange_20
{
    static Scanner ob = new Scanner(System.in);
    public static void main(){    

        System.out.println("Enter size (2-10) :");
        int n = valid(ob.nextInt(),2,10); //input with validity check

        int a[] = new int[n];
        int b[][] = new int[n][n];
        //array 'a' input with validity check
        System.out.println("Enter "+n+" positive integers (number > 0)");
        for(int i = 0; i<n; i++)
            a[i] = valid(ob.nextInt(), 0, 2147483647);

        for(int i = 0; i<n-1; i++){ //sorting with selection sort
            for(int j= i+1; j<n; j++){
                if(a[i] > a[j]){
                    int temp = a[j]; //swapping values
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        //System.out.println("Sorted!");

        for(int i = 0; i<n; i++){ //filling array 'b' in defined pattern
            for(int j= 0; j<n-i; j++)
                b[i][j] = a[j];
            int count = 0;
            for(int k= i; k>0; k--)
                b[i][n-k] = a[count++];
        }
        //System.out.println("Arranged!");
        
        System.out.println("Result : ");
        for(int i = 0; i<n; i++){ //printing result
            for(int j = 0; j<n; j++)
                System.out.print(b[i][j] + " ");
            System.out.println();
        }
    }

    private static int valid(int val, int low, int high) {
        //asking user for correct input, until acceptable value is detected
        while(val<low || val>high){
            System.out.println("Not Allowed");
            System.out.println("Enter number between "+low+" and "+high);
            val = ob.nextInt();
        }
        return(val);//returning valid input
    }
}

/*Description
   
    Type        Name            Description
 
 1. int         n           variable for row and column input
 2. int         i, j, k     loop variables
 3. int         temp        temporary variable for swapping value
 4. int[]       a           to store initial array of values
 5. int[][]     b           to store final pattern
 
 6. int         val         receives value for checking
 7. int         low         lower limit of acceptable input
 8. int         high        upper limit of acceptable input

 
 */