//WAP to compute the sum of all elements in an array using pointer

#include <stdio.h>
void summing(int*, int*, int);

int main(){
    int arr[5];
    int sum, i;
    printf("Enter 5 elements : \n");
    for(int i=0; i<5; i++)
        scanf("%d",&arr[i]);

    summing(arr, &sum , 5);
    printf("Sum = %d", sum);

    return 0;
    
}

void summing(int* arr, int* sum, int size){
    *sum=0; int i;
    for(i=0; i<size; i++)
        *sum += arr[i];
}