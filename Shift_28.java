/*
28. Design the class Shift_28 to shuffle the matrix ( i.e. the first row becomes the last , the
second row becomes the first and so on). The details of the members of the class is given
below:
 */

/*
ENTER THE NUMBER OF ROWS
2
ENTER THE NUMBER OF COLUMNS
3
Enter elements of array
1
2
3
4
5
6
Original Matrix
1 2 3 
4 5 6 

Shift_28ed Matrix
4 5 6 
1 2 3 
*/
import java.util.Scanner;
public class Shift_28{
    Scanner sc=new Scanner(System.in);
    int mat[][];
    int m,n;
    Shift_28(int mm,int nn){
        m=mm;
        n=nn;
        mat=new int[m][n];
    }

    void input(){
        System.out.println("Enter elements of array");
        for(int i=0;i< m;i++){
            for(int j=0;j< n;j++)
                mat[i][j]=sc.nextInt();
        }
    }

    void display(){
        for(int i=0;i< m;i++){
            for(int j=0;j< n;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
    }

    void cyclic(Shift_28 P){
        for(int i=0;i< m;i++){
            for(int j=0;j< n;j++){
                if(i==0)
                    mat[m-1][j]=P.mat[0][j];
                else
                    mat[i-1][j]=P.mat[i][j];
            }
        }
    }

    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS");
        int r=sc1.nextInt();
        System.out.println("ENTER THE NUMBER OF COLUMNS");
        int c=sc1.nextInt();
        Shift_28 ob1=new Shift_28(r,c);
        Shift_28 ob2=new Shift_28(r,c);
        ob1.input();
        ob2.cyclic(ob1);
        System.out.println("Original Matrix");
        ob1.display();
        System.out.println("");
        System.out.println("Shifted Matrix");
        ob2.display();
    }
}