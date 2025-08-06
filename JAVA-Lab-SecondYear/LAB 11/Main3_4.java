/*
3.4. Write a Java program where a Runnable object
is passed to a Thread object, and the thread prints a message.*/

class Main3_4 {
    public static void main(String[] args) {
        RNBL runnable = new RNBL("Thread from Runnable Object");
        Thread t1 = new Thread(runnable);

        t1.start();
    }
}
class RNBL implements Runnable{
    String s;
    RNBL(String s1){s=s1;}

    public void run(){
        System.out.println(s);
    }
}

