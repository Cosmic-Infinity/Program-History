/*
In addition to 4.1, perform following operations using function on the single linked list:
i. search an element in the list
ii. sort the list in ascending order
iii. reverse the list
*/

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
void search();
void sort();
void reverse();

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
    printf("-----MENU-----\n1.Insert.\n2.Delete.\n3.Count\n4.Traverse.\n5.Search.\n6.Sort (Ascending)\n7.Reverse.\n8.Exit");
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
            search();
            break;
        case 6:
            sort();
            break;
        case 7:
            reverse();
            break;
        case 8:
            return 0;
            break;
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
        ptr->next = NULL;
        printf("Enter value : ");
        scanf("%d", &ptr->el);
        if (pos == 0)
        {
            ptr->next = start;
            start = ptr;
        }
        else if (pos == count())
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
            printf("Deleted!");
        }
    }

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

void search()
{
    int n, j = 0, c = count();
    if (c == 0)
    {
        printf("List Empty");
        return;
    }
    else
    {

        printf("Enter number to search : \n");
        scanf("%d", &n);
        node *i = start;
        while (i)
        {
            if (i->el == n)
            {
                printf("Found %d at index %d", n, j);
                break;
            }
            i = i->next;
            j++;
        }
        if (i == NULL)
            printf("NOT Found");
        return;
    }
}

void sort()
{
    int n = count(), i, j;
    node *block, *nextBlock;
    if (n == 0)
    {
        printf("List Empty");
        return;
    }
    else if (n == 1)
        ;
    else
    {

        for (i = 0; i < n; i++)
        {
            block = start;
            for (j = i + 1; j < n; j++)
            {
                nextBlock = block->next;
                if (nextBlock != NULL && block->el > (block->next)->el)
                {
                    int temp = block->el;
                    block->el = (nextBlock)->el;
                    (nextBlock)->el = temp;
                }
                block = block->next;
            }
        }
    }
    printf("Sorted in Ascending order");
}

void reverse()
{
    node *i, *prev, *prev1;
    int c = count();
    if (c == 0)
    {
        printf("List Empty");
        return;
    }
    else if (c == 1)
        ;
    else if (c == 2)
    {
        node *temp = last;
        last = start;
        start = temp;
        last->next = NULL;
        start->next = last;
    }
    else
    {
        prev1 = start;
        prev = prev1->next;
        i = prev->next;
        while (i)
        {
            prev->next = prev1;
            prev1 = prev;
            prev = i;
            i = i->next;
        }
        prev->next = prev1;
        last = start;
        last->next = NULL;
        start = prev;
    }
    printf("Reversed successfully");
}