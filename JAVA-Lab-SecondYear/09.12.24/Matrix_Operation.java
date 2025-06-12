import java.util.*;
public class Matrix_Operation{     
    public static void main(){
        int a[][] = new int[4][4];
        int b[][] = new int[a.length][a[0].length];
        System.out.println("Enter "+a.length+"x"+a[0].length+" size matrix");
        boolean sparse = read_and_sparse(a); //read a matrix and check if sparse
        System.out.println("Read matrix :");
        display(a);
        System.out.println(sparse?"\nMatrix is SPARSE":"\nNOT Sparse");
        System.out.println("\nTransposed matrix :");
        transpose(a, b); //transpose a matrix
        display(b);
    }

    private static boolean read_and_sparse(int a[][]){
        int count = 0;
        Scanner ob= new Scanner(System.in);
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length;j++){
                a[i][j] = ob.nextInt();
                if(a[i][j] == 0)
                    count++;
            }
        }
        return(count>= 0.5*(a.length*a[0].length));
    }

    private static void transpose(int[][]a, int[][]b){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length;j++)
                b[i][j] = a[j][i];
        }
    }

    private static void display(int a[][]){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }
}