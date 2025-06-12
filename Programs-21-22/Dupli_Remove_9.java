/*9. Write a program in java to store 10 numbers in a Single Dimensional Array. Display
 * the numbers after eliminating duplicate numbers of the array */

class Dupli_Remove_9
{
    public static void main(){
        int a[] = {7,96,3,4,44,6,7,8,9,8};
        int dup=0;

        for(int i = 0; i<9-dup; i++)//similar algorithm to selection sort
        {
            for(int j=i+1; j<10-dup; j++)
            {
                if(a[i]==a[j]) //if duplicate found
                {
                    for(int k=j; k<9-dup; k++)//shifting to override duplicate
                        a[k]=a[k+1];
                    dup++;//counting number of duplicates
                }
            }
        }

        for(int i = 0; i<10-dup; i++)//displaying result
            System.out.println(a[i]);
    }
}

/*Description

Type        Name                Description

1. int         dup                 counts the number of duplicate values
2. int         i, j, k             loop variables
3. int[]       a                   to store arrary of numbers 

 */