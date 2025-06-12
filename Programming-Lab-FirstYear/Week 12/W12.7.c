//WAP to compute the sum of all elements in an array using dynamic memory allocation.

#include <stdio.h>
#include <stdlib.h>
void summing(int*, int*, int);

int main(){
    int *arr;
    int size, sum, i;
    printf("No. of elements : ");
    scanf("%d",&size);
    arr = (int*)malloc(size*sizeof(int));
    for(int i=0; i<size; i++)
        scanf("%d",&arr[i]);
    summing(arr, &sum , size);
    printf("Sum = %d", sum);

    return 0;
    
}

void summing(int* arr, int* sum, int size){
    *sum=0; int i;
    for(i=0; i<size; i++)
        *sum += arr[i];
}