//WAP to swap the pair of elements starting from beginning.

#include <stdio.h>

int main(){
	int i;
	int a[10];
	printf("Enter 10 integers : \n");
	
	for(i=0; i<10; i++)
		scanf("%d", &a[i]);
		
	for(i=0; i<9; i++){
		a[i] = a[i] + a[i+1];
		a[i+1] = a[i] - a[i+1];
		a[i] = a[i] - a[i+1];
	}
	
	printf("Output : \n");
	for(i=0; i<10; i++)
		printf("%d ", a[i]);
	
	return 0;
	
}
		
