/*31. A class Matrix_31 contains a two dimensional integer array of order [m x n].The maximum
value possible for both ‘m’ and ‘n’ is 25 . Design a class Matrix_31 to find the difference of the
two matrices . The details of the members of the class are given below
 */

/*
Size of array:
2
2
ENTER ELEMENTS IN Matrix_31 P
1
2
3
4
ENTER ELEMENTS IN Matrix_31 Q
1
2
3
4
Matrix_31 P - Matrix_31 Q

0    0    
0    0    
*/
import java.util.Scanner;
public class Matrix_31{
    Scanner sc=new Scanner(System.in);
    int arr[][];
    int m,n;
    Matrix_31(int mm,int nn){
        m=mm;
        n=nn;
        arr=new int[m][n];
    }

    void fillarray(){
        for(int i=0;i< m;i++){
            for(int j=0;j< n;j++)
                arr[i][j]=sc.nextInt();
        }
    }

    Matrix_31 SubMat(Matrix_31 A)
    {
        Matrix_31 B=new Matrix_31(m,n);
        for(int i=0;i< m;i++){
            for(int j=0;j< n;j++)
                B.arr[i][j]=A.arr[i][j]-arr[i][j] ;
        }
        return B;
    }

    void display(){
        for(int i=0;i< m;i++){
            System.out.println();
            for(int j=0;j< n;j++)
                System.out.print(arr[i][j]+"\t");
        }
    }

    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Size of array:");
        int x=sc1.nextInt();
        int y=sc1.nextInt();
        if(x>25 ||y>25)
            System.out.println("Invalid Size" );
        else{
            Matrix_31 P=new Matrix_31(x,y);
            Matrix_31 Q=new Matrix_31(x,y);
            Matrix_31 R=new Matrix_31(x,y);
            System.out.println("ENTER ELEMENTS IN Matrix P");
            P.fillarray();
            System.out.println("ENTER ELEMENTS IN Matrix Q");
            Q.fillarray();
            System.out.println("Matrix_31 P - Matrix_31 Q");
            R=Q.SubMat(P);
            R.display();
        }
    }
}