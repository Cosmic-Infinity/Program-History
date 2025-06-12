//WAP to add two distances (in km-meter) using structures.

#include <stdio.h>

typedef struct dist{
    int km;
    int m;
}dist;

int main(){

    dist d1, d2, d3;
    printf("Enter data for 1st distance:\n");
    printf("Enter km : ");
    scanf("%d", &d1.km);
    printf("Enter metres : ");
    scanf("%d", &d1.m);

    printf("Enter data for 2nd distance:\n");
    printf("Enter km : ");
    scanf("%d", &d2.km);
    printf("Enter metres : ");
    scanf("%d", &d2.m);

    d3.km = d1.km + d2.km;
    d3.m = d1.m + d2.m;
    if(d3.m>999){
        d3.km++;
        d3.m-=1000;
    }

    printf("Sum of distences = %dkm and %dm", d3.km, d3.m);

    return 0;
}