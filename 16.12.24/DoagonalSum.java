/*
11. Aim of the program:  Find sum of each diagonal (left & right) elements separately of a user entered 3 X 3 matrix in Java.
    Input:  Enter 3X3 matrix  
    e.g.    6 7 3
            8 9 2
            1 2 9
    Output: Left=24
            Right=13
 */
import java.util.*;
public class DoagonalSum{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 3x3 Matrix");
        int[][] a = new int[3][3];
        try{
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    a[i][j] = ob.nextInt();
                }
            }
        }catch(Exception e){
            System.out.println("Enter only Integers!");
        }
        int left = 0, right = 0;
        for(int i=0; i<3; i++){
            left += a[i][i];
            right += a[i][2-i];
        }
        System.out.println("Left sum:\t "+left+"\nRight Sum:\t "+right);
    }
}