//WAP to find the largest element stored in an array of n elements by using dynamic memory allocation.

#include <stdio.h>
#include <stdlib.h>

int main(){
    int n;
    printf("Enter no. of elements : ");
    scanf("%d", &n);

    float *arr = (float*)malloc(sizeof(float)*n);

    for(int i=0; i<n; i++){
        printf("Enter number %d : ", i+1);
        scanf("%f", &arr[i]);
    }

    float max = arr[0];

    for(int i=0; i<n; i++){
        if(arr[i]>max)
            max = arr[i];
    }

    printf("Largest number is %.2f", max);
    return  0;
}