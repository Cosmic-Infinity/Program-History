/*
3.1. Write a Java program using the Thread class to create two threads
that print their names and numbers from 1 to 5.
 */

class Main3_1 {
    public static void main(String[] args) {
        THRD t1 = new THRD("Thread 1");
        THRD t2 = new THRD("Thread 2");

        t1.start();
        t2.start();
    }
}
class THRD extends Thread{
    String s;
    THRD(String s1){s=s1;}

    public void run(){
        for(int i=1; i<6; i++)
            System.out.println(s+" printed "+(i));
    }
}

