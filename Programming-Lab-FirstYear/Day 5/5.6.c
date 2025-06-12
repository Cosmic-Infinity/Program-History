//WAP to display the array elements in reverse order.

#include <stdio.h>

int main(){
	int i;
	int a[10];
	printf("Enter 10 elements : \n");
	for(i = 0; i<10; i++)
		scanf("%d", &a[i]);
		
	printf("\nReversed Order : \n");
	for(i=9; i>-1; i--){
		printf("%d ", a[i]);
	}
	
	return 0;
	
}
