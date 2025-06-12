// Write a C program to read 2 integer numbers
// and compare the numbers using function with call by address mechanism.

#include <stdio.h>

int comp(int *, int *);
int main()
{

    int a, b;
    printf("Enter 2 integers : \n");
    scanf("%d", &a);
    scanf("%d", &b);
    printf(comp(&a, &b) ? "Same" : "Different");
    return 0;
}

int comp(int *a, int *b)
{
    return (*a == *b);
}