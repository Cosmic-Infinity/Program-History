/*
Write a menu driven program to create a stack using linked list and perform the following
operation using function
a. Push
b. Pop
c. IsEmpty
d. display the stack elements
*/

#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

typedef struct Node
{
    int data;
    struct Node *next;
} node;

node *top = NULL;

void push(int);
int pop();
int isEmpty();
void display();

int main()
{
    int choice, val;
    printf("-----Menu-----\n1.Push\n2.Pop\n3.Check isEmpty\n4.Display\n5.Exit\n");
    while (1)
    {
        printf("\nEnter choice : ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("Element to be pushed : ");
            scanf("%d", &val);
            push(val);
            break;
        case 2:
        {
            int x = pop();
            if (x != INT_MAX)
                printf("%d popped from stack.\n", x);
            break;
        }
        case 3:
            printf(isEmpty() ? "isEmpty : TRUE\n" : "isEmpty : FALSE\n");
            break;
        case 4:
            printf("Current Stack : \nTOP -> ");
            display();
            printf(" BOTTOM");
            break;
        case 5:
            return 0;
        default:
            printf("INVALID input.");
            break;
        }
    }
    return 0;
}

void push(int val)
{
    node *ptr = (node *)malloc(sizeof(node));
    ptr->data = val;
    ptr->next = NULL;
    if (top == NULL)
        top = ptr;
    else
    {
        ptr->next = top;
        top = ptr;
    }
}

int pop()
{
    if (isEmpty())
    {
        printf("Underflow");
        return INT_MAX;
    }
    else
    {
        node *temp = top;
        int x = top->data;
        top = top->next;
        free(temp);
        return x;
    }
}

int isEmpty()
{
    return (top == NULL);
}

void display()
{
    if (top == NULL)
        printf("EMPTY ->");
    else
    {
        node *i = top;
        while (i)
        {
            printf("%d -> ", i->data);
            i = i->next;
        }
    }
}
