/*
1.2. Write a Java program that creates a thread that prints numbers from 1 to 5
with a 1-second delay between each number using Thread.sleep().
 */

class Main1_2{
    public static void main(String[] args){
        TRD1 t1 = new TRD1();
        t1.start();
    }
}
class TRD1 extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(i+1);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}