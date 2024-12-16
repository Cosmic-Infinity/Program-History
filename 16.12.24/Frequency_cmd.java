/*
10. Aim of the program:  Find the no. of occurrence of each element in a user entered list of nos.
    Input:      Enter list of numbers  e.g.( 15 25 15 11 25 32 15 32)  
    Output:     Occurrence of 15=3
                Occurrence of 25=2
                Occurrence of 11=1
                Occurrence of 32=2
*/

import java.util.*;
public class Frequency_cmd{
    public static void main(String[] args){
        int len = args.length;
        if(len == 0){
            System.out.println("Enter some integers first");
            return;
        }
        int[][] a = new int[2][len];
        try{
            for(int i=0; i<len; i++){
                a[0][i] = Integer.parseInt(args[i]);
            }
        }catch(Exception e){
            System.out.println("Enter only integers");
            return;
        }
        int count;
        for(int i=0; i<len; i++){
            count = 0;
            for(int j=0; j<len;j++){
                if(a[0][i]!= -999){
                    if(a[0][i] == a[0][j]){
                        count++;
                        if(i!=j)
                            a[0][j] = -999;
                    }
                }
            }
            a[1][i] = count;
        }
        System.out.println("Frequency of each number: \n");
        for(int i=0; i<len; i++){
            if(a[0][i] == -999) continue;
            System.out.println("Occurence of "+a[0][i]+" is "+a[1][i]);
        }
        System.out.println();
    }
}