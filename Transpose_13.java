//13. Transpose the matrix.
class Transpose_13
{
    public static void main()
    {
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int b[][] = new int[4][4];
        
        for(int i = 0; i<4; i++) //looping through all values
        {
            for(int j = 0; j<4; j++){
                b[i][j] = a[j][i]; //transposing values
            }
        }
        //printing result
        for(int i = 0; i<4; i++)
        {
            for(int j = 0; j<4 ;j++)
                System.out.print(b[i][j] + " ");
            System.out.println();
        }
    }
}


/*Description
   
    Type        Name            Description
 
 1. int[][]     a           initial 2D arrary to store numbers
 2. int[][]     b           resultant 2D array to store transposed values
 3. int         i, j        loop variables
 
 */