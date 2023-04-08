/*27. Design a class EqMat_27 to check if two matrices are equal or not. Assume that the two
matrices have the same dimension.*/

/*
ENTER NUMBER OF ROWS OF MATRIX
2
ENTER NUMBER OF COLUMNS OF MATRIX
2
Enter elements for the 1st Matrix
enter4elements
1
2
3
4
Enter elements for the 2nd Matrix
enter4elements
1
2
3
4
Matrix no. 1
1 2 
3 4 
Matrix no. 2
1 2 
3 4 

Matrices are Equal */
import java.util.Scanner;
public class EqMat_27{
    int a[][];
    int m;
    int n;
    Scanner sc=new Scanner(System.in) ;
    EqMat_27(int mm,int nn){
        m=mm ;
        n=nn;
        a=new int[m][n];
    }

    void readarray(){
        System.out.println("enter " + (m*n) + " elements" );
        for (int i=0;i< m;i++){
            for (int j=0 ;j< n ;j++)
                a[i][j]=sc.nextInt();
        }
    }

    int check(EqMat_27 P,EqMat_27 Q){
        for (int i=0;i< P.m;i++){
            for (int j=0 ;j < P.n ;j++)
                if (P.a[i][j]!=Q. a[i][j])
                    return 0;
        }
        return 1;
    }

    void print(){
        for (int i=0;i< m;i++){
            for (int j=0 ;j < n ;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS OF MATRIX");
        int row=sc1.nextInt();
        System.out.println("ENTER NUMBER OF COLUMNS OF MATRIX");
        int col=sc1.nextInt();
        EqMat_27 ob1=new EqMat_27(row,col) ;
        EqMat_27 ob2=new EqMat_27(row,col) ;
        System.out.println("Enter elements for the 1st Matrix");
        ob1.readarray();
        System.out.println("Enter elements for the 2nd Matrix");
        ob2.readarray();
        System.out.println("Matrix no. 1");
        ob1.print();
        System.out.println("Matrix no. 2");
        ob2.print();
        System.out.println(ob1.check(ob1,ob2)==1?"EQUAL":"NOT EQUAL");
    }
}