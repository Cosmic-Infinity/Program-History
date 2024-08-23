// WAP to perform transpose of a given sparse matrix in 3-tuple format

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a[7][3], b[7][3], i, j, k = 1;
    printf("Enter a 5x3 matrix in 3 tuple format : \n");
    for (i = 0; i < 6; i++)
    {
        for (j = 0; j < 3; j++)
            scanf("%d", &a[i][j]);
    }

    // printf("Taken data :\n");

    // for (i = 0; i <= a[0][2]; i++)
    // {
    //     for (j = 0; j < 3; j++)
    //         printf("%d ", a[i][j]);
    //     printf("\n");
    // }

    for (i = 0; i <= a[0][2]; i++)
    {
        for (j = 1; j <= a[0][2]; j++)
        {
            if (a[j][1] == i)
            {
                b[k][0] = a[j][1];
                b[k][1] = a[j][0];
                b[k][2] = a[j][2];
                k++;
            }
            if (b[j][0] == b[j + 1][0])
            {
                if (b[j][1] > b[j + 1][1])
                {
                    int temp1 = b[j][0];
                    int temp2 = b[j][1];
                    int temp3 = b[j][2];
                    b[j][0] = b[j + 1][0];
                    b[j][1] = b[j + 1][1];
                    b[j][2] = b[j + 1][2];
                    b[j + 1][0] = temp1;
                    b[j + 1][1] = temp2;
                    b[j + 1][2] = temp3;
                }
            }
        }
    }

    // for (i = 0; i < a[0][2]; i++)
    // {
    //     for (j = 1; j < a[0][2]; j++)
    //     {
    //         if (b[j][0] == b[j + 1][0])
    //         {
    //             if (b[j][1] > b[j + 1][1])
    //             {
    //                 int temp1 = b[j][0];
    //                 int temp2 = b[j][1];
    //                 int temp3 = b[j][2];
    //                 b[j][0] = b[j + 1][0];
    //                 b[j][1] = b[j + 1][1];
    //                 b[j][2] = b[j + 1][2];
    //                 b[j + 1][0] = temp1;
    //                 b[j + 1][1] = temp2;
    //                 b[j + 1][2] = temp3;
    //             }
    //         }
    //     }
    // }

    b[0][0] = a[0][1];
    b[0][1] = a[0][0];
    b[0][2] = a[0][2];

    printf("Output : \n");

    for (i = 0; i < 6; i++)
    {
        for (j = 0; j < 3; j++)
            printf("%d\t", b[i][j]);
        printf("\n");
    }

    return 0;
}