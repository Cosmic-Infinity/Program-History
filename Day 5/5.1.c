#include <stdio.h>

int main(){
	int ar[10];
	int i;
	printf("Enter 10 elements : \n");
	for(i=0; i<10; i++)
		scanf("%d", &ar[i]);
		
	for(i=0; i<10; i++)
		printf("Element at index %d : %d\n", i, ar[i]);
	
	return 0;
	
	
}
