/*
Write a menu driven program to implement Deques (both Inputrestricted and output-restricted)
and performed operations such as Enqueue, Dequeue, Peek, IsEmpty, IsFull using
static array
*/

// #include <stdio.h>
// #include <stdlib.h>
// #define SIZE 10

// int Q[10], front = -1, rear = -1;

// void insert_rear();
// void insert_front();
// void delete_rear();
// void delete_front();
// void display();
// int isFull();
// int isEmpty();

// int main()
// {
//     int choice1 = 0, choice2 = 0;
//     printf("Enter choice\n1 = Input-Restricted\n2 = Output-Restricted\n");
//     if (!scanf("%d", &choice1))
//         printf("Enter only NUMBERS");
//     else
//     {
//         if (choice1 == 1)
//         {
//             printf("---Input-Restricted Deque Menu---\n1. Insert at REAR\n2. Delete from FRONT\n3. Delete from REAR\n4. Display\n5. Quit\n");
//             while (1)
//             {
//                 printf("Enter Choice : ");
//                 choice2 = 0;
//                 if (scanf("%d", &choice2))
//                 {
//                     switch (choice2)
//                     {
//                     case 1:
//                         insert_rear();
//                         break;
//                     case 2:
//                         delete_front();
//                         break;
//                     case 3:
//                         delete_rear();
//                         break;
//                     case 4:
//                         display();
//                         break;
//                     case 5:
//                         return 0;
//                     }
//                 }
//                 else
//                 {
//                     printf("Enter only NUMBERS");
//                     while (getchar() != '\n')
//                         ;
//                 }
//             }
//         }
//         else if (choice1 == 2)
//         {
//             printf("---Output-Restricted Deque Menu---\n1. Insert at REAR\n2. Insert at FRONT\n3. Delete from FRONT\n4. Display\n5. Quit\n");
//             while (1)
//             {
//                 printf("Enter choice : ");
//                 choice2 = 0;
//                 if (scanf("%d", &choice2))
//                 {
//                     switch (choice2)
//                     {
//                     case 1:
//                         insert_rear();
//                         break;
//                     case 2:
//                         insert_front();
//                         break;
//                     case 3:
//                         delete_front();
//                         break;
//                     case 4:
//                         display();
//                         break;
//                     case 5:
//                         return 0;
//                     }
//                 }
//                 else
//                 {
//                     printf("Enter only NUMBERS");
//                     while (getchar() != '\n')
//                         ;
//                 }
//             }
//         }
//         else
//             printf("INVALID choice");
//     }
//     return 0;
// }

// void insert_rear()
// {
//     int n;
//     if (isFull())
//     {
//         printf("Queue is FULL\n");
//         return;
//     }
//     else
//     {
//         printf("Enter number  : ");
//         scanf("%d", &n);
//         if (isEmpty())
//         {
//             front = rear = 0;
//             Q[rear] = n;
//         }
//         else
//         {
//             rear++;
//             Q[rear] = n;
//         }
//     }
// }

// void insert_front()
// {
//     int n;
//     if (front == 0)
//     {
//         printf("No Space in available in front.\n");
//         return;
//     }
//     else
//     {
//         printf("Enter number  : ");
//         scanf("%d", &n);
//         if (isEmpty())
//         {
//             front = rear = 0;
//             Q[front] = n;
//         }
//         else
//         {
//             front--;
//             Q[front] = n;
//         }
//     }
// }

// void delete_rear()
// {
//     if (isEmpty())
//     {
//         printf("Queue is Empty\n");
//         return;
//     }
//     else
//     {
//         if (rear - 1 < front)
//         {
//             printf("Dequeued : %d", Q[rear]);
//             front = rear = -1;
//         }
//         else
//         {
//             printf("Dequeued : %d", Q[rear]);
//             --rear;
//         }
//     }
// }
// void delete_front()
// {
//     if (isEmpty())
//     {
//         printf("Queue is Empty\n");
//         return;
//     }
//     else
//     {
//         if (front + 1 > rear)
//         {
//             printf("Dequeued : %d", Q[front]);
//             front = rear = -1;
//         }
//         else
//         {
//             printf("Dequeued : %d", Q[front]);
//             front++;
//         }
//     }
// }

