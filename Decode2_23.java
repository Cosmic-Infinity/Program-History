/*
Enter coded string : 
2312179862310199501872356231018117927
Decoded mesage : Have A Nice Day 
*/
import java.util.*;
class Decode2_23{
    public static void main(){
        String out="";
        Scanner in= new Scanner(System.in);
        System.out.println("Enter coded string : ");
        StringBuilder str = new StringBuilder(in.nextLine());
        int l = str.length();
        String str2 = str.reverse().toString();
        int i=0;
        while(i<l){
            char c = str2.charAt(i);
            if(c>'1'){
                c = (char)Integer.parseInt(str2.substring(i,i+2));
                i=i+2;
            }
            else{
                c = (char)Integer.parseInt(str2.substring(i,i+3));
                i=i+3;
            }
            out = out + c;
        }
        System.out.println("Decoded mesage : "+out);
    }
}