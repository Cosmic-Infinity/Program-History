/*
39. Given number of rows and cols of a matrix and we have to fill it with the prime numbers
using java program. (start from 1).
 */

/*
Enter the number of rows : 3
Enter the number of columns : 4
The Final Array is : 
2    3    5    7    
11    13    17    19    
23    29    31    37    
 */
import java.util.Scanner;
public class PrimeMtx_39{
    boolean isPrime(int n){
        int c = 0;
        for(int i = 2; i<n; i++){
            if(n%i == 0)
                c++;
        }
        return c == 0;
    }

    public static void main(String args[]){
        PrimeMtx_39 ob = new PrimeMtx_39();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m= sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int n= sc.nextInt();
        int A[][]=new int[m][n];
        int B[] = new int [m*n];
        int i = 0, j, k = 1;
        while(i < m*n){
            if(ob.isPrime(k)==true){
                B[i] = k;
                i++;
            }
            k++;
        }
        int x = 0;
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                A[i][j] = B[x];
                x++;
            }
        }
        System.out.println("The Final Array is : ");
        for(i=0; i<m; i++){
            for(j=0; j<n; j++)
                System.out.print(A[i][j]+"\t");
            System.out.println();
        }
    }
}