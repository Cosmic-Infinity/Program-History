/*7. Write a program in java to store 10 numbers in Single Dimensional
 * Array. Now search whether a number entered by the user is present or not. If present
 * then display the number and also check whether it is prime number or not otherwise,
 * display Number is not present. Use Linear Search technique*/

class Linear_Prime_7
{
    public static void main(int value){

        int a[] = {1,2,3,4,5,6,7,8,9,10};       
        int i=0;
        for(; i<10; i++)//linear search
        {
            if(a[i] == value)
            {
                System.out.println(value + " is present in Array");
                System.out.println(prime(value)? "It is PRIME": "It is NOT Prime");
                break;
            }
        }
        //when number not present, displaying message
        if(i>9)
            System.out.println("Number is not present");
    }

    private static boolean prime(int value){
        int fac= 0;
        for(int i=2; i<value; i++){// prime testin
            if(value%i==0)
                fac++;
        }
        return(fac==0);//returning whether no. of factors==0
    }
}

/*Description
   
    Type        Name                Description
 
 1. int         value               to store the number to test
 2. int         i                   loop variable
 3. int[]       a                   to store arrary of numbers 
 
 4. int         fac                 stores the number of factors for prime test
   
 
 */