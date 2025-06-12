//WAP to arrange the numbers stored in the array so that it will display first all odd numbers, then even numbers.

#include <stdio.h>

int main(){
	int i, x=0;
	int a[10], b[10];
	printf("Enter 10 elements : \n");
	for(i = 0; i<10; i++)
		scanf("%d", &a[i]);
		
	for(i=0; i<10; i++){
		if(a[i]%2 == 1)
			b[x++] = a[i];
	}
	
	for(i=0; i<10; i++){
		if(a[i]%2 == 0)
			b[x++] = a[i];
	}
	
	printf("Output : \n");
	for(i = 0; i<10; i++)
		printf("%d ", b[i]);
	
	return 0;
	
}
