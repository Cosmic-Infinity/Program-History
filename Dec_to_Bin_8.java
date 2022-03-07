/*8.Write a program in java to accept a decimal number (base 10) and convert it into its
 * binary equivalent. Display the binary equivalent of the decimal number, entered by the user.*/

class Dec_to_Bin_8
{
    public static void main(int n)
    {   //result
        System.out.println("Binary of "+n+" is : \n"+ bin(n));
    }

    private static int bin(int n)//finding binary equivalent recursively
    {
        if(n==0)//base case
            return(0);
        return((n%2)+bin(n/2)*10);
    }
}

/*Description
   
    Type        Name                Description
 
 1. int         n                   stores user input in main()
                                    allows base case & binary conversion in bin()
   
 
 */