/*
5.

Suppose you are given a class named ClockTime with the following contents:

A ClockTime object represents an hour:minute time during the day or night, such as 10:45 AM or 6:27 PM.

public class ClockTime
{ 
private int hour;
private int minute;
private String amPm;

Constructs a new time for the given hour/minute

public ClockTime(int h, int m, String ap)

returns the field values
public int getHour()
public int getMinute()
public String getAmPm()

returns a String for this time; for example, "6:27 PM"

public String toString()
...
}

Write an instance method advance that will be placed inside the ClockTime class.
The method accepts a number of minutes as its parameter 
and moves your object forward in time by that amount of minutes.

The minutes passed could be any non-negative number, even a large number such as 500 or 1000000.
If necessary, your object might wrap into the next hour or day, 
or it might wrap from the morning ("AM") to the evening ("PM") or vice versa.

(A ClockTime object doesn't care about what day it is; if you advance by 1 minute from 11:59 PM, it becomes 12:00 AM.)

For example, the following calls would produce the following results:

ClockTime time = new ClockTime(6, 27, "PM");
time.advance(1); // 6:28 PM
time.advance(30); // 6:58 PM
time.advance(5); // 7:03 PM
time.advance(60); // 8:03 PM
time.advance(128); // 10:11 PM
time.advance(180); // 1:11 AM
time.advance(1440); // 1:11 AM (1 day later)
time.advance(21075); // 4:26 PM (2 weeks later)
 */

public class Mains5{
    public static void main(String[] args){
        ClockTime time = new ClockTime(6, 27, "PM");
        time.advance(1); // 6:28 PM
        System.out.println(time.toString());
        time.advance(30); // 6:58 PM
        System.out.println(time.toString());
        time.advance(5); // 7:03 PM
        System.out.println(time.toString());
        time.advance(60); // 8:03 PM
        System.out.println(time.toString());
        time.advance(128); // 10:11 PM
        System.out.println(time.toString());
        time.advance(180); // 1:11 AM
        System.out.println(time.toString());
        time.advance(1440); // 1:11 AM (1 day later)
        System.out.println(time.toString());
        time.advance(21075); // 4:26 PM (2 weeks later)
        System.out.println(time.toString());
    }
}

class ClockTime
{ 
    private int hour;
    private int minute;
    private String amPm;
    public ClockTime(int h, int m, String ap){
        hour = h;
        minute = m;
        amPm = ap;
    }

    public int getHour(){return hour;}

    public int getMinute(){return minute;}

    public String getAmPm(){return amPm;}

    public String toString(){   
        if(minute<10)
        return (hour+":0"+minute+" "+amPm);
        else
        return (hour+":"+minute+" "+amPm);
    }

    public void advance(long adv){
        while(adv>0){
            if(minute == 59){
                if(hour == 11){
                    if(amPm.equalsIgnoreCase("am"))
                        amPm="PM";
                    else if(amPm.equalsIgnoreCase("pm"))
                        amPm = "AM";
                }
            }
            minute++;
            adv--;
            if(minute > 59){
                hour+=1;
                minute = 0;
            }
            if(hour>12){
                hour = hour - 12;    
            }

        }

    }
}