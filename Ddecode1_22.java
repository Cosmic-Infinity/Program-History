/*
Enter coded text : 
RUIJGGEVGGBKSAGG
Enter shift :
11
Decoded Text : BEST OF LUCK 
*/

import java.util.*;
class Ddecode1_22{
    public static void main(){
        String str2="";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter coded text : ");
        String str1=in.next();
        System.out.println("Enter shift :");
        int s = in.nextInt();
        if(s>26 || s<1)
            System.out.println("Invalid Shift");
        else{
            int l=str1.length();
            for(int i=0;i<l;i++){
                char c=str1.charAt(i);
                int a=(int)c+(s-1);
                if((char)a=='Q'){
                    if(str1.charAt(i+1)+(s-1)=='Q' && i<l){
                        a=32;
                        i++;
                    }
                }
                if(a>90)
                    a=a-26;
                str2=str2+(char)a;
            }
        }
        System.out.println("Decoded Text : "+str2);
    }
}