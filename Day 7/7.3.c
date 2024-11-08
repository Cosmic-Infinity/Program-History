/*
Write a menu driven program to implement circular queue operations such as Enqueue,
Dequeue, Traverse, IsEmpty, IsFull using array.
*/
#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
#define size 3

void enqueue(int);
int dequeue();
int isEmpty();
int isFull();
void traverse();

int Q[size], front = -1, rear = -1;

int main()
{
    printf("Enter only integers to generate queue. \nEnter non-number to stop taking input :\n");
    int n;
    while (1)
    {
        if (isFull())
            break;
        else if (scanf("%d", &n))
            enqueue(n);
        else
        {
            printf("Invalid Input detected. Queue generated.\n");
            while (getchar() != '\n')
                ;
            break;
        }
    }
    int choice;
    printf("-----MENU-----\n1.Enqueue\n2.Dequeue\n3.isEmpty\n4.isFull\n5.Traverse\n6.Exit\n--------------\n");
    while (1)
    {
        printf("Enter choice : ");
        if (!scanf("%d", &choice))
        {
            printf("Enter only integers");
            continue;
        }
        switch (choice)
        {
        case 1:
            if (!isFull())
            {
                printf("Enter value : ");
                scanf("%d", &n);
                enqueue(n);
            }
            else
                printf("Queue is FULL already.\n");
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
            printf(isFull() ? "isFull : True\n" : "isFull : False\n");
            break;
        case 5:
            traverse();
            break;
        case 6:
            return 0;
        default:
            printf("Invalid Choice\n");
            break;
        }
    }

    return 0;
}

void enqueue(int n)
{
    if (isFull())
        printf("Queue is FULL\n");
    else if (front == -1)
    {
        front = rear = 0;
        Q[rear] = n;
    }
    else
    {
        rear = (rear + 1) % size;
        Q[rear] = n;
    }
}

int dequeue()
{
    int x;
    if (isEmpty())
    {
        printf("Queue is Empty\n");
        return INT_MAX;
    }
    else if (front == rear)
    {
        x = Q[front];
        front = rear = -1;
    }
    else
    {
        x = Q[front];
        front = (front + 1) % size;
    }
    return x;
}

int isEmpty()
{
    return (front == -1);
}

int isFull()
{
    return ((rear + 1) % size == front);
}

void traverse()
{
    if (isEmpty())
    {
        printf("Queue is Empty\n");
        return;
    }
    printf("Current Queue is :\nFRONT->");
    for (int i = front; i != rear; i = (i + 1) % size)
        printf("%d->", Q[i]);
    printf("%d->REAR\n", Q[rear]);
}