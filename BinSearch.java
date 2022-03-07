/*35. Design a class BinSearch to search for a particular value in an array. Some of the
members of the class are given below:

    Classname : BinSearch
    Data members/instance variables:
        arr[ ] : to store integer elements
        n : integer to store the size of the array
    Member functions/methods:
        BinSearch(int nn ) : parameterized constructor to initialize n=nn
        void fillarray( ) : to enter elements in the array
        void sort( ) : sorts the array elements in ascending order using any 
                       standard sorting technique
        int bin_search(int l,int u,int v) : searches for the value ‘v’ using binary search and
                                            recursive technique and returns its location if found otherwise returns -1
    
Define the class BinSearch giving details of the constructor( ), void fillarray( ), void
sort( ) and int bin_search(int,int,int). Define the main( ) function to create an object and
call the functions accordingly to enable the task.*/

import java.util.Scanner;
class BinSearch
{
    int arr[]; int n;
    
    BinSearch(int nn){ //initialising
        n = nn;
        arr =  new int[n];
    }
    
    void fillarray(){  
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter "+n+" values:  ");
        for(int i = 0; i<n; i++) //filling array with values
        arr[i] = ob.nextInt();
    }
    
    void sort(){
        for(int i = 0; i<n-1; i++) //sorting with selection sort
        {
            for(int j= i+1; j<n; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    
    int bin_search(int l,int u,int v){ //binary search via recursion
        int mp = (l+u)/2;
        if (arr[mp] == v)
                return(mp); //return when found
        else if(arr[mp] > v)
                u = mp - 1;
        else
                l = mp + 1;
        if(l>u) //base case
            return(-1);
        else
        return(bin_search(l,u,v));//recursive case
    }
    
    
    public static void main(){ //main method
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter array size:  ");
        int size = ob.nextInt(); //array size
        BinSearch bs = new BinSearch(size);
        bs.fillarray(); //filling array
        bs.sort(); //sorting array
        System.out.print("Enter the search term:  ");
        int res = bs.bin_search(0,size-1,ob.nextInt()); //binary search result
        System.out.println(res!= -1? "Found at index: "+res : "Not Found"); //result
    }
}


/*Description
   
    Type        Name            Description
 
 1. int[]        arr        stores array of elements
 2. int          n          stores size of array 'arr[]'
 
 3. int          nn         formal parametre to initialise 'n'
 
 4. int          i, j       loop variables
 5. int          temp       temporary variable to swap values
 
 6. int          l, u, mp   variables to facilitate binary search
 7. int          v          stores the value to be searched
 
 8. int          size       array initialising size as desired by user
 9. int          res        stores return value from binary search
 
 */