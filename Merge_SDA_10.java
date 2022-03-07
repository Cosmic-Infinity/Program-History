/*10. Write a program in java to store 10 numbers each in two different Single Dimensional
 *Arrays. Now, merge the numbers of both the arrays in a Single Dimensional Array.
 *Display the elements of the merged array*/

class Merge_SDA_10
{
    public static void main(){

        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int b[] = {11,12,13,14,15,16,17,18,19,20};
        int c[] = new int[20];
        for(int i=0; i<10; i++){//adding elements in third array
            c[i] = a[i];
            c[i+10] = b[i];
        }
        //printing result
        for(int i=0; i<20; i++)
        System.out.println(c[i]);
    }
}

/*Description
   
    Type        Name                Description
 
 1. int[]       a, b                to store initial arrary of numbers 
 2. int[]       c                   to store resultant array
 3. int         i                   loop variable
   
 
 */