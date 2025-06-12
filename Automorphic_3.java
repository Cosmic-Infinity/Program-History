/* 3. WAP IN JAVA TO PRINT ‘n’ NUMBER OF TERMS OF ‘ AUTOMORPHIC NUMBERS’ AS
ENTERED BY THE USERS AS A RESPONSE TO : “ENTER THE NUMBER OF TERMS OF
AUTOMORPHIC NUMBERS TO BE DISPLAYED.”*/


/*
enter the number of terms
5
automorphic numbers are 
1
5
6
25
76
*/
import java.util.*;
class Automorphic_3{
    public static void main(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n=sc.nextInt();
        System.out.println("automorphic numbers are ");
        for(int i=0, j=1; i<n;j++){
            if(((j*j)+"").endsWith(j+"")){
                System.out.println(j);
                i++;
            }
        }
    }
}
