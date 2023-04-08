/*

Enter number of teams :
4
gamer AZ
dublin
infi gg
lol
g	d	i	l	
a	u	n	o	
m	b	f	l	
e	l	i		
r	i	 		
 	n	g		
A		g		
Z				
*/

import java.util.*;
import java.io.*;
class TeamNames_24 {
    public static void main()throws IOException{
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of teams :");
        int n = Integer.parseInt(ob.readLine());
        if(n<2 || n>9)
            System.out.println("Invalid Input");
        else{
            String name[]= new String[n];
            int len[] = new int[n];
            for(int i=0; i<n; i++){
                name[i]=ob.readLine();
                len[i]=name[i].length();
            }
            int max=0;
            for(int i=0; i<n; i++){
                if(len[i]>max)
                    max=len[i];
            }
            for(int i=0; i<max; i++){
                for(int j=0; j<n;j++){
                    if(i<len[j])
                        System.out.print(name[j].charAt(i)+"\t");
                    else
                        System.out.print("\t");
                }
                System.out.println();
            }
        }
    }
}