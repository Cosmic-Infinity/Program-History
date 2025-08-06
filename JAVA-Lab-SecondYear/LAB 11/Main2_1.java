/*
2.1. Write a Java program that creates three threads with different priorities
and prints a message in each thread. Observe the order in which the threads execute.
 */

//NOTE: The priority may be ignored, based on which scheduling algorithm JVM chooses
class Main2_1 {
    public static void main(String[] args) {
        THRD low = new THRD("LOW");
        low.setPriority(9);
        THRD mid = new THRD("MEDIUM");
        mid.setPriority(5);
        THRD high = new THRD("HIGH");
        high.setPriority(1);

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
