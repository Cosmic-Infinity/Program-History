/*
1. Given are two one-dimensional arrays A & B, which are sorted in ascending order.
Write a Java program to merge them into single sorted array C that 
contains every item from arrays A & B, in ascending order.
 */

class Merge_Sorted{
    public static void main(String[] args){
        int[] a = {2,3,4,5};
        int[] b = {1,3,6,7,8,9};
        int[] c = new int[a.length+b.length];
        int x=0, x1=0, x2=0;
        for(int i=0; i<a.length && i<b.length; i++){
            if(a[x1]<b[x2])
                c[x++] = a[x1++];
            else
                c[x++] = b[x2++];
        }
        while(x1<a.length)
            c[x++]=a[x1++];
        while(x2<b.length)
            c[x++]=b[x2++];
        System.out.println("Sorted merged array: ");
        for(int i=0; i<x; i++){
            System.out.print(c[i]+", ");
        }
    }
}