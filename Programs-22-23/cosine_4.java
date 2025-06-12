/*
4. WAP IN JAVA TO COMPUTE THE SUM OF COSINE SERIES WHERE n IS THE NUMBER OF
TERMS AND x IS THE ANGLE IN DEGREE.
 */

/*
enter the value of n
8
enter the value of x
45
THE VALUE OF COSINE SERIES =0.5704086824070307
*/
import java.util.*;
public class cosine_4{
    public static void main(){
        int i,j,f,n;
        double x,a=0, s=0,s1=0,s2=0;
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the value of n");
        n=sc.nextInt();
        System.out.println("enter the value of x");
        x= sc.nextInt();
        x=(22.0/(7.0*180))*x;
        for(i=2;i<=n;i=i+4){
            f=1;
            for(j=1;j<=i;j++){
                f=f*j;
                s1=s1+(double)(Math.pow(x,i)/f);
            }
        }
        for(i=4;i<=n;i=i+4){
            f=1;
            for(j=1;j<=i;j++){
                f=f*j;
                s2=s2+(double)(Math.pow(x,i)/f);
            }
        }
        s=1+(s2-s1);
        System.out.println("THE VALUE OF COSINE SERIES ="+s);
    }
}
