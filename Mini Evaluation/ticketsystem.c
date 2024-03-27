#include <stdio.h>

int main(){
    printf("\n\n");
    printf("NANDANKANAN ZOO, BHUBANESWAR\n\n");

    char control =  'Y';
    int adult=0, child=0, kid=0, camera=0;
    int total_adult=0, total_child=0, total_kid=0;
    int price = 0;

    int visitors = 0;
    int collection = 0;
    


    while(1){

        printf("Enter no. of Adults : \t\t");
        scanf("%d", &adult);
        printf("Enter no. of Child : \t\t");
        scanf("%d", &child);
        printf("Enter no. of Kids (below 5y) : \t");
        scanf("%d", &kid);
        printf("Enter no. of Camera : \t\t");
        scanf("%d", &camera);

        price = (adult*20)+(child*10)+(camera*50);
        printf("\nTicket Price : \t\t\t%d\n\n", price);

        total_adult += adult;
        total_child += child;
        total_kid += kid;
        collection += price;

        printf("--------------------------------\n");
        control = 'n';
        printf("Do you want to continue? (Y for Continue, N for terminate) :\n");
        scanf("%d");
        scanf("%c", &control);
        if(control == 'n' || control == 'N'){
            printf("clear--------------------------------\n\n");
            break;
        }
        printf("--------------------------------\n\n");
        
    }
    visitors = total_adult+total_child+total_kid;

    printf("Total no. of Adults : \t%d\n",total_adult);
    printf("Total no. of Child : \t%d\n",total_child);
    printf("Total no. of Visitors : %d\n",visitors);
    printf("\nTotal Collection : \t%d\n",collection);
    printf("\n--------------------------------\n\n");

}