/*
Enter string to be encoded : 
An Apple a day keeps the DOCTOR away
Encode by number : 
5
Fs%Fuuqj%f%ifd%pjjux%ymj%ITHYTW%fbfd
 */
import java.util.*;
class Encode_20{
    public static void main(){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter string to be encoded : ");
        String s= ob.nextLine();
        System.out.println("Encode by number : ");
        int move = ob.nextInt();
        int a=s.length();
        for(int i=0; i<a; i++){
            char c = (char)(s.charAt(i)+move);
            if((c>89 && c<97) || (c>122))
                c=(char)(c-26);
            System.out.print(c);
        }
    }
}