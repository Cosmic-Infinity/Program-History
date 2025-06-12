/*
Write a program to represent the given sparse matrix using header single linked list and
display it
*/

#include <stdio.h>
#include <stdlib.h>

void create(int, int, int);
typedef struct Node
{
    int i, j, n;
    struct Node *next;
} node;
typedef struct NodeHead
{
    int rows, columns, n;
    struct Node *next;
} node_head;

node_head *start;
node *last;

int main()
{
    int i, j, n, count = 0;
    start = (node_head *)malloc(sizeof(node_head));
    start->next = NULL;
    last = (node *)start;
    printf("Enter size of sparse matrix (MxN) : \n");
    scanf("%d", &start->rows);
    scanf("%d", &start->columns);
    printf("Enter elements : \n");
    for (i = 0; i < start->rows; i++)
    {
        for (j = 0; j < start->columns; j++)
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

    node *x = start->next;
    if (start)
    {
        printf("%d\t%d\t%d", start->rows, start->columns, start->n);
        printf("\n");
    }
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