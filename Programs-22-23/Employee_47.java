/*
The Employee's code is 1111
The basic salary of the employee is1200000.0
Dearness Allowance: Rs.600000.0
House rent allowance: Rs.180000.0
Gross salary: Rs.1980000.0
Annaual Salary: Rs.2.376E7
Income Tax:Rs.6853000.0
Surcharge :Rs.2276000.0
*/


import java.util.*;
class Employee_47{
    int empc;
    double bpay;
    Employee_47(){
        empc =0; bpay = 0;
    }

    Employee_47(int c, double b){
        empc = c; bpay = b;
    }

    void showdata(){
        System.out.println("The Employee's code is "+empc);
        System.out.println("The basic salary of the employee is" + bpay);
    }
}

