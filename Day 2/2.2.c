/*Write a program to perform the following operations on a given square matrix using
functions:
i. Find the no.of nonzero elements
ii. Display upper triangular matrix
iii. Display the elements of just above and below the main diagonal*/

#include <stdio.h>
#include <stdlib.h>

void nzero(int **, int);
void uptrng(int **, int);
void nomaindiag(int **, int);

int main()
{
    int i, j, n, choice, **a;

    printf("Enter no. of rows of square matrix : ");
    scanf("%d", &n);
    a = (int **)malloc(n * sizeof(int *));
    for (i = 0; i < n; i++)
        a[i] = (int *)malloc(n * sizeof(int));

    printf("Enter %d elements for array: \n", n * n);
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
            scanf("%d", &a[i][j]);
    }
    printf("----Menu----\n1.No. of non-zero element\n2.Display upper triangle\n3.Elements just above and below principal diagonal\n4.Exit\n");

    while (1)
    {
        printf("Enter choice : ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            nzero(a, n);
            break;
        case 2:
            uptrng(a, n);
            break;
        case 3:
            nomaindiag(a, n);
            break;
        case 4:
            return 0;
        default:
            printf("INVALID choice\n");
        }
    }
}
void nzero(int **a, int n)
{
    int count = 0, i, j;
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            if (a[i][j] != 0)
                count++;
        }
    }
    printf("No. of non zero element : %d\n", count);
}

void uptrng(int **a, int n)
{
    int i, j;
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            if (j >= i)
                printf("%d\t", a[i][j]);
            else
                printf("\t");
        }
        printf("\n");
    }
    printf("\nFinished upper triangular.\n");
}
void nomaindiag(int **a, int n)
{
    int i, j;
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            if (i != j)
                printf("%d\t", a[i][j]);
            else
                printf("\t");
        }
        printf("\n");
    }
    printf("\nFinished No main diagonal.\n");
}