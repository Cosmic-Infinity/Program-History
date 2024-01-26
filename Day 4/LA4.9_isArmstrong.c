#include <stdio.h>

int main(){
	int n, length = 0, sum = 0;
	printf("Enter number : ");
	scanf("%d", &n);
	
	
	
	for(int i=n ; i>0 ; i=i/10)
		length++;
	for(int i=n ; i>0 ; i=i/10){
		int pow = 1;
		for(int k = 0; k<length; k++)
			pow*=(i%10);
		sum+=pow;
	}
	if(sum == n)
		printf("%d is Armstrong\n", n);
	else
		printf("%d is NOT Armstrong\n", n);
		
	return 0;
}
