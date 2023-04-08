public class Holder_50
{
    int Q[];
    int cap,front,rear;
    Holder_50(int n){
        cap=n;
        front=0;
        rear =0;
        Q=new int[cap];
    }

    void addint(int v){
        if( rear== cap)
            System.out.println("HOLDER IS FULL");
        else
            Q[rear++]=v;
    }

    int removeint(){
        int w = -999;
        if(front==rear)
            System.out.println("HOLDER IS EMPTY");
        else
            w = Q[front++];
        return w;
    }

    void show(){
        int k;
        if(front==rear)
            System.out.println("HOLDER IS EMPTY");
        else{
            for(k= front; k<rear; k++)
                System.out.println(Q[k]);
        }
    }
}