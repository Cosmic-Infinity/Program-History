//WAP to find out the largest even integer stored in the array of n integers. n is the user input.

#include <stdio.h>

int main(){
	int n, i, max;
	printf("Enter size n : ");
	scanf("%d", &n);
	int a[n];
	printf("Enter %d integers : \n", n);
	for(i=0; i<n; i++)
		scanf("%d", &a[i]);
		
	max = a[0];
	for(i=0; i<n; i++){
		if(a[i] > max)
			max=a[i];
	}
	
	printf("Maximum : %d", max);
	
	return 0;
	
}
		
