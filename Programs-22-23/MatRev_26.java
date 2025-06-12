/*26. Design a class MatRev_26 to reverse each element of a matrix.*/

/*
ENTER NUMBER OF ROWS OF MATRIX
2
ENTER NUMBER OF COLUMNS OF MATRIX
3
ENTER ELEMENTS IN ARRAY
44
87
12
14
3
21
Original Array
44    87    12    
14    3    21    
Reverse array
44    78    21    
41    3    12
 */
import java.util.Scanner;
public class MatRev_26{
    int arr[][],m,n;
    Scanner sc=new Scanner(System.in);
    MatRev_26(int mm,int nn){
        m=mm;
        n=nn;
        arr=new int[m][n];
    }

    void fillarray(){
        System.out.println("ENTER ELEMENTS IN ARRAY");
        for(int i=0;i< m;i++){
            for(int j=0 ;j< n;j++)
                arr[i][j]=sc.nextInt();
        }
    }

    int reverse(int x){
        int rev=0, rem=0;
        while(x!=0){
            rem=x% 10;
            rev=rev*10 + rem;
            x=x/ 10;
        }
        return rev;
    }

    void revMat(MatRev_26 P){
        for(int i=0;i< m;i++){
            for(int j=0 ;j< n;j++)
                arr[i][j]=reverse(P.arr[i][j]);
        }
    }

    void show(){
        for(int i=0;i< m;i++){
            for(int j=0 ;j< n;j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS OF MATRIX");
        int row=sc1.nextInt();
        System.out.println("ENTER NUMBER OF COLUMNS OF MATRIX");
        int col=sc1.nextInt();
        MatRev_26 ob1 = new MatRev_26(row,col);
        MatRev_26 ob2=new MatRev_26(row,col);
        ob1.fillarray();
        System.out.println("Original Array");
        ob1.show();
        ob2.revMat(ob1);
        System.out.println(" Reverse array");
        ob2.show();
    }
}