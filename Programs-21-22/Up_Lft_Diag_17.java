//17. Display only the elements available above the left diagonal of the matrix


class Up_Lft_Diag_17
{
    public static void main()
    {
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        
        for(int i = 0; i<4; i++) //looping through all values
        {
            for(int j = 0; j<4 ;j++) {
                if(j>i) //printing only values above left diagonal
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*Description
   
    Type        Name            Description
 
 1. int         i, j        loop variables
 2. int[][]     a           to store 2D arrary of numbers 

 
 */