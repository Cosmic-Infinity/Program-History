//14. Replace each element of the left diagonal with zero

class Lft_Digonal0_14
{
    public static void main()
    {
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for(int i = 0; i<4; i++) //looping through rows   
            a[i][i] = 0; //setting left digonal value to 0
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
 
 1. int[][]     a           to store 2D arrary of numbers 
 2. int         i, j        loop variables
 
 */