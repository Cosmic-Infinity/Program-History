/*
2. Write a Java program to show 0-arguments constructor.
3. Write a Java program to show parameterized constructor.
4. Write a Java program to show constructor overloading.
 */

class Constructors{
    int a, b;
    Constructors(){
        a=1; b=2;
    }

    Constructors(int a, int b){
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args){
        Constructors ob = new Constructors();
        Constructors ob1 = new Constructors(100, 200);
        System.out.println("Zero argument Constr. initialized: "+ob.a+" and "+ob.b);
        System.out.println("Parametarized Constr. initialized: "+ob1.a+" and "+ob1.b);
    }
}