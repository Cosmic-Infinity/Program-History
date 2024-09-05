/*
Write a program to represent the given sparse matrix using header single linked list and
display it
*/

// WAP to perform transpose of a given sparse matrix in 3-tuple format

#include <stdio.h>
#include <stdlib.h>

void create(int, int, int);
typedef struct Node
{
    int i, j, n;
    struct Node *next;
} node;
node *start = NULL, *last = NULL;

int main()
{
    int i, j, n, count = 0;
    start = (node *)malloc(sizeof(node));
    start->next = NULL;
    last = start;
    printf("Enter size of sparse matrix (MxN) : \n");
    scanf("%d", &start->i);
    scanf("%d", &start->j);

    for (i = 0; i < start->i; i++)
    {
        for (j = 0; j < start->j; j++)
        {
            scanf("%d", &n);
            if (n != 0)
            {
                count++;
                create(i, j, n);
            }
        }
    }
    start->n = count;

    printf("Output : \n");

    node *x = start;
    while (x)
    {
        printf("%d\t%d\t%d", x->i, x->j, x->n);
        printf("\n");
        x = x->next;
    }

    return 0;
}

void create(int i, int j, int n)
{
    node *ptr = (node *)malloc(sizeof(node));
    ptr->next = NULL;
    ptr->i = i;
    ptr->j = j;
    ptr->n = n;
    last->next = ptr;
    last = ptr;
}