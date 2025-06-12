/*
Write a program to represent the polynomial equation of single variable using single linked
list and perform the addition of two polynomial equations
*/

#include <stdio.h>
#include <stdlib.h>

typedef struct node
{
    int coeff;
    int exp;
    struct node *next;
} node;
node *s1 = NULL, *s2 = NULL, *l1 = NULL, *l2 = NULL;
node *s3 = NULL, *l3 = NULL;

void create(node **, int, int);
void traverse(node *);

int main()
{
    int max1 = 0, max2 = 0, i = 0, n;
    printf("Polynomial 1 - \n");
    printf("Enter highest power of polynomial : ");
    scanf("%d", &max1);
    for (i = max1; i > -1; i--)
    {
        printf("Enter coefficent for degree %d : ", i);
        scanf("%d", &n);
        if (s1 == NULL)
        {
            s1 = (node *)malloc(sizeof(node));
            s1->exp = i;
            s1->coeff = n;
            s1->next = NULL;
            l1 = s1;
        }
        else
            create(&l1, n, i);
    }

    printf("Polynomial 2 - \n");
    printf("Enter highest power of polynomial : \n");
    scanf("%d", &max2);
    for (i = max2; i > -1; i--)
    {
        printf("Enter coefficent for degree %d : ", i);
        scanf("%d", &n);
        if (s2 == NULL)
        {
            s2 = (node *)malloc(sizeof(node));

            s2->coeff = n;
            s2->exp = i;
            s2->next = NULL;
            l2 = s2;
        }
        else
            create(&l2, n, i);
    }
    node *t1 = s1, *t2 = s2;
    while (t1 && t2)
    {
        if (t1->exp == t2->exp)
        {
            if (s3 == NULL)
            {
                s3 = (node *)malloc(sizeof(node));
                s3->coeff = t1->coeff + t2->coeff;
                s3->exp = t1->exp;
                s3->next = NULL;
                l3 = s3;
            }
            else
                create(&l3, t1->coeff + t2->coeff, t1->exp);
            t1 = t1->next;
            t2 = t2->next;
        }
        else if (t1->coeff > t2->coeff)
        {
            if (s3 == NULL)
            {
                s3 = (node *)malloc(sizeof(node));
                s3->coeff = t1->coeff;
                s3->exp = t1->exp;
                s3->next = NULL;
                l3 = s3;
            }
            else
                create(&l3, t1->coeff, t1->exp);
            t1 = t1->next;
        }
        else
        {
            if (s3 == NULL)
            {
                s3 = (node *)malloc(sizeof(node));
                s3->coeff = t2->coeff;
                s3->exp = t2->exp;
                s3->next = NULL;
                l3 = s3;
            }
            else
                create(&l3, t2->coeff, t2->exp);
            t2 = t2->next;
        }
    }
    while (t1)
    {
        create(&l3, t1->coeff, t1->exp);
        t1 = t1->next;
    }
    while (t2)
    {
        create(&l3, t2->coeff, t2->exp);
        t2 = t2->next;
    }
    traverse(s3);
    return 0;
}

void create(node **l, int n, int ex)
{
    node *temp = (node *)malloc(sizeof(node));
    temp->next = NULL;
    temp->coeff = n;
    temp->exp = ex;
    (*l)->next = temp;
    *l = temp;
}

void traverse(node *ptr)
{
    printf("Resultant Polynomial : \n");
    node *i = ptr;
    while (i->next)
    {
        printf("%dx^%d + ", i->coeff, i->exp);
        i = i->next;
    }
    printf("%dx^%d", i->coeff, i->exp);
}