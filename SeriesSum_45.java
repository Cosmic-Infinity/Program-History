/*
ENTER A NUMBER
25
ENTER NUMBER OF TERMS
5
sum=2.9518268522824347E8
 */

import java.util.Scanner;
public class SeriesSum_45{
    int x,n;
    double sum;
    SeriesSum_45(int xx,int nn){
        x=xx;
        n=nn;
        sum=0.0;
    }

    double findfact(int a){
        if(a==1)
            return 1;
        else
            return a* findfact(a-1);
    }

    double findpower(int a,int b){
        if(b==0)
            return 1;

        else
            return a* findpower(a,b-1);
    }

    void calculate(){
        int k=2;
        for(int i=1;i<=n;i++){
            sum+=findpower(x,k)/findfact(k-1);
            k=k+2;
        }
    }

    void display(){
        System.out.println("sum="+sum);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int a=sc.nextInt();
        System.out.println("ENTER NUMBER OF TERMS");
        int b=sc.nextInt();
        SeriesSum_45 obj1=new SeriesSum_45(a,b);
        obj1.calculate();
        obj1.display();
    }
}