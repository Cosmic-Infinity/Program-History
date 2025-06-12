/*
36. TRANSPOSE MATRIX
 */

/*
Enter total rows and columns: 
2
2
Enter matrix:
1
 2
 3
 4
 The above matrix before Transpose is 
1 2  
3 4  
The above matrix after Transpose is 
1 3  
2 4  
*/
import java.util.Scanner;
public class MatrixTrnp_36{
    public static void main(String args[]){
        System.out.println("Enter total rows and columns: ");
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int column = s.nextInt();
        int a[][] = new int[row][column];
        System.out.println("Enter matrix:");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++)
                a[i][j] = s.nextInt();
        }
        System.out.println("The above matrix before Transpose is ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++)
                System.out.print(a[i][j]+" ");
            System.out.println(" ");
        }
        System.out.println("The above matrix after Transpose is ");
        for(int i = 0; i < column; i++){
            for(int j = 0; j < row; j++)
                System.out.print(a[j][i]+" ");
            System.out.println(" ");
        }
    }
}