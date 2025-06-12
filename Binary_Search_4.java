/*
 * 4. Write a program in java to store 10 numbers in a Single Dimensional Array. Now
 * search, whether a given number is present or not in the array. If it is present then display
 * ‘Search successful’ otherwise, display ‘Number is not present’. Use Binary Search technique
 */

class Binary_Search_4
{
    public static void main(int value){
        int a[] = {1,2,3,4,5,6,7,8,9,10};       
        int fp = 0, lp = 9;
        int mp = (fp+lp)/2;
        //binary search
        while(fp<=lp)
        {
            //case if found
            if (a[mp] == value)
                break;
            //case if number smaller than middle index
            else if(a[mp] > value)
                lp = mp - 1;
            //case if number larger than middle index
            else
                fp = mp + 1;
            mp = (fp+lp)/2;
        }
        //result
        System.out.println(fp>lp? "Number is not present" : "Search Successful");
    }
}

/*Description
   
    Type        Name                Description
 
 1. int         fp, mp, lp          index variables necessary for binary search
 2. int[]       a                   to store arrary of numbers 
   
 
 */