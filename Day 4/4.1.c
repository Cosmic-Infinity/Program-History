/*Write a program to create a single linked list of n nodes and perform the following menu-
based operations on it using function:
i. Insert a node at specific position
ii. Deletion of an element from specific position
iii. Count nodes
iv. Traverse the linked list*/

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
void insert();
void del();
int count();
void traverse();
int main()
{
    int n, f;

    printf("To stop input enter any non-number value\n");
    printf("Enter integer value : \n");
    while (1)
    {
        int check = scanf("%d", &n);
        if (check)
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
    printf("-----MENU-----\n1.Insert at specific position.\n2.Delete from specific position.\n3.Count the nodes\n4.Traverse the list.\n5.Exit");
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
            printf("No. of Nodes : %d\n", count());
            break;
        case 4:
            traverse();
            break;
        case 5:
            return 0;
            break;
        default:
            printf("INVALID choice.");
        }
    }
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
        scanf("%d", &ptr->el);
        ptr->next = NULL;
        if (pos == 0)
        {
            ptr->next = start;
            start = ptr;
        }
        else if (pos == count() - 1)
        {
            last->next = ptr;
            last = ptr;
        }
        else
        {
            int i = 0;
            node *temp;
            temp = start;
            while (i < pos - 1)
            {
                temp = temp->next;
                i++;
            }
            ptr->next = temp->next;
            temp->next = ptr;
        }
    }
    printf("Inserted!");
    return;
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
    if (pos > count() || pos < 0)
        printf("Invalid position");
    else
    {
        if (pos == 0)
        {
            node *temp = start;
            temp = temp->next;
            free(start);
            start = temp;
        }
        else
        {
            int i = 0;
            node *temp;
            temp = start;
            while (i < pos - 1)
            {
                temp = temp->next;
                i++;
            }
            node *temp2 = temp->next;
            temp->next = temp2->next;
            free(temp2);
        }
    }
    printf("Deleted!");
    return;
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

void traverse()
{
    printf("Current linked list : \n");
    node *i = start;
    while (i)
    {
        printf("%d -> ", i->el);
        i = i->next;
    }
    printf("NULL\n");
    return;
}