/*
1.6. Write a Java program that simulates a thread entering the 'Waiting'
state using Thread.join(). */

class Main1_6 {
    public static void main(String[] args) {
        THRD t1 = new THRD();
        System.out.println("t1 thread status : " + t1.getState());
        t1.start();
        try{
            t1.join();
        }catch(Exception e){}
        System.out.println("main is now resumed.");
    }
}

class THRD extends Thread {
    public void run() {
        System.out.println("t1 thread status : "+ this.getState());
        System.out.println("t1 is running and is joined to main.\nSo main thread is now Waiting for t1 to finish");
        try{
            Thread.sleep(1000);
        }catch (Exception e){} 
        System.out.println("th1 has now finished.");
    }
}
