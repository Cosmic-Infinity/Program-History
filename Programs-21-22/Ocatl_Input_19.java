/*19. Write a program to declare a matrix A[][] of order (M x N) where 'M' is the number of
 * rows and 'N' is the number of columns such that the value of 'M' must be greater than 0
 * and less than 10 and the value of 'N' must be greater than 2 and less than 6. Allow the
 * user to input digits (0 - 7) only at each location, such that each row represents an octal number*/

import java.util.Scanner;
class Ocatl_Input_19
{
    static Scanner ob = new Scanner(System.in);
    public static void main(){      
        //row and column input with input validity check
        System.out.println("Enter no. of rows (1-9) :");
        int m = isValid(ob.nextInt(),1,9);
        System.out.println("Enter no. of columns (3-5) :");
        int n = isValid(ob.nextInt(),3,5);

        int a[][] = new int[m][n];
        System.out.println("Enter values (0-7)");
        for(int i = 0; i<m; i++) { //2D array input
            for(int j = 0; j<n; j++)
                a[i][j] = isValid(ob.nextInt(), 0, 7);//validity check
        }

        for(int i = 0; i<m; i++) { //printing result
            for(int j = 0; j<n; j++)
                System.out.print(a[i][j]);
            System.out.println();
        }
    }

    private static int isValid(int val, int low, int high) {
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

1. int         m, n        variables for row and column input
2. int         i, j        loop variables
3. int[][]     a           to store 2D arrary of numbers

4. int         val         receives value for checking
5. int         low         lower limit of acceptable input
6. int         high        upper limit of acceptable input

 */