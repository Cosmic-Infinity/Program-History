//WAP to sort an array using Pointer.

#include <stdio.h>
void sort(int*, int);


int main(){
    
    int arr[100], size;
    printf("Enetr number of elements : ");
    scanf("%d",&size);
    for(int i=0; i<size; i++){
        printf("Enter element %d : ",i+1);
        scanf("%d",&arr[i]);
    }

    sort(arr, size);

    printf("Elements after sorting : \n");
    for(int i=0; i<size; i++){
        printf("Element %d : ",i+1);
        printf("%d\n",arr[i]);
    }

    return 0;
}

void sort(int *arr, int size){

    for(int i=0; i<size-1; i++){
        for(int j=i+1; j<size; j++){
            if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}