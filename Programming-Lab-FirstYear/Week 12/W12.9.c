// Dynamically allocate the size of an array using calloc
//insert elements into the array, then print the elements.
//Change the size of the array
//get the new elements and print the array.
//Finally free the memory.

#include <stdio.h>
#include <stdlib.h>

int main(){

    int n, n1;
    printf("Enter array size : ");
    scanf("%d",&n);
    int *arr = (int*)calloc(n, sizeof(int));
    printf("Memory successfully allocated using calloc.\n");

    printf("Enter %d elements :\n", n);
    for(int i=0; i<n; i++)
        scanf("%d", &arr[i]);
        

    printf("New array size : \n");
    scanf("%d", &n1);
    arr = (int*)realloc(arr, sizeof(int)*n1);
    printf("Memory successfully reallocated using realloc.\n");

    printf("Enter %d more elements : ", n1-n);
    for(int i=n; i<n1; i++)
        scanf("%d", &arr[i]);

    printf("The elements of the array are : \n");
    for(int i=0; i<n1; i++)
        printf("%d ", arr[i]);

    free(arr);
    return 0;

    
}