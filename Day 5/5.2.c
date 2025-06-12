//WAP to store max. 100 numbers into an array. Print all the elements that are three digit even integers.

#include <stdio.h>

int main(){
	int a[100];
	int i=0;
	
	printf("Enter 10 numbers : \n");
	for(i=0; i<10; i++)
		scanf("%d", &a[i]);
		
	printf("All 3 digit even integers are : \n");
	for(i = 0; i<10; i++)
	{
		if(a[i] > 99 && a[i] < 999 && a[i]%2==0)
			printf("%d ", a[i]);
	}
	
	return 0;
}
