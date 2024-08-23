// WAP to perform addition of two given sparse matrix in 3–tuple format.

#include <stdio.h>
#include <stdlib.h>

typedef struct Node
{
    int r, c, val;
    struct node *next;
} node;

int main()
{
    int a[5][3], b[5][3], c[10][3], i = 0, j = 0, k = 0, max = 0;
    printf("Enter matrix A (5x3 matrix) in 3 tuple format : \n");
    for (i = 0; i < 5; i++)
    {
        for (j = 0; j < 3; j++)
            scanf("%d", &a[i][j]);
    }
    printf("Enter matrix B (5x3 matrix) in 3 tuple format : \n");
    for (i = 0; i < 5; i++)
    {
        for (j = 0; j < 3; j++)
            scanf("%d", &b[i][j]);
    }

    if (!(a[0][0] == b[0][0] && a[0][1] == b[0][1]))
        return 0;
    i = 0;
    j = 0;
    k = 0;
    c[0][0] = a[0][0];
    c[0][1] = b[0][1];
    k++;
    i++;
    j++;
    while (i <= a[0][2] && j <= b[0][2])
    {
        if (a[i][0] == b[j][0])
        {
            if (a[i][1] == b[j][1])
            {
                c[k][0] = a[i][0];
                c[k][1] = b[j][1];
                c[k][2] = a[i][2] + b[j][2];
                k++;
                i++;
                j++;
            }
            else if (a[i][1] < b[j][1])
            {
                c[k][0] = a[i][0];
                c[k][1] = a[i][1];
                c[k][2] = a[i][2];
                k++;
                i++;
            }
            else
            {
                c[k][0] = b[j][0];
                c[k][1] = b[j][1];
                c[k][2] = b[j][2];
                k++;
                j++;
            }
        }
        else if (a[i][0] < b[j][0])
        {
            c[k][0] = a[i][0];
            c[k][1] = a[i][1];
            c[k][2] = a[i][2];
            k++;
            i++;
        }
        else
        {
            c[k][0] = b[j][0];
            c[k][1] = b[j][1];
            c[k][2] = b[j][2];
            k++;
            j++;
        }
    }
    while (i <= a[0][2])
    {
        c[k][0] = a[i][0];
        c[k][1] = a[i][1];
        c[k][2] = a[i][2];
        k++;
        i++;
    }
    while (j <= b[0][2])
    {
        c[k][0] = b[j][0];
        c[k][1] = b[j][1];
        c[k][2] = b[j][2];
        k++;
        j++;
    }

    printf("\nOutput : \n");

    c[0][2] = k - 1;
    for (i = 0; i < k; i++)
    {
        for (j = 0; j < 3; j++)
            printf("%d ", c[i][j]);
        printf("\n");
    }

    return 0;
}