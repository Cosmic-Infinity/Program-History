/*
9. GIVEN THE POSITIVE INTEGERS p AND q WHERE p<q . WAP IN JAVA DETERMINE HOW
MANY KAPREKAR NUMBERS ARE THERE IN THE RANGE BETWEEN p AND q(Both inclusive)
AND OUTPUT THEM.
THE INPUT CONTAINS TWO POSITIVE INTEGERS p AND q. ASSUME p<5000 AND q<5000.YOU
ARE TO OUTPUT THE NUMBER OF KAPREKAR NUMBERS IN THE SPECIFIED RANGE ALONG
WITH THEIR VALUES IN THE FORMAT SPECIFIED BELOW.
THE FOLLOWING STEPS CAN BE USED TO CHECK WHETHER   
 */

/*
Enter first integer
5
Enter second integer
1000
Kaprekar numbers between 5 and 1000 are:
9
45
55
99
297
703
999
Frequency of Kaprekar ruumbers 7
*/
import java.util.*;
public class kaprekar_9{
    public static void main(){
        Scanner sc= new Scanner (System.in);
        int i,p,q,n,n1,n2,num1,d,d1,p1,k,w,m,r,c=0;
        System.out.println("Enter first integer");
        p=sc.nextInt();
        System .out .println("Enter second integer");
        q=sc.nextInt();
        System.out.println("Kaprekar numbers between "+p+" and "+q+" are:");
        for(n=p;n<=q;n++){
            k=0;m=0; r = 0; n1 = 0; n2=0; p1 = 0;
            num1 = n*n;
            w=n*n;
            while(w!=0){
                d=w% 10;
                k++;
                w = w/10;
            }
            if(k%2==0)
                p1 = k/2;
            else
                p1 =k/2+1;
            for(i=1;i<=k;i++)
            {
                if(i<=p1){
                    d = num1 % 10;
                    n1= n1 + (int)(d* (Math.pow(10, m)));
                    num1 = num1/10;
                    m++;
                }
                else{
                    d1 = num1 % 10;
                    n2=n2+(int)(d1*(Math.pow(10, r)));
                    num1 = num1/10;
                    r++;
                }
            }
            if(n1+n2==n){
                System.out.println(n);
                c++;
            }
        }
        System.out.println("Frequency of Kaprekar ruumbers " + c);
    }
}
