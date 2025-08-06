/*
11.
Implement class Number with data member value. Include following predicate methods:
boolean is_Even(): check if number is even;
boolean is_Prime(): check if prime
boolean is_Perfect(): check if perfect
int fin_Factorial(): recursive method to find factorial

Write application class Number_Demo to test the functionality of class Number.
 */
import java.util.*;
class Number_Demo{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= ob.nextInt();
        Number nm = new Number();
        nm.value = n;
        System.out.println(nm.is_Even()?"Even": "NOT Even");
        System.out.println(nm.is_Prime()?"Prime": "NOT Prime");
        System.out.println(nm.is_Even()?"Perfect": "Not Perfect");
        System.out.println("Factorial is: "+nm.fin_Factorial());
    }
}

class Number{
    int value;
    boolean is_Even(){
        return(value%2==0);
    }

    boolean is_Prime(){
        byte c = 0;
        for(int i=2; i<=(value/2); i++){
            if(value%i == 0)
                c++;
            if(c>0)
                break;
        }
        return (c==0);
    }

    boolean is_Perfect(){
        int sum=0;
        for(int i=1; i<=(value/2); i++){
            if(value%i==0)
                sum+=i;
        }
        return (sum==value);
    }

    int fin_Factorial(){
        if(value==1)
            return 1;
        else{
            value--;
            return((value+1)*fin_Factorial());
        }
    }
}