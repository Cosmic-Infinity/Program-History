/* 34.Design a class ArmNum to check if a given number is an Armstrong number or not.
  [A number is said to be Armstrong if sum of its digits raised to the power of length of the
   number is equal to the number]
   Example : 371 = 3^3 + 7^3 + 1^3
             1634 = 1^4 + 6^4 + 3^4 + 4^4
             54748 = 5^5 + 4^5 + 7^5 + 4^5 + 8^5 
   Thus 371, 1634 and 54748 are all examples of
   
Armstrong numbers. Some of the members of the class are given below:
        Class name : ArmNum
        Data members/instance variables:
            n : to store the number
            l : to store the length of the number
        Methods/Member functions:
            ArmNum (int nn) : parameterized constructor to initialize the data member n=nn
            int sum_pow(int i) : returns the sum of each digit raised to the power of the length of
                                 the number using recursive technique eg. 34 will return 3^2 + 4^2
                                 (as the length of the number is 2)
            void isArmstrong( ) : checks whether the given number is an Armstrong number by 
                                  invoking the function sum_pow( ) and displays the result with an appropriate message*/
                                  
class ArmNum{
    int n,  l;
    ArmNum (int nn){ //initialising
        n = nn;
        l = (nn+"").length();
    }
    
    int sum_pow(int i){ //recursive method for finding sum
        if (i == 0)//base case
            return 0;
        return ((int)Math.pow(i%10,l) + sum_pow(i / 10));//recursive case
    }
    
    void isArmstrong( ){ //result
        if(n == sum_pow(n))
            System.out.println(n+ " is an Armstrong Number");
        else
            System.out.println(n+ " is NOT an Armstrong Number");
    }  
    
    public static void main(int n){   //main method
        ArmNum an = new ArmNum(n);
        an.isArmstrong();
    }
}

/*Description
   
    Type        Name            Description
 
 1. int          n          stores number for testing
 2. int          l          stores length of number
 
 3. int          nn         formal parametre to initialise 'n'
 
 4. int          i          value which gets iterated in recursive case

 */