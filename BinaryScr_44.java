/*
Enter 6 elements in ascending order
5
6
7
8
9
10
Enter value to be searched
7
7 found in the array
*/

import java.util.Scanner;
public class BinaryScr_44{
    Scanner sc=new Scanner(System.in);
    int Adno[];
    BinaryScr_44(){
        Adno=new int[6];
    }

    void fillArray(){
        System.out.println("Enter 6 elements in ascending order");
        for(int i=0;i<Adno.length;i++)
            Adno[i]=sc.nextInt();
    }

    int binSearch(int l,int u,int v){
        int m=(l+u)/2;
        if(Adno[m]==v)
            return 1;
        else if(l> u)
            return -1;
        else if(v>Adno[m])
            return binSearch(m+1,u,v);
        else
            return binSearch(l,m-1,v);
    }

    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        BinaryScr_44 ob1=new BinaryScr_44();
        ob1.fillArray();
        System.out.println("Enter value to be searched");
        int v=sc1.nextInt();
        int p=ob1.binSearch(0,ob1.Adno.length-1,v);
        if(p==1)
            System.out.println(v+" found in the array");
        else
            System.out.println(v+" is not found in the array");
    }
}