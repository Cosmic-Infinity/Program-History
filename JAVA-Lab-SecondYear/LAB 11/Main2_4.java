/*
2.4. Write a Java program that creates multiple threads,
sets their priorities, and prints their priority along with their name.
 */

//NOTE: The priority may be ignored, based on which scheduling algorithm JVM chooses
class Main2_4 {
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
            System.out.println(s+" Thread\tRunning with priority: "+Thread.currentThread().getPriority());
    }
}

