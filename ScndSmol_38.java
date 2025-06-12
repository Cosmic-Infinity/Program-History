/*
38. Given an array of N integers and we have to find its second minimum/smallest element
using Java program.
Example:
Input:
Enter number of elements: 4
Input elements: 45, 25, 69, 40
Output:
Second smallest element in: 40
 */

/*
Enter number of elements : 6
Enter the elements in array : 
6
-5
22
-200
1
0
The Smallest element in the array is :-5
*/
import java.util.Scanner;
public class ScndSmol_38 {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = ob.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in array : ");
        for (int i = 0; i < n; i++) 
            a[i] = ob.nextInt();
        int min = a[0], min2 =min;
        for (int i = 0; i < n; i++) {
            if(min>a[i]){
                min2=min;
                min=a[i];
            }
        }
        System.out.println("The second smallest element is :" + min2);
    }
}