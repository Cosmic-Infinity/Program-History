/*
Write a program to create a circular linked list and
display the elements of the list.
*/

#include <stdio.h>
#include <stdlib.h>

typedef struct Node
{
    int el;
    struct Node *next;
} node;
node *start = NULL;
node *last = NULL;

void create(int);
int main()
{
    int n, num, j = 0;
    printf("Enter no.of nodes : ");
    scanf("%d", &n);
    printf("Enter values : \n");
    while (j < n)
    {
        if (scanf("%d", &num))
        {
            create(num);
            j++;
        }
        else
        {
            printf("Invalid input detected.\n");
            printf("Rejected input. Try again.\n");
            while (getchar() != '\n')
                ;
        }
    }

    printf("Circular Linked List : \n");
    node *i = start;
    j = 0;
    while (j < n)
    {
        printf("%d -> ", i->el);
        i = i->next;
        j++;
    }
    printf("start");
    return 0;
}
void create(int n)
{
    node *ptr = (node *)malloc(sizeof(node));
    ptr->next = NULL;
    ptr->el = n;
    if (start == NULL)
    {
        start = ptr;
        last = start;
    }
    else
    {
        last->next = ptr;
        last = ptr;
    }
    last->next = start;
}