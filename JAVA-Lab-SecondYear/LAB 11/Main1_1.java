/*
1.1. Create a simple Java program to create a thread that prints 
"Hello, World!" and start the thread.
 */

class Main1_1{
    public static void main(String[] args){
        TRD1 t1 = new TRD1();
        t1.start();
    }
}
class TRD1 extends Thread{
    public void run(){
        System.out.println("Hello World!");
    }
}