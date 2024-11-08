/*
Write a menu driven program to create a stack using array and perform the following
operation using function
a. Push
b. Pop
c. check stack is empty or not
d. check stack is full or not
e. display stack elements

*/

#include <stdio.h>
// #include <locale.h>
#define SIZE 10

void push(int);
int pop();
int isEmpty();
int isFull();
void display();

int top = -1;
int a[SIZE];
int main()
{
    int choice, val;
    printf("-----Menu-----\n1.Push\n2.Pop\n3.Check isEmpty\n4.Check isFull\n5.Display\n6.Exit\n");
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
            if (x != -99999)
                printf("%d popped from stack.\n", x);
            break;
        }
        case 3:
            printf(isEmpty() ? "isEmpty : TRUE\n" : "isEmpty : FALSE\n");
            break;
        case 4:
            printf(isFull() ? "isFull : TRUE\n" : "isFull : FALSE\n");
            break;
        case 5:
            printf("Current Stack : \nTop -> ");
            display();
            printf("Bottom\n");
            break;
        case 6:
            return 0;
        default:
            printf("INVALID input.\n");
            break;
        }
    }
    return 0;
}

void push(int val)
{
    if (top == SIZE - 1)
        printf("Overflow");
    else
        a[++top] = val;
}

int pop()
{
    if (top == -1)
    {
        printf("Underflow");
        return -99999;
    }
    else
        return (a[top--]);
}

int isEmpty()
{
    return (top == -1);
}
int isFull()
{
    return (top == SIZE - 1);
}

void display()
{
    if (top == -1)
        printf("EMPTY ->");
    else
    {
        for (int i = top; i > -1; i--)
            printf("%d -> ", a[i]);
    }
}