/*
34. Eliminate the Duplicate numbers from a given set of numbers
 */

/*
ENTER 10 NUMBERS IN THE ARRAY
1
2
6
5
5
7
4
9
3
1
The result after removing the Duplicate_34 records:
1 2 6 5 7 4 9 3 
*/
import java.util.Scanner;
public class Duplicate_34{
    public static void main(String[] args){
        int a[] = new int[10];
        int b[] = new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 10 NUMBERS IN THE ARRAY");
        for(int i=0;i< 10;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(a[i] == a[j])
                    a[j] = 0;
            }
        }
        int j=0;
        for(int i=0;i<10;i++){
            if(a[i]!= 0){
                b[j] = a[i];
                j++;
            }
        }
        System.out.println("The result after removing the Duplicate records:");
        for(int i = 0; i<j; i++)
            System.out.print(b[i] + " ");
    }
}