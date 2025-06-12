//  Write a C program to create a structure to store the information of n number of employees.
//  Employee information includes data members as -
//  Employee ID, Name, Designation, Basic salary, HRA (12% of basic), DA (50% of basic),
//  then display the information the employees with gross salary. [array of structure]

#include <stdio.h>
#include <stdlib.h>

typedef struct info
{
    char name[32];
    char desig[32];
    double basic, hra, da;
    int id;

} employee;

int main()
{

    int n, i;
    printf("Enter number of employee : ");
    scanf("%d", &n);
    employee group[n];
    printf("\n--------------------------------------\n");
    for (i = 0; i < n; i++)
    {
        printf("Enter detail of employee %d \n", i + 1);
        printf("Enter ID : ");
        scanf("%d", &group[i].id);
        printf("Enter name : ");
        gets(group[i].name);
        // scanf("%s", &group[i].name); // skipping
        // scanf("%s", &group[i].name);
        printf("Enter designation : ");
        scanf("%s", &group[i].desig);
        printf("Enter Basic Salary : ");
        scanf("%lf", &group[i].basic);
        group[i].hra = group[i].basic * 0.12;
        group[i].da = group[i].basic * 0.5;
        printf("--------------------------------------\n");
    }

    printf("---------------Results----------------\n");

    for (i = 0; i < n; i++)
    {
        printf("Employee ID : %d\n", group[i].id);
        printf("Name : %s\n", group[i].name);
        printf("Designation : %s\n", group[i].desig);
        printf("Basic Salary : %.2lf\n", group[i].basic);
        printf("Gross Salary : %.2lf\n", group[i].basic + group[i].hra + group[i].da);
        printf("----------------------------------------\n");
    }

    return 0;
}