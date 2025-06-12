//16. Interchange the elements of first row with fourth row.

class Interchange_16
{
    public static void main()
    {
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        
        for(int i = 0; i<4; i++){//looping through columns
            int temp = a[0][i];//swapping values from individual columns of the rows 1 & 4
            a[0][i] = a[3][i];
            a[3][i] = temp;
        }
        //printing result
        for(int i = 0; i<4; i++)
        {
            for(int j = 0; j<4 ;j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}

/*Description
   
    Type        Name            Description
 
 1. int         temp        temporary variable to swap values
 2. int         i, j        loop variables
 3. int[][]     a           to store 2D arrary of numbers 

 
 */