/*
32. A class Combine contains an array of integers which combines two arrays into a single
array including the duplicate elements if any and sorts the Combined array.
 */

/*
Enter size of first array
4

Enter 4 elements
1
2
3
4

 Enter size of Second array
6

Enter 6 elements
9
8
7
6
5
4
Array 1:
1 2 3 4 
Array 2:
9 8 7 6 5 4 
Combine Array:
1 2 3 4 4 5 6 7 8 9 
*/
import java.util.Scanner;
public class Combine_32{
    int com[],size;
    Scanner sc=new Scanner(System.in);
    Combine_32(int nn){
        size=nn;
        com=new int[size];
    }

    void inputarray(){
        System.out.println("\nEnter "+size+" elements");
        for(int i=0;i< size;i++)
            com[i]=sc.nextInt();
    }

    void sort(){
        for(int i=0;i< size;i++){
            for(int j=i;j< size;j++){
                if(com[j]< com[i]){
                    int t=com[j];
                    com[j]=com[i];
                    com[i]=t;
                }
            }
        }
    }

    void mix(Combine_32 A,Combine_32 B){
        int x=0,y=0,z=0;
        while(x< A.size)
            com[z++]=A.com[x++];
        while(y< B.size)
            com[z++]=B.com[y++];
    }

    void display(){
        for(int i=0;i< size;i++)
            System.out.print(com[i]+" ");
    }

    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter size of first array");
        int a=sc1.nextInt();
        Combine_32 P=new Combine_32(a);
        P.inputarray();
        System.out.println("\n Enter size of Second array");
        int b=sc1.nextInt();
        Combine_32 Q=new Combine_32(b);
        Q.inputarray();
        Combine_32 R=new Combine_32(a+b);
        R.mix(P,Q);
        R.sort();
        System.out.println("Array 1:");
        P.display();
        System.out.println();
        System.out.println("Array 2:");
        Q.display();
        System.out.println();
        System.out.println("Combine Array:");
        R.display();
    }
}