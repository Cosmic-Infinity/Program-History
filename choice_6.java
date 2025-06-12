/*6. WRITE A MENU DRIVEN PROGRAM TO PERFORM THE GIVEN TASK AS PER THE USER’S
CHOICE:
(i) TO ENTER A NUMBER CONTAINING THREE DIGITS OR MORE. Arrange digits in ascending order
(ii) A NUMBER IS SAID TO BE ‘MAGIC NUMBER’, IF EVENTUAL SUM OF THE DIGITS OF THE
NUMBER IS EQUAL TO 1, OTHERWISE NOT. ENTER A NUMBER AND CHECK WHETHER IT IS A
MAGIC NUMBER OR NOT.*/

/*
Enter 1 to arrange the digits in ascending order 
Enter 2 to check if a number is Magic or not
Enter your choice
1
Enter a number
102239105
The digits of the number in ascending order:
0,0,1,1,2,2,3,5,9,

Enter 1 to arrange the digits in ascending order 
Enter 2 to check if a number is Magic or not
Enter your choice
2
Enter a number
343
Magic Number   
*/
import java.util.*;
public class choice_6
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        int i,j,p,r,ch,n;
        System.out.println("Enter 1 to arrange the digits in ascending order "); 
        System.out.println("Enter 2 to check if a number is Magic or not");
        System.out.println("Enter your choice");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter a number");
                n=sc.nextInt();
                System.out.println("The digits of the number in ascending order:");
                for(i=0;i<10;i++){
                    p=n;
                    while(p!=0){
                        r=p % 10;
                        if(r==i)
                            System.out.print(r+",");
                        p=p/10;
                    }
                }
                System.out.println();
                break;

            case 2:
                int a, b, c, s;
                System.out.println("Enter a number");
                n=sc.nextInt();
                s=n;
                while(s>9){
                    n =s;s=0;
                    while(n > 0){               
                        a = n/10;
                        b = a*10;
                        c = n-b;
                        s=s+c;
                        n = a;
                    }
                }
                System.out.println(s==1?"Magic Number":"Not a magic number");
                break;
            default :
                System.out.println("Wrong Choice!!");
        }
    }
}
