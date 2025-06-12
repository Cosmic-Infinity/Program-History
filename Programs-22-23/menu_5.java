/*
5. WRITE A MENU DRIVEN PROGRAM TO PERFORM THE GIVEN TASK AS PER THE USER’S
CHOICE:
(i) TO ACCEPT A BINARY NUMBER (BASE 2) AND CONVERT IT INTO ITS DECIMAL
EQUIVALENT (BASE 10)
(ii) TO INPUT A DECIMAL NUMBER (BASE 10) AND CONVERT IT INTO ITS BINARY
EQUIVALENT
 */

/*
 Enter 1 to convert binary to decimal
Enter 2 to convert decimal to binary
Enter your choice
1
enter  the binary number 
11011
the decimal equivlent =27

Enter 1 to convert binary to decimal
Enter 2 to convert decimal to binary
Enter your choice
2
enter the number 
57
binary equivalent=111001 
 */
import java.util.*;
public class menu_5
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        int ch;
        System.out.println("Enter 1 to convert binary to decimal");
        System.out.println("Enter 2 to convert decimal to binary");
        System.out.println("Enter your choice");
        ch=sc.nextInt();
        switch(ch){
            case 1:
                int c=0,n;
                double d=0,r;
                System.out.println("enter  the binary number ");
                n=sc.nextInt();
                while(n!=0){
                    r=n%10;
                    d=d+r*Math.pow(2,c);
                    n=n/10;
                    c=c+1;
                }
                System.out.println("the decimal equivlent ="+(int)d);
                break;
            case 2:
                int r1;
                String st=" ";
                System.out.println("enter the number ");
                n=sc.nextInt();
                while (n!=0){
                    r1=n%2;
                    st=Integer.toString(r1)+st;
                    n=n/2;
                }
                System.out.println("binary equivalent="+st);
                break;
            default:
                System.out.println("IT IS A WRONG CHOICE");
        }
    }
}
