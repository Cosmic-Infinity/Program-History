/*
1.5. Create a Java program that demonstrates the difference between start() and run()
by running both methods.
 */

class Main1_5 {
    public static void main(String[] args) {
        THRD t1 = new THRD();
        System.out.println("Using start():");
        t1.start(); 
        try{
            Thread.sleep(10);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Using run():");
        t1.run(); // calls from the stacktop
    }
}

class THRD extends Thread {
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}
