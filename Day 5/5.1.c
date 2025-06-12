/*
Write a program to create a double linked list and perform the following menu-based
operations on it:
i. insert an element at specific position
ii. delete an element from specific position
iii. Traverse the list
*/

#include <stdio.h>
#include <stdlib.h>

typedef struct Node
{
    int data;
    struct Node *prev, *next;
} node;

node *start = NULL, *last = NULL;

void create(int);
void insert();
void del();
void traverse();
int count();

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
            printf("Stopped taking input\n");
            break;
        }
    }
    n = 0;
    scanf("%c");
    printf("Linked list generated successfully.\n");
    printf("-----MENU-----\n1.Insert at specific position.\n2.Delete from specific position.\n3.Traverse the list.\n4.Exit");
    while (1)
    {
        printf("\nEnter choice : ");
        scanf("%d", &n);

        switch (n)
        {
        case 1:
            insert();
            break;
        case 2:
            del();
            break;
        case 3:
            traverse();
            break;
        case 4:
            return 0;
        default:
            printf("INVALID choice.");
        }
    }

    return 0;
}

void create(int n)
{
    node *ptr = (node *)malloc(sizeof(node));
    ptr->next = NULL;
    ptr->prev = NULL;
    ptr->data = n;
    if (start == NULL)
        start = last = ptr;
    else
    {
        last->next = ptr;
        ptr->prev = last;
        last = last->next;
    }
}

void insert()
{
    int pos;
    printf("Enter insertion index : ");
    scanf("%d", &pos);
    if (pos > count() || pos < 0)
    {
        printf("Invalid position");
        return;
    }
    else
    {
        node *ptr = (node *)malloc(sizeof(node));
        printf("Enter value : ");
        scanf("%d", &ptr->data);
        ptr->prev = ptr->next = NULL;
        if (pos == 0)
        {
            ptr->next = start;
            start->prev = ptr;
            start = ptr;
        }
        else if (pos == count())
        {
            last->next = ptr;
            ptr->prev = last;
            last = ptr;
        }
        else
        {
            int i = 0;
            node *temp = start;
            while (i < pos - 1)
            {
                temp = temp->next;
                i++;
            }
            ptr->next = temp->next;
            ptr->prev = temp;
            temp->next = ptr;
            ptr->next->prev = ptr;
        }
        printf("Insertion Successful");
    }
}
void del()
{
    int pos;
    if (start == NULL)
    {
        printf("List is empty already!");
        return;
    }
    printf("Enter deletion index : ");
    scanf("%d", &pos);
    if (pos > count() - 1 || pos < 0)
    {
        printf("Invalid position");
        return;
    }
    else
    {
        if (pos == 0)
        {
            node *temp = start;
            temp = temp->next;
            free(start);
            start = temp;
            start->prev = NULL;
        }
        else if (pos == count() - 1)
        {
            node *temp = last;
            last = last->prev;
            last->next = NULL;
            free(temp);
        }
        else
        {
            int i = 0;
            node *temp = start;
            while (i < pos)
            {
                temp = temp->next;
                i++;
            }
            (temp->next)->prev = temp->prev;
            (temp->prev)->next = temp->next;
            free(temp);
        }
    }
    printf("Deletion Successful");
}

void traverse()
{
    node *i = start;
    printf("Forward : \n");
    while (i)
    {
        printf("%d -> ", i->data);
        i = i->next;
    }
    printf("NULL");
    printf("\nBackward : \n");
    i = last;
    while (i)
    {
        printf("%d -> ", i->data);
        i = i->prev;
    }
    printf("NULL");
}
int count()
{
    int count = 0;
    node *i = start;
    while (i)
    {
        count++;
        i = i->next;
    }
    return count;
}