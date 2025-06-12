// WAP to represent the polynomial of single variable using 1-D array and perform the addition of two polynomial equations.

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i, maxpol, *pol1, *pol2;
    printf("Enter highest power of polynomial : ");
    scanf("%d", &maxpol);
    pol1 = (int *)malloc((maxpol + 1) * sizeof(int));
    pol2 = (int *)malloc((maxpol + 1) * sizeof(int));
    printf("Enter coefficient for lowest to highest degree polynomial  ->\n");
    printf("Enter coefficient Polynomial 1 : ");
    for (i = 0; i <= maxpol; i++)
        scanf("%d", &pol1[i]);
    printf("Enter coefficient Polynomial 2 : ");
    for (i = 0; i <= maxpol; i++)
    {
        scanf("%d", &pol2[i]);
        pol1[i] = pol1[i] + pol2[i];
    }

    printf("%dx^%d", pol1[maxpol], maxpol);

    for (i = maxpol - 1; i >= 0; i--)
        printf(" + %dx^%d", pol1[i], i);
    return 0;
}