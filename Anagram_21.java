/*
Enter first word : 
wolf
Enter second word : 
flow
Anagram

Enter first word : 
flow
Enter second word : 
wolff
NOT-Anagram

 */

import java.util.*;
class Anagram_21{
    public static void main(){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter first word : ");
        String s1 = ob.next();
        System.out.println("Enter second word : ");
        StringBuilder s2 = new StringBuilder(ob.next());
        byte f = 0;
        int len1 = s1.length();
        for(int i=0; i<len1; i++){
            char c = s1.charAt(i);
            int pos = s2.indexOf(c+"");
            if(pos==-1){
                f=1;break;
            }
            else
                s2=s2.delete(pos,pos+1);
        }
        System.out.println(f==0 && s2.length()==0?"Anagram":"NOT-Anagram");
    }
}