//  Write a menu driven program in C to create a structure to represent complex number as
//  real and imaginary compenents and preform the followign operation using function.
// 	i.	Additation of 2 complex numbers (using call by value)
// 	ii.	Multiplication of 2 complex numbers (call by address)

#include <stdio.h>

typedef struct num
{
    int real, imaginary;
} number;

void add(number a, number b);
void multiply(number *a, number *b);

int main()
{

    int choice;
    number a, b;

    printf("Enter real and imaginary components of the FIRST number separated by space\n");
    scanf("%d", &a.real);
    scanf("%d", &a.imaginary);
    printf("Enter real and imaginary components of the SECOND number separated by space\n");
    scanf("%d", &b.real);
    scanf("%d", &b.imaginary);
    printf("Enter choice 1 addition, 2 for multiplication\n");
    scanf("%d", &choice);

    switch (choice)
    {
    case 1:
        printf("\nAddition : ");
        add(a, b);
        break;
    case 2:
        printf("\nMultiplication : ");
        multiply(&a, &b);
        printf("%d + %di", a.real, a.imaginary);
        break;
    default:
        printf("INVALID choice");
    }

    return 0;
}

void add(number a, number b)
{
    printf("%d + ", a.real + b.real);
    printf("%di", a.imaginary + b.imaginary);
}

void multiply(number *a, number *b)
{
    a->real = a->real * b->real;
    a->imaginary = a->imaginary * b->imaginary;
}