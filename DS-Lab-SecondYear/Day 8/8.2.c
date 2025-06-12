/*can come in exam*/

/*Write a menu driven program to implement priority queue operations such as Enqueue,
Dequeue, Traverse using linked list.*/

#include <stdio.h>
#include <stdlib.h>

void enqueue();
void dequeue();
void traverse();

typedef struct Node
{
    struct Node *prev;
    struct Node *next;
    int data;
    int priority;
} node;

node *front = NULL, *rear = NULL;

int main()
{
    printf("Priority Queue\n");
    int choice = 0;
    printf("-------MENU-------\n1. Enqueue\n2. Dequeue\n3. Traverse\n4. Exit\n");
    while (1)
    {
        printf("Enter choice : ");
        if (!scanf("%d", &choice))
        {
            printf("Enter only NUMBERS\n");
            while (getchar() != '\n')
                ;
        }
        else
        {
            switch (choice)
            {
            case 1:
                enqueue();
                break;
            case 2:
                dequeue();
                break;
            case 3:
                traverse();
                break;
            case 4:
                return 0;
            default:
                printf("Invalid choice\n");
            }
        }
    }
}

void enqueue()
{
    int data, priority;
    node *ptr = (node *)malloc(sizeof(node));
    printf("Enter data : ");
    scanf("%d", &ptr->data);
    printf("Enter priority : ");
    scanf("%d", &ptr->priority);
    ptr->next = NULL;
    ptr->prev = NULL;
    if (front == NULL)
        front = rear = ptr;
    else
    {
        node *temp = rear;
        while (temp != NULL && ptr->priority < temp->priority)
        {
            temp = temp->prev;
        }
        if (temp == NULL)
        {
            ptr->next = front;
            front->prev = ptr;
            front = ptr;
        }
        else if (temp == rear)
        {
            rear->next = ptr;
            ptr->prev = rear;
            rear = ptr;
        }
        else
        {
            ptr->next = temp->next;
            ptr->prev = temp;
            temp->next->prev = ptr;
            temp->next = ptr;
        }
    }
}

void dequeue()
{
    if (front == NULL)
    {
        printf("Queue is empty\n");
        return;
    }
    printf("Dequeued data: %d\n", front->data);
    node *temp = front;
    front = front->next;
    if (front != NULL)
        front->prev = NULL;
    else
        rear = NULL;
    free(temp);
}

void traverse()
{
    if (front == NULL)
    {
        printf("Queue is empty\n");
        return;
    }
    printf("Front -> ");
    for (node *i = front; i; i = i->next)
        printf("%d -> ", i->data);
    printf("Rear\n");
}
