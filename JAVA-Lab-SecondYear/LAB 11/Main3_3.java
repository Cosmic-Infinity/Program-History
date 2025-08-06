/*
3.3. Write a program that uses both Thread and Runnable to create
 a thread that prints "Thread 1" and another thread that prints "Thread 2"
*/

class Main3_3 {
    public static void main(String[] args) {
        CLSS t1 = new CLSS("Thread 1. Made with Thread class");
        Thread t2 = new Thread(new CLSS("Thread 2 made with Runnable interface"));

        t1.start();
        t2.start();
    }
}
class CLSS extends Thread implements Runnable{
    String s;
    CLSS(String s1){s=s1;}

    public void run(){
            System.out.println(s);
    }
}

