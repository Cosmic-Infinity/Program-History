/*
Write a program to convert infix expression to postfix expression using stack.
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define SIZE 100

typedef struct Node
{
    char data;
    struct Node *next;
} node;

node *top = NULL;

void push(int);
char pop();
int isEmpty();

int main()
{
    int index = 0;
    char infix[SIZE];
    printf("Enter infix expression : ");
    fgets(infix, SIZE, stdin);
    printf("Postfix expression : ");

    int len = strlen(infix);
    if (len > 0 && infix[len - 1] == '\n')
        infix[len - 1] = ')';
    push('(');

    while (infix[index] != '\0')
    {
        char c = infix[index];
        switch (c)
        {
        case '(':
            push(c);
            break;
        case ')':
            while (top->data != '(')
                printf("%c", pop());
            pop();
            break;
        case '^':
            while (top->data == '^')
                printf("%c", pop());
            push(c);
            break;
        case '*':
        case '/':
            while (top->data == '*' || top->data == '/' || top->data == '^')
                printf("%c", pop());
            push(c);
            break;
        case '+':
        case '-':
            while (top->data == '+' || top->data == '-' || top->data == '*' || top->data == '/' || top->data == '^')
                printf("%c", pop());
            push(c);
            break;
        default:
            printf("%c", c);
            break;
        }
        index++;
    }
    while (top != NULL)
        printf("%c", pop());
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

char pop()
{
    node *temp = top;
    char x = top->data;
    top = top->next;
    free(temp);
    return x;
}
