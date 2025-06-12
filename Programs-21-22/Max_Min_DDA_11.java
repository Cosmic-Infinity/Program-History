/*11. Write a program in java to store different numbers in 4 x 4 matrix in a Double
 * Dimensional Array. Display the highest and the lowest numbers among the stored
 * numbers in the matrix*/

class Max_Min_DDA_11
{
    public static void main(){

        int a[][] = {{11,2,300,4},{5,6,-7,8},{8,10,110,12},{-13,11,15,16}};
        int max = a[0][0];
        int min = max;
        //looping through all values to find max, min
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                if(a[i][j] > max) //detecting max
                    max = a[i][j];
                if(a[i][j] < min) //detecting min
                    min = a[i][j];
            }
        }
        //printing result
        System.out.println("Maximum : "+max + "\n"+ "Minimum : "+min);
    }
}

/*Description
   
    Type       Name            Description
 
 1. int         max         to store maximum value
 2. int         min         to store minimum value
 3. int         i, j        loop variables
 3. int[][]     a           to store arrary of numbers 

 
 */
