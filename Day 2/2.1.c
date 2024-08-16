/*WAP to create a 1-D array of n elements and perform the following menu based operations
using function.
a. insert a given element at specific position.
b. delete an element from a specific position of the array.
c. linear search to search an element
d. traversal of the array*/

#include <stdio.h>
#include <stdlib.h>

void insert(int *, int);
void delete(int *, int);
void search(int *, int);
void travel(int *, int);

int main()
{
    int i, n, choice, *a;

    printf("Enter array size : ");
    scanf("%d", &n);
    a = (int *)malloc(n * sizeof(int));
    printf("Enter %d elements for array: \n", n);
    for (i = 0; i < n; i++)
        scanf("%d", &a[i]);
    printf("----Menu----\n1.Insert element at an index\n2.Delete element at an index\n3.Linear search for an element\n4.Traverse/Print\n5. Exit\n");

    while (1)
    {
        printf("Enter choice : ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            insert(a, n);
            break;
        case 2:
            delete (a, n);
            break;
        case 3:
            search(a, n);
            break;
        case 4:
            travel(a, n);
            break;
        case 5:
            return 0;
        default:
            printf("INVALID choice");
        }
    }
}
void insert(int *a, int n)
{
    int pos, el;
    if (a[n - 1] != 0)
    {
        printf("\nArray is FULL\n");
        return;
    }
    else
    {
        printf("Enter insertion index : ");
        scanf("%d", &pos);
        printf("Enter value : ");
        scanf("%d", &el);
        for (int i = n - 1; i >= pos; i--)
            a[i] = a[i - 1];
        a[pos] = el;
    }
    printf("\nFinished insertion.\n");
}
void delete(int *a, int n)
{
    int pos;
    if (a[0] == 0)
    {
        printf("\nArray is EMPTY\n");
        return;
    }
    else
    {
        printf("Enter deletion index : ");
        scanf("%d", &pos);
        for (int i = pos; i < n - 1; i++)
            a[i] = a[i + 1];
        a[n - 1] = 0;
    }
    printf("\nFinished deletion.\n");
}
void search(int *a, int n)
{
    int el;
    if (a[0] == 0)
    {
        printf("\nArray is EMPTY\n");
        return;
    }
    else
    {
        printf("Enter element to search : ");
        scanf("%d", &el);
        for (int i = 0; i < n; i++)
        {
            if (a[i] == el)
            {
                printf("\nFound %d at index %d\n", el, i);
                return;
            }
        }
        printf("\n%d not found in the array\n", el);
    }
}
void travel(int *a, int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
    printf("\nArray printed\n");
}