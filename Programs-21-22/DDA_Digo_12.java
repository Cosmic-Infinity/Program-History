/*12. Write a program in java to store the numbers in 4 x 4 matrix in Double Dimensional
 * Array. Display the sum of: (i) left diagonal elements (ii) right diagonal elements (iii)
 * difference between the sum of left and right diagonal elements.*/

class DDA_Digo_12
{
    public static void main(){

        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int lds = 0, rds = 0;

        for(int i = 0; i<4; i++){ //looping through rows
            lds+= a[i][i]; //left diagonal values
            rds+= a[i][3-i]; //right diagonal values
        }
        
        System.out.println("Left digonal sum : "+lds); //result of left digonal
        System.out.println("Right digonal sum : "+rds); //result of left digonal
        System.out.println("Difference of sum : "+Math.abs(lds-rds)); //difference of left & right digonal
    }
}

/*Description
   
    Type        Name            Description
 
 1. int         lds         sum of left diagonal values
 2. int         min         sum of right diagonal values
 3. int         i           loop variable
 4. int[][]     a           to store 2D arrary of numbers 

 
 */