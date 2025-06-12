// Write a C program to create an array of n elements using dynamic memory allocation
// calculate the sum of all the prime elements of this array using funciton
// and deallocate the memory of this array after its use.

#include <stdio.h>
#include <stdlib.h>

int sum_of_prime(int *, int);
int main()
{
    int n, i, *arr;
    printf("Enter size of array : ");
    scanf("%d", &n);
    arr = (int *)malloc(n * sizeof(int));
    printf("Enter %d elements : \n", n);
    for (i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    printf("Sum of prime elements : %d", sum_of_prime(arr, n));
    free(arr);
    return 0;
}

int sum_of_prime(int *arr, int n)
{
    int sum = 0, f, count;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == 1)
            continue;
        f = 0, count = 0;
        for (int j = 2; j <= arr[i]; j++)
        {
            if (arr[i] % j == 0)
                count++;
            if (count > 1)
            {
                f = 1;
                break;
            }
        }
        if (f == 0)
            sum += arr[i];
    }
    return (sum);
}