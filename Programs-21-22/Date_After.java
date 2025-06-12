/*
 * Question 1
Design a program which takes two integer parameters namely number of the day
( between 1 and 366 ) and the year ( in 4 digits ) as inputs and displays the date i.e. day, month
and year.
Also find the corresponding date exactly after (N) days of the present date by accepting the
value of (N) from the use, where the value of (N) is in the limit ( 1 <= N <= 100 )*/

import java.util.Scanner;
class Date_After{
    static Scanner ob = new Scanner(System.in);
    static int month_dt[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    static int year = 0;
    static int day = 0;
    static int mcount;    
    public static void main(){    
        System.out.print("Enter year: ");
        year = isValid(ob.nextInt(),1000,9999); //year input with validity check
        mcount = 0;
        if(isLeap(year)){ //day input based on year, with validity check 
            month_dt[1]++;
            System.out.println("It is a leap year. Enter day (1-366)");
            day = isValid(ob.nextInt(),1,366);   
        }
        else{
            System.out.println("It is NOT a leap year. Enter day (1-365)");
            day = isValid(ob.nextInt(),1,365); 
        }
        System.out.println("Enter date after: ");
        int dayafter = isValid(ob.nextInt(),1,100); //day after input

        System.out.println("\n---------------------------\n");      
        output(); //result
        System.out.println("Day after "+dayafter+" days:");
        day=day+dayafter;      
        output();    //day after result
    }

    private static boolean isLeap(int year){ //leap year test function
        if(year%100 == 0){
            if(year%400 == 0)
                return true;
        }
        else{
            if(year%4 == 0)
                return true;
        }
        return false;
    }

    private static int isValid(int val,int lolim, int uplim){ //input validity check function
        while(val<lolim || val>uplim){
            System.out.println("INVALID.Enter valid value.("+lolim+"-"+uplim+")");
            val = ob.nextInt();
        }
        return val;
    }

    private static void output(){       

        for( ; day>month_dt[mcount];){ //date and month calculation
            day=day-month_dt[mcount];
            mcount++;
            if(mcount>11){ //this won't trigger until day_after operation
                year++; //year & date adjustment for day_after operation
                mcount=0;
                if(isLeap(year)) month_dt[1]=29;
                else month_dt[1]=28;              
            }
        }

        String month_n[] = {"January","February","March","April","May","Juna","July","August","September","October","November","December"};
        switch(day%10){ //result
            case 1: System.out.println(day+"st "+month_n[mcount]+", "+year);
                break;
            case 2: System.out.println(day+"nd "+month_n[mcount]+", "+year);
                break;
            case 3: System.out.println(day+"rd "+month_n[mcount]+", "+year);
                break;
            default: System.out.println(day+"th "+month_n[mcount]+", "+year);
        }
    }
}

/*Description

Type        Name                Description

1. int[]       month_dt        stores number of days in each month
2. int         day             stores the number of days and date as required
3. int         year            stores year as required
4. int         mcount          stores current month as required
5. int         dayafter        stores day after as required by the question

6. int         val             input value for validity check
7. int         lolim           lower limit for validity check
8. int         uplim           upper limit for validity check

9. String[]    month_n         stores month name

 */