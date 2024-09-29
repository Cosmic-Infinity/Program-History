/*
Write a menu driven program to implement linear queue operations such as Enqueue,
Dequeue, IsEmpty, Traverse using single linked list.
*/

#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

void enqueue(int);
int dequeue();
int isEmpty();
int isFull();
void traverse();

typedef struct Node
{
    int data;
    struct Node *next;
} node;

node *front = NULL, *rear = NULL;

int main()
{
    int choice, n;
    printf("Enter only integers to generate queue. \nEnter non-number to stop taking input :\n");
    while (1)
    {
        if (scanf("%d", &n))
            enqueue(n);
        else
        {
            printf("Invalid Input detected. Queue generated.\n");
            while (getchar() != '\n')
                ;
            break;
        }
    }
    printf("-----MENU-----\n1.Enqueue\n2.Dequeue\n3.isEmpty\n4.Traverse\n5.Exit\n--------------\n");
    while (1)
    {
        printf("Enter choice : ");
        if (scanf("%d", &choice))
            ;
        else
        {
            printf("Enter only integers");
            continue;
        }
        switch (choice)
        {
        case 1:
            printf("Enter value : ");
            if (scanf("%d", &n))
                enqueue(n);
            else
                printf("Invalid value. REJECTED.\n");
            break;
        case 2:
            n = dequeue();
            if (n != INT_MAX)
                printf("Dequeued value : %d\n", n);
            break;
        case 3:
            printf(isEmpty() ? "isEmpty : True\n" : "isEmpty : False\n");
            break;
        case 4:
            traverse();
            break;
        case 5:
            return 0;
        default:
            printf("Invalid Choice");
            break;
        }
    }

    return 0;
}

void enqueue(int n)
{
    node *ptr = (node *)malloc(sizeof(node));
    ptr->data = n;
    ptr->next = NULL;
    if (front == NULL)
        front = rear = ptr;
    else
    {
        rear->next = ptr;
        rear = rear->next;
    }
    printf("Enqueues!");
}

int dequeue()
{
    int x = INT_MAX;
    if (isEmpty())
        printf("Queue is Empty\n");
    else if (front == rear)
    {
        x = front->data;
        front = rear = NULL;
    }
    else
    {
        node *temp = front;
        x = front->data;
        front = front->next;
        free(temp);
    }
    return x;
}

int isEmpty()
{
    return (front == NULL);
}

void traverse()
{
    printf("Current Queue is :\nFRONT->");
    node *i = front;
    while (i)
    {
        printf("%d->", i->data);
        i = i->next;
    }
    printf("REAR\n");
}