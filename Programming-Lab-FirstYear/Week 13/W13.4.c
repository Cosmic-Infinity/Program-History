//WAP to add two times (in hr-min-sec) by passing structure to a function.

#include <stdio.h>



typedef struct time{
    int h, m, sec;
}time;

time add(time, time);

int main(){

    time t1, t2, t3;
    char tym1[16], tym2[16];
    
    printf("Enter Time 1 -> ");
    gets(tym1);
    printf("Enter Time 2 -> ");
    gets(tym2);
    
    t1.h = tym1[0]-48;
    t1.m = (tym1[3]-48)*10+(tym1[4]-48);
    t1.sec = (tym1[7]-48)*10+(tym1[8]-48);

    t2.h = tym2[0]-48;
    t2.m = (tym2[3]-48)*10+(tym2[4]-48);
    t2.sec = (tym2[7]-48)*10+(tym2[8]-48);
    
    t3 = add(t1,t2);

    printf("Sum of time -> %d: %d: %d", t3.h, t3.m, t3.sec);
    return 0;
}

time add(time t1, time t2){
    time t3;

    t3.h = t1.h + t2.h;
    t3.m = t1.m + t2.m;
    t3.sec = t1.sec + t2.sec;

    if(t3.sec>59){
        t3.sec -= 60;
        t3.m += 1;
    }
    if(t3.m > 59){
        t3.m -= 60;
        t3.h += 1;
    }
    
    return t3;
}