class Compute extends Library_48{
    int d; double f;
    Compute(String nn, String aa, double pra,int dd){
        super(nn, aa, pra);
        d=dd;
        f= 0.0;
    }

    void fine(){
        if(d>7){
            if((d-7)<=5)
                f=2*(d-7);
            else
            if((d-7)>5 && (d-7)<=10)
                f=3* (d-7);
            else
                f=5 * (d-7);
        }
    }

    void display(){
        fine();
        super.display();
        double total;
        System.out.println("No. of days taken to return the book:\t" +d);
        System.out.println("Fine charged: \t" + f);
        total=(2.0/100.0 * p)+ f;
        System.out.println("Total amount to be paid: \t" + total);
    }
}