/*
2.2. Create a Java program where two threads have different priorities,
and one prints numbers from 1 to 10 while the other prints letters (A-J).*/

//NOTE: The priority may be ignored, based on which scheduling algorithm JVM chooses
class Main2_2 {
    public static void main(String[] args) {
        THRD low = new THRD(0);
        low.setPriority(9);
        THRD high = new THRD('A');
        high.setPriority(1);

        low.start();
        high.start();
    }
}
class THRD extends Thread{
    int a=-1;
    THRD(int n){a=n;}

    THRD(char n){}

    public void run(){
        if(a>-1)
            for(int i=0; i< 10; i++)
                System.out.println("Thread printed: "+(i+1));
        else
            for(int i=0; i< 10; i++)
                System.out.println("Thread printed: "+(char)('A'+i));
    }
}
