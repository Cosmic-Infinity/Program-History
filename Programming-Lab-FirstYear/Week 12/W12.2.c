//WAP to swap two numbers using call by reference.

#include <stdio.h>
void swap(int*, int*);

int main(){
    int a, b;
    printf("Enter value a : ");
    scanf("%d", &a);
    printf("Enter value b : ");
    scanf("%d", &b);
    swap(&a, &b);
    printf("After swap :\na = %d\nb = %d",a,b);
    return 0;

}

void swap(int* a, int* b){
    *a = *a+*b;
    *b = *a-*b;
    *a = *a-*b;
}