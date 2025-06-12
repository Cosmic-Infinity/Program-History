//WAP to multiply two numbers using pointer

#include <stdio.h>
void multiply(int*, int*);

int main(){
    int a, b;
    printf("Enter a number : ");
    scanf("%d", &a);
    printf("Enter another number : ");
    scanf("%d", &b);
    multiply(&a, &b);
    printf("Product : %d",a);
    return 0;
}
void multiply(int* a, int* b){
    *a = *a * *b;
}