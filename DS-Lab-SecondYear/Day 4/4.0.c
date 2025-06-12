// Create and display a single linked list

#include <stdio.h>
#include <stdlib.h>

typedef struct node
{
    int el;
    struct node *next;
} node;
node *start = NULL;
node *last = NULL;

void create(int);
int main()
{
    int n;

    printf("To stop input enter any non-number value\n");
    printf("Enter integer value : \n");
    while (1)
    {
        if (scanf("%d", &n))
            create(n);
        else
        {
            printf("Invalid input detected.\n");
            printf("Stopped taking input\nLinked List : \n");
            break;
        }
    }

    node *i = start;
    while (i)
    {
        printf("%d -> ", i->el);
        i = i->next;
    }
    printf("NULL");
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
}