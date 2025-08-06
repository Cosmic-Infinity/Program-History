/*
4.
Write a program in java using inheritance to show 
how to call the base class parameterized constructors from the derived class using super.   
 */

class Mains4 extends Sup{
    Mains4(){
        super(1,2);
    }

    public static void main(String[] ars){
        new Mains4();
    }
}

class Sup{
    Sup(int a, int b){
        System.out.println("Hi! I'm from Superclass");
    }
}