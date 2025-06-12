/*32. Design a class Convert to find the date and the month from a given day number for a
particular year. Example: If day number is 64 and the year is 2020, then the
corresponding date would be: March 4, 2020 i.e. (31 + 29 + 4 = 64) Some of the
members of the class are given below:

    Classname : Convert
    Data members/instance variables:
        n : integer to store the day number
        d : integer to store the day of the month (date)
        m : integer to store the month
        y : integer to store the year
    Methods/Member functions:
        Convert ( ) : constructor to initialize the data members with legal initial values
        void accept( ) : to accept the day number and the year
        void day_to_date( ) : converts the day number to its corresponding date for a particular year and stores the date in ‘d’ and the month in ‘m’
        void display( ) : displays the month name, date and year

Specify the class Convert giving details of the constructor( ),void accept( ), void
day_to_date( ) and voiddisplay( ). Define a main( ) function to create an object and call
the functions accordingly to enable the task.*/

import java.util.Scanner;
class Convert{
    int n, d, m, y;
    public static void main(){
        Convert cv = new Convert();
        cv.accept(); //user input
        cv.day_to_date(); //conversion
        cv.display(); //display result
    }
    
    Convert(){ //initialising
        n = 0;d = 0; m = 0;y = 0;
    }

    void accept(){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter day number : "); //taking user input
        n = ob.nextInt();
        System.out.print("Enter year : ");
        y = ob.nextInt();
    }

    void day_to_date(){
        int month[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(y%100 == 0){ //leap year day adjustment
            if(y%400 == 0)
                month[1]++;
        }
        else{
            if(y%4 == 0)
                month[1]++;
        }
        for(d=n ; d>month[m]; d=d-month[m++]){}//calculating month and date
    }

    void display(){
        String month_n[] = {"January","February","March","April","May","Juna","July","August","September","October","November","December"};
        System.out.println(month_n[m]+" "+d+", "+y); //result
    }
}

/*Description
   
    Type        Name            Description
 
 1. int          n          stores the day number
 2. int          d          stores the day of the month (date)
 3. int          m          stores the month
 4. int          y          stores the year
 
 5. int[]        month      stores number of days each month
 
 6. String[]     month_n    stores month names

 
 */