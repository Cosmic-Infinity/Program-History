/*
35. UNIQUE DIGIT NUMBER
 */

/*
Enter the number you want to check: 544457
544457 is not a unique number.

Enter the number you want to check: 12345
12345 is a unique number.

 */
import java.util.Scanner;
public class UniqueNum_35{
    public static boolean isUnique(int num){
        int digits = countDigits(num);
        int[] arr = new int[digits];
        for(int i=0; i<digits; i++){
            arr[i] = (int)num%10;
            num = num/10;
        }
        for(int i=0; i<digits; i++){
            for(int j=0; j<digits; j++)
                if(i!=j && arr[i]==arr[j])
                    return false;
        }
        return true;
    }

    public static int countDigits(int number){
        return((number+"").length());
    }

    public static void main(String args[]){
        boolean result = false;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        int n = ob.nextInt();
        System.out.println(isUnique(n)?n +" is a unique number.":n+" is not a unique number.");
    }
}