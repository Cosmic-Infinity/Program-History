/*
Enter word in UPPER CASE
amorphous
Original word = AMORPHOUS
Swapped word = SMORPHOUA
Sorted word = AHMOOPRSU
*/

import java.util.*;
class SwapSort_13{
    String wrd, swapwrd, sortwrd;
    int len;
    Scanner sc=new Scanner(System.in);
    SwapSort_13(){
        len=0;
        wrd=null;
        swapwrd="";
        sortwrd="";
    }

    void readword(){
        System.out.println("Enter word in UPPER CASE");
        wrd=sc.next().toUpperCase();
        len=wrd.length();
    }

    void swapchar(){
        swapwrd=swapwrd+wrd.charAt(len-1);
        swapwrd=swapwrd+ wrd.substring(1,len-1);
        swapwrd=swapwrd + wrd.charAt(0);
    }

    void sortword(){
        for(char ch='A';ch<='Z';ch++){
            for(int i=0;i<len;i++){
                char ch1=wrd.charAt(i);
                if(ch1==ch)
                    sortwrd += ch1;
            }
        }
    }

    void display(){
        System.out.println("Original word = " + wrd);
        System.out.println("Swapped word = " + swapwrd);
        System.out.println("Sorted word = " + sortwrd);
    }

    public static void main (String args[]){
        SwapSort_13 ob = new SwapSort_13();
        ob.readword();
        ob.swapchar();
        ob.sortword();
        ob.display();
    }
}