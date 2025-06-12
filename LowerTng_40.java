/*
40.LOWER TRIANGULAR MATRIX
 */

/*
Enter the number of rows: 
3
Enter the number of columns: 
3
Enter the Matrix Elements: 
1
2
3
4
5
6
7
8
9
Original Matrix is : 
1 2 3 
4 5 6 
7 8 9 
Lower Triangular Matrix is : 
1 0 0 
4 5 0 
7 8 9 
 */
import java.util.*;
public class LowerTng_40{
    public static void printMatrix(int[][] arr){
        int m = arr.length; //For Rows
        int n = arr[0].length; //For columns
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void lowerTngMatrix(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (i < j)arr[i][j] = 0;
            }
        }
        System.out.println( "Lower Triangular Matrix is : ");
        printMatrix(arr);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n=sc.nextInt();
        if (m != n){
            System.out.println("Matrix entered should be a Square Matrix");
            System.exit(0);
        }
        System.out.println("Enter the Matrix Elements: ");
        int arr[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                arr[i][j]=sc.nextInt();
        }
        System.out.println( "Original Matrix is : ");
        printMatrix(arr);
        lowerTngMatrix(arr);
    }
}