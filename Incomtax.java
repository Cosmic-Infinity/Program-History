class Incomtax extends Employee_47{
    double da, hra, gross, ansal, tax, scharge;
    void compute(){
        da=bpay*50/100;
        hra=bpay*15/100;
        gross=bpay+da+hra;
        ansal = gross *12;
        if(ansal>=250000 && ansal<=500000)
            tax=(ansal-250000)*.1;
        if(ansal>=500000 && ansal<=1000000)
            tax=5000+(ansal-500000)*.2;
        if(ansal>1000000)
            tax=25000+(ansal-1000000)*.3;
        if(ansal>1000000)
            scharge=(ansal-1000000)*.1;
    }

    void display(){
        compute();
        showdata();
        System.out.println("Dearness Allowance: Rs."+ da);
        System.out.println("House rent allowance: Rs."+hra);
        System.out.println("Gross salary: Rs."+gross);
        System.out.println("Annaual Salary: Rs."+ansal);
        System.out.println("Income Tax:Rs."+tax);
        System.out.println("Surcharge :Rs."+scharge);
    }
}