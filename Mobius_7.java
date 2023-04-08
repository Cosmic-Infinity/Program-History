/*7. THE MOBIUS FUNCTION M (N) FOR A NATURAL NUMBER ‘N’ IS DEFINED AS:
M(N)=1: IF N=1
=0: IF ANY PRIME FACTOR OF N IS CONTAINED IN N MORE THAN ONCE
=(-1)p : IF N IS A PRODUCT OF p DISTINCT PRIME FACTORS
WAP TO INPUT A POSITIVE NATURAL NUMBER ‘N’ AND OUTPUT M(N). THE PROGRAM
SHOULD CONTINUE TILL THE USER WANTS.
CHECK YOUR PROGRAM FOR N=78,34,12,17,666,327,29 AND SO ON.
 */

/*
Enter a number
12
Output : 0

Enter a number
78
Output : -1
 */
import java.util.*;
public class Mobius_7{
    public static void main(){
        Scanner in = new Scanner(System.in); 
        int j,p,n,c=0;
        double m=0.0;
        System.out.println("Enter a number");
        n = in.nextInt();
        if(n==1)
            System.out.println("Output : 1");
        else{
            j = 2; p = 0;
            while(j<=n){
                if(n%j==0){
                    c++;
                    n=n/j;
                    p++;
                    if(p>1){
                        m = 0;
                        break;
                    }
                }
                else{
                    j++;
                    p=0;
                }
            }
            if(p<=1){
                m = (Math.pow(-1,c));
                System.out.println("Output : "+(int)m);
            }
            else
                System.out.println("Output : 0");
        }
    }
}