// void display()
// {
//     printf("FRONT -> ");
//     for (int i = front; i <= rear; i++)
//         printf("%d -> ", Q[i]);
//     printf("REAR\n");
// }

// int isEmpty()
// {
//     return (front == -1);
// }

// int isFull()
// {
//     return (rear == (SIZE - 1));
// }
#include <stdio.h>
#include <stdlib.h>
#define SIZE 10

int Q[SIZE], front = -1, rear = -1;

void insert_rear();
void insert_front();
void delete_rear();
void delete_front();
void display();
int peek_front();
int peek_rear();
int isFull();
int isEmpty();

int main()
{
    int choice1 = 0, choice2 = 0;
    printf("Enter choice\n1 = Input-Restricted\n2 = Output-Restricted\n");
    if (scanf("%d", &choice1) != 1)
    {
        printf("Enter only NUMBERS\n");
        return 1;
    }

    if (choice1 == 1)
        printf("---Input-Restricted Deque Menu---\n1. Insert at REAR\n2. Delete from FRONT\n3. Delete from REAR\n4. Display\n5. Peek Front\n6. Peek Rear\n7. Quit\n");
    else if (choice1 == 2)
        printf("---Output-Restricted Deque Menu---\n1. Insert at REAR\n2. Insert at FRONT\n3. Delete from FRONT\n4. Display\n5. Peek Front\n6. Peek Rear\n7. Quit\n");
    else
    {
        printf("INVALID choice\n");
        return 1;
    }

    while (1)
    {
        printf("Enter choice : ");
        if (scanf("%d", &choice2) != 1)
        {
            printf("Enter only NUMBERS\n");
            while (getchar() != '\n')
                ;
            continue;
        }

        switch (choice2)
        {
        case 1:
            insert_rear();
            break;
        case 2:
            if (choice1 == 1)
                delete_front();
            else
                insert_front();
            break;
        case 3:
            if (choice1 == 1)
                delete_rear();
            else
                delete_front();
            break;
        case 4:
            display();
            break;
        case 5:
            if (!isEmpty())
                printf("Front element: %d\n", peek_front());
            else
                printf("Queue is Empty\n");
            break;
        case 6:
            if (!isEmpty())
                printf("Rear element: %d\n", peek_rear());
            else
                printf("Queue is Empty\n");
            break;
        case 7:
            return 0;
        default:
            printf("Invalid Choice\n");
            break;
        }
    }
}

void insert_rear()
{
    int n;
    if (isFull())
    {
        printf("Queue is FULL\n");
        return;
    }
    printf("Enter number  : ");
    scanf("%d", &n);
    if (isEmpty())
        front = rear = 0;
    else
        rear++;
    Q[rear] = n;
}

void insert_front()
{
    int n;
    if (front == 0)
    {
        printf("No Space available in front.\n");
        return;
    }
    printf("Enter number  : ");
    scanf("%d", &n);
    if (isEmpty())
        front = rear = 0;
    else
        front--;
    Q[front] = n;
}

void delete_rear()
{
    if (isEmpty())
    {
        printf("Queue is Empty\n");
        return;
    }
    printf("Dequeued : %d\n", Q[rear]);
    if (front == rear)
        front = rear = -1;
    else
        rear--;
}

void delete_front()
{
    if (isEmpty())
    {
        printf("Queue is Empty\n");
        return;
    }
    printf("Dequeued : %d\n", Q[front]);
    if (front == rear)
        front = rear = -1;
    else
        front++;
}

void display()
{
    if (isEmpty())
    {
        printf("Queue is Empty\n");
        return;
    }
    printf("FRONT -> ");
    for (int i = front; i <= rear; i++)
        printf("%d -> ", Q[i]);
    printf("REAR\n");
}

int peek_front()
{
    if (!isEmpty())
        return Q[front];
    return -1;
}

int peek_rear()
{
    if (!isEmpty())
        return Q[rear];
    return -1;
}

int isEmpty()
{
    return (front == -1);
}

int isFull()
{
    return (rear == (SIZE - 1));
}