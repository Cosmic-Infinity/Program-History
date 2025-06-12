/*Delete all even elements from a 1D array*/

#include <stdio.h>
#include <stdlib.h>

void delete(int *, int, int);

int main()
{
    int n, i, count = 0, *a;
    printf("Enter size of array : ");
    scanf("%d", &n);
    a = (int *)malloc(n * sizeof(int));
    printf("Enter %d elements in the array : \n", n);
    for (i = 0; i < n; i++)
        scanf("%d", &a[i]);

    for (int i = 0; i < n;)
    {
        if (a[i] % 2 == 0)
        {
            delete (a, n, i);
            count++;
        }
        else
            i++;
    }
    count = n - count;
    printf("Deleted all even numbers : \n");
    for (i = 0; i < count; i++)
        printf("%d ", a[i]);

    return 0;
}

void delete(int *a, int n, int pos)
{
    for (int i = pos; i < n - 1; i++)
        a[i] = a[i + 1];
    a[n - 1] = -999;
}