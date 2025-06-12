/*WAP to represent a given sparse matrix in 3-tuple format using 2-D array.*/

#include <stdio.h>
#include <stdlib.h>

void sparse(int **, int, int, int);

int main()
{
    int m, n, i, j, count = 0, **arr;
    printf("Enter dimension of matrix (row column) : ");
    scanf("%d", &m);
    scanf("%d", &n);
    arr = (int **)malloc(m * sizeof(int *));
    for (i = 0; i < m; i++)
        arr[i] = (int *)malloc(n * sizeof(int));

    printf("Enter %dx%d elements in the array : \n", m, n);
    for (i = 0; i < m; i++)
    {
        for (j = 0; j < n; j++)
        {
            scanf("%d", &arr[i][j]);
            if (arr[i][j] != 0)
                count++;
        }
    }
    sparse(arr, m, n, count);
    return 0;
}

void sparse(int **arr, int m, int n, int count)
{

    int a[++count][3], i, j, k = 0;
    a[k][0] = m;
    a[k][1] = n;
    a[k++][2] = count - 1;

    for (i = 0; i < m; i++)
    {
        for (j = 0; j < n; j++)
        {
            if (arr[i][j] != 0)
            {
                a[k][0] = i;
                a[k][1] = j;
                a[k++][2] = arr[i][j];
            }
        }
    }

    printf("\nOutput : \n");
    for (i = 0; i < count; i++)
    {
        for (j = 0; j < 3; j++)
            printf("%d ", a[i][j]);
        printf("\n");
    }
}