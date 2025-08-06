/*
2.3. Write a program that creates three threads with Thread.MIN_PRIORITY,
Thread.NORM_PRIORITY, and Thread.MAX_PRIORITY and demonstrates how thread
priority affects execution order.
 */

//NOTE: The priority may be ignored, based on which scheduling algorithm JVM chooses
class Main2_3 {
    public static void main(String[] args) {
        THRD low = new THRD("LOW");
        low.setPriority(Thread.MIN_PRIORITY);
        THRD mid = new THRD("MEDIUM");
        mid.setPriority(Thread.NORM_PRIORITY);
        THRD high = new THRD("HIGH");
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        mid.start();
        high.start();
    }
}
class THRD extends Thread{
    String s;
    THRD(String s1){s=s1;}

    public void run(){
        for(int i=0; i< 2; i++)
            System.out.println("Thread of Priority: "+s);
    }
}

