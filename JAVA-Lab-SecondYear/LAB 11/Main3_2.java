/*
3.2. Create a Java program that implements the Runnable interface
and uses it to create multiple threads that print numbers from 1 to 3.
 */

class Main3_2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RNBL("Thread 1"));
        Thread t2 = new Thread(new RNBL("Thread 2"));

        t1.start();
        t2.start();
    }
}
class RNBL implements Runnable{
    String s;
    RNBL(String s1){s=s1;}

    public void run(){
        for(int i=1; i<4; i++)
            System.out.println(s+" printed "+(i));
    }
}

