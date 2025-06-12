/*
Enter Sentence : 
AS YOU SOW, SO SO YOU REAP.
Word to remove? : 
SO
Enter position number : 
4
Output :  AS YOU SOW, SO YOU REAP
*/

import java.util.*;
class WordRmv_25{
    public static void main(){
        Scanner ob = new Scanner(System.in);
        String word,st1,st2="",st3="";
        int i,t,n;
        char ch;
        System.out.println("Enter Sentence : ");
        st1=ob.nextLine().toUpperCase();
        System.out.println("Word to remove? : ");
        word = ob.next();
        System.out.println("Enter position number : ");
        n = ob.nextInt();
        ch=st1.charAt(st1.length()-1);
        st1=st1.substring(0,st1.length()-1);
        if(ch=='.' || ch=='?' || ch=='!'){
            StringTokenizer st = new StringTokenizer(st1);
            t=st.countTokens();
            for(i=1; i<=t; i++){
                st2=st.nextToken().trim();
                if(st2.equals(word)==false || i!=n)
                    st3=st3+' '+st2;
            }
            System.out.println("Output : "+st3);
        }
        else
            System.out.println("Invalid Stentence");
    }
}