//WAP to store n employees’ data such as employee name, gender, designation, department, basic pay etc
//using structures with dynamically memory allocation. Calculate the gross pay of each employee as follows:
//Gross pay=basic pay + HR + DA
//HR=25% of basic,
//DA=75% of basic


#include <stdio.h>
#include <stdlib.h>

typedef struct employee{
    char name[32];
    char designation[32];
    char department[32];
    float basic;
    char gender;
} employee;

int main(){
    int n;
    printf("Enter number of employee : ");
    scanf("%d", &n);

    employee* e = (employee*)malloc(n*sizeof(employee));

    for(int i=0; i<n; i++){
        printf("Enter employee %d\'s details -\n", i+1);
        printf("Enter employee name : ");
        scanf("%s",e[i].name);
        printf("Enter employee gender (M/F): ");
        scanf(" %c",&e[i].gender);
        printf("Enter employee designation : ");
        scanf("%s",e[i].designation);
        printf("Enter employee deepartment : ");
        scanf("%s",e[i].department);
        printf("Enter employee basic pay : ");
        scanf("%f",&e[i].basic);
    }

    printf("\n---------------------------------\n");

    for(int i=0; i<n; i++){
        printf("\nEmployee details -\n");
        printf("Name : %s\n", e[i].name);
        printf("Gender : %c\n",e[i].gender);
        printf("Designation : %s\n", e[i].designation);
        printf("Department : %s\n", e[i].department);
        printf("Basic Pay : %.2f\n",e[i].basic);
        printf("Gross Pay : %.2f\n\n",e[i].basic+(.25*e[i].basic)+(.75*e[i].basic));
    }


    return 0;
}