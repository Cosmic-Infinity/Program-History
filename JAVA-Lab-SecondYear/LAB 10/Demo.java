
class ThreadJoin extends Thread{
    public void run()
    {
        for (int j = 0; j < 2; j++){
            try{
                Thread.sleep(300);
                System.out.println("Current thread: " + Thread.currentThread().getName());
            }
            catch(Exception e){System.out.println(e);}
            System.out.println( j );
        }
    }
}

public class Demo{
    public static void main (String argvs[]){
        ThreadJoin th1 = new ThreadJoin();
        th1.start();
        try{
            System.out.println("Current thread: "+Thread.currentThread().getName());
            th1.join();
        }
        catch(Exception e){System.out.println(e);}
        System.out.println("Main ended");
    }
}