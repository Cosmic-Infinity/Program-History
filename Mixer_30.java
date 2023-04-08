/*
30. A class Mixer_30 has been defined to merge two sorted integer arrays in ascending order
 */
/*
ENTER SIZE OF FIRST ARRAY
5
Enter 5 elements in ascending order
1
2
3
4
5
ENTER SIZE OF SECOND ARRAY
3
Enter 3 elements in ascending order
6
7
8
1 2 3 4 5 6 7 8
*/
import java.util.Scanner;
public class Mixer_30{
    int arr[];
    int n;
    Scanner sc=new Scanner(System.in);
    Mixer_30(int nn){
        n=nn;
        arr=new int[n];
    }

    void accept(){
        System.out.println("Enter "+n+" elements in ascending order");
        for(int i=0;i< n;i++) 
            arr[i]=sc.nextInt();
    }

    Mixer_30 mix(Mixer_30 A){
        Mixer_30 B=new Mixer_30(n+A.n);
        int x=0;
        for(int i=0;i< n;i++)
            B.arr[x++]=arr[i];
        for(int j=0;j< A.n;j++)
            B.arr[x++]=A.arr[j];
        return B;
    }

    void display(){
        for(int i=0;i< n;i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER SIZE OF FIRST ARRAY");
        Mixer_30 P=new Mixer_30(sc1.nextInt());
        P.accept();
        System.out.println("ENTER SIZE OF SECOND ARRAY");
        Mixer_30 Q=new Mixer_30(sc1.nextInt());
        Q.accept();
        Mixer_30 R=P.mix(Q);
        R.display();
    }
}