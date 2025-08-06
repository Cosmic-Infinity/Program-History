/*
1.4. Write a Java program that creates two threads,
each printing a series of numbers (1-5) and demonstrates how they execute concurrently.
 */

class Main1_4{
    public static void main(String[] args){
        TRD1 t1 = new TRD1();
        TRD1 t2 = new TRD1();
        t1.start();
        t2.start();
    }
}
class TRD1 extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            try{
                System.out.println((i+1));
                Thread.sleep(500);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}