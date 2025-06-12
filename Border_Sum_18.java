//18. Sum of border elements of the matrix

class Border_Sum_18
{
    public static void main(){

        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int sum=0;

        for(int i = 0; i<4; i++) { //looping through all values
            for(int j = 0; j<4; j++) {
                if (i==0 || i==3 || j==0 || j==3) //check if on border
                    sum=sum + a[i][j]; //sum
            }
        }
        //result
        System.out.println("Sum of border elements : "+sum);
    }
}

/*Description
   
    Type        Name            Description
 
 1. int         sum         to store the sum of border elements
 2. int         i, j        loop variables
 3. int[][]     a           to store 2D arrary of numbers 

 
 */