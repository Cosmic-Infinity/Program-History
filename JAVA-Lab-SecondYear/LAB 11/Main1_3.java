/*
1.3. Write a Java program to demonstrate the 'New', 'Runnable', 'Blocked','Waiting', 
and 'Terminated' states in a thread's life cycle.*/

class Main1_3{
    public static void main(String[] args){
        TRD1 t1 = new TRD1();
        System.out.println(t1.getState());
        t1.start();
        try{
            Thread.sleep(500);
            System.out.println(t1.getState());
            t1.join();
            System.out.println(t1.getState());
        }catch (Exception e){};
    }
}
class TRD1 extends Thread{
    public void run(){
        System.out.println(this.getState());
        for(int i=0; i<2; i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}