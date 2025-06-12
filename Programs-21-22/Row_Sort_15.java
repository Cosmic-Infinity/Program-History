//15. Arrange the number of each row in ascending order and display the result

class Row_Sort_15
{
    public static void main()
    {
        int a[][] = {{4,1,2,3},{5,6,8,7},{10,12,11,9},{15,16,14,13}};

        for(int k = 0; k<4; k++) //looping through rows
        {
            for(int i = 0; i<3; i++) // selection sort algorithm
            {
                for(int j= i+1; j<4; j++) 
                {
                    if(a[k][i] > a[k][j]) { //swapping values
                        int temp = a[k][j];
                        a[k][j] = a[k][i];
                        a[k][i] = temp;
                    }
                }
            }
        }
        //printing result
        for(int i = 0; i<4; i++) {
            for(int j = 0; j<4 ;j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}

/*Description
   
    Type        Name            Description
 
 1. int         temp        temporary variable for swapping values
 2. int         i, j, k     loop variables
 3. int[][]     a           to store 2D arrary of numbers 

 
 */