/*
3.5. Write a Java program to create a thread using the Runnable interface
and execute two different tasks concurrently using two different Runnable 
implementations.
 */

class Main3_5 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RNBL("Implementation 1"));
        Thread t2 = new Thread(new RNBL("Implementation 2"));

        t1.start();
        t2.start();
    }
}
class RNBL implements Runnable{
    String s;
    RNBL(String s1){s=s1;}

    public void run(){
        for(int i=0; i<2; i++)
            System.out.println(s);
    }
}

