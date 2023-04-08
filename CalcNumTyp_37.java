/*
37. Given an array of integers and we have to count total negatives, positives and zeros using
java program.
Example:
Input:
Array elements: 20, -10, 15, 00, -85
Output:
Positive Numbers are: 2
Negative Numbers are: 2
Zeros are: 1
 */

/*
How many Number you want to Enter : 6
Enter 6 Numbers : 
1
-5
0
66
11
-25
Positive Numbers are: 3
Negative Numbers are: 2
Zeros are: 1
 */
import java.util.Scanner;
public class CalcNumTyp_37{
    public static void main(String args[]){
        int positive=0, negative=0, zero=0, i;
        Scanner ob = new Scanner(System.in);
        System.out.print("How many Number you want to Enter : ");
        int n = ob.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " +n+ " Numbers : ");
        for(i=0; i<n; i++){
            arr[i] = ob.nextInt();
            if(arr[i] < 0)negative++;
            else if(arr[i] == 0)zero++;
            else positive++;
        }
        System.out.print("Positive Numbers are: " + positive );
        System.out.print("\nNegative Numbers are: " + negative );
        System.out.print("\nZeros are: " + zero );
    }
}